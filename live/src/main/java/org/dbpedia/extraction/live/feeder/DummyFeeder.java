package org.dbpedia.extraction.live.feeder;

import org.dbpedia.extraction.live.queue.LiveQueueItem;
import org.dbpedia.extraction.live.queue.LiveQueuePriority;
import org.dbpedia.extraction.live.util.DateUtil;
import sun.util.calendar.LocalGregorianCalendar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

/**
 * Created by Stephan on 05.05.2016.
 */
public class DummyFeeder extends Feeder {
    public DummyFeeder(String feederName, LiveQueuePriority queuePriority, String defaultStartTime, String folderBasePath) {
        super(feederName, queuePriority, "2016-05-05T14:03:00Z", folderBasePath);
    }

    @Override
    protected void initFeeder() {
        // Do nothing
    }

    @Override
    protected Collection<LiveQueueItem> getNextItems() {
        Collection<LiveQueueItem> returnValue = new ArrayList<LiveQueueItem>(1);
        returnValue.add(new LiveQueueItem(3354, Calendar.getInstance().getTime().toString()));
        return returnValue;
    }
}
