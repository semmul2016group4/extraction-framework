package org.dbpedia.extraction.live.helper;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.dbpedia.extraction.live.storage.JDBCUtil;

import java.util.Collections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.*;

/**
 * @author Lukas Faber, Stephan Haarmann, Sebastian Serth
 * date 30.06.2016.
 */
public class RCStatisticsLogger {

    private static Set<String> stringAttributes = new HashSet<>();
    private static Set<String> numberAttributes = new HashSet<>();
    private static Set<String> booleanAttributes = new HashSet<>();
    private static Set<String> objectAttributes = new HashSet<>();

    static {
        Collections.addAll(stringAttributes,"id", "type", "comment", "user",
            "server_url", "title", "server_name", "server_script_path", "wiki", "log_type",
            "log_action", "log_action_comment");
        Collections.addAll(numberAttributes, "namespace", "timestamp", "log_id",
            "added_triples, deleted_triples, unchanged_triples");
        Collections.addAll(booleanAttributes, "bot", "minor", "patrolled");
        Collections.addAll(objectAttributes, "length", "revision");
    }

    public static void invalidateUnfinishedEntries(){
        String update = "UPDATE dbpedia_live_cache.rcstatistics SET added_triples=-1, deleted_triples=-1, unmodified_triples=-1";
    }

    public static void saveFullInformationSet(JsonObject rcEvent){
        String insert = "INSERT INTO dbpedia_live_cache.rcstatistics(%1) VALUES(%2)";
        /*String insert = "INSERT INTO dbpedia_live_cache.rcstatistics(ID, TYPE, NAMESPACE, TITLE, " +
                        "COMMENT, TIMESTAMP, USER, BOT, SERVER_URL, SERVER_NAME, " +
                        "SERVER_SCRIPT_PATH, WIKI, MINOR, PATROLLED, LENGTH_OLD," +
                        "LENGTH_NEW, REVISION_OLD, REVISION_NEW, LOG_ID, LOG_TYPE, " +
                        "LOG_ACTION, LOG_PARAMS, LOG_ACTION_COMMENT)" +
                        "VALUES(%s,%s,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";*/
        for (Map.Entry<String, JsonElement> s : rcEvent.entrySet()){
            if(!s.getValue().isJsonNull()) {
                if (stringAttributes.contains(s.getKey())) {
                    insert = insert.replace("%1", s.getKey().toUpperCase() + ",%1");
                    insert = insert.replace("%2", "'" + s.getValue().getAsString().replace("'","''") + "',%2");
                }
                if (numberAttributes.contains(s.getKey())) {
                    insert = insert.replace("%1", s.getKey().toUpperCase() + ",%1");
                    insert = insert.replace("%2", s.getValue().getAsInt() + ",%2");
                }
                if (booleanAttributes.contains(s.getKey())) {
                    insert = insert.replace("%1", s.getKey().toUpperCase() + ",%1");
                    insert = insert.replace("%2", s.getValue().getAsBoolean() + ",%2");
                }
                if (objectAttributes.contains(s.getKey())) {
                    JsonObject object = (JsonObject) s.getValue();
                    if (!object.get("old").isJsonNull()) {
                        insert = insert.replace("%1", (s.getKey() + "_old").toUpperCase() + ",%1");
                        insert = insert.replace("%2", object.get("old").getAsInt() + ",%2");
                    }
                    insert = insert.replace("%1", (s.getKey() + "_new").toUpperCase() + ",%1");
                    insert = insert.replace("%2", object.get("new").getAsInt() + ",%2");
                }
            }
        }
        insert = insert.replace(",%1", "");
        insert = insert.replace(",%2", "");
        JDBCUtil.execPrepared(insert, new String[]{});
    }

    private static void setOptionalPrimitive(PreparedStatement stmt, int position, Object value, int sqlType) throws SQLException {
        if(value != null){
            switch (sqlType){
                case Types.BOOLEAN: {stmt.setBoolean(position, (Boolean) value); break;}
                case Types.INTEGER: {stmt.setInt(position, (Integer) value); break;}
            }
        } else{ stmt.setNull(position, sqlType);}
    }

    public static void addTripleChanges(String title, int added, int deleted, int unmodified){
        String update = "UPDATE dbpedia_live_cache.rcstatistics a " +
            "INNER JOIN " +
            "   (SELECT title, min(timestamp) as timestamp from dbpedia_live_cache.rcstatistics " +
            "   WHERE title = '%s' and added_triples is null) b " +
            "SET added_triples = %d," +
            "deleted_triples = %d, " +
            "unchanged_triples = %d " +
            "WHERE a.timestamp = b.timestamp " +
            "AND a.title = b.title";
        update = String.format(update, title.replace("'","''"), added, deleted, unmodified);
        JDBCUtil.execPrepared(update, new String[]{});
    }
}
