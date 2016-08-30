import java.net.{URL, URLEncoder}

import org.json.{JSONArray, JSONException, JSONObject}
import java.util.{Date, Scanner}

object CommonsTemplateUsage {
  var commons = true;
  var titlesCount: Int = 0

  def main(args: Array[String]) {
    println(new Date())
    val queryUrl = "https://en.wikipedia.org/w/api.php?action=query&format=json&list=allpages&aplimit=500&apnamespace=0&continue=%s&apcontinue=%s&redirects"
    val queryUrlCommons = "https://commons.wikimedia.org/w/api.php?action=query&format=json&list=allpages&aplimit=500&apnamespace=0&continue=%s&apcontinue=%s&redirects"
    var continueString = "-||"
    var continueTitle = "A"
    var jsonResponse: JSONObject = null
    var titles: Set[Array[String]] = Set()
    var titlesWithCommonsCount = 0
    var j: Int = 0
    do {
      j += 1
      var url = new URL("http://example.org")
      if (commons) {
        url = new URL(String.format(queryUrlCommons, continueString, continueTitle))
      }else{
        url = new URL(String.format(queryUrl, continueString, continueTitle))
      }
      val responseStream = url.openConnection().getInputStream()
      val scan = new java.util.Scanner(responseStream).useDelimiter("\\A")
      jsonResponse = new JSONObject(scan.next())
      val pages: JSONArray = jsonResponse.getJSONObject("query").getJSONArray("allpages")
      var titlesCluster: Array[String] = new Array[String](_length = 50)

      for (i <- 1 to pages.length()) {
        if (i % 50 == 0) {
          titles += titlesCluster
          titlesCluster = new Array[String](_length = 50)
        }
        val page: JSONObject = pages.getJSONObject(i - 1)
        titlesCluster((i - 1) % 50) = page.getString("title")
        titlesCount += 1
      }
      titles += titlesCluster
      if (jsonResponse.has("continue")) {
        continueTitle = URLEncoder.encode(jsonResponse.getJSONObject("continue").getString("apcontinue"), "UTF-8")
        continueString = jsonResponse.getJSONObject("continue").getString("continue")
      }
    } while (jsonResponse.has("continue") && j <= 9999)
    println(titlesCount)
    println(new Date())
    val commonsPagesCount = titles.toList.par.map(hasCommonsTemplate).toList.sum
    println(titlesCount)
    println(commonsPagesCount)
    println(new Date())
  }

  def hasCommonsTemplate(titlesBatch: Array[String]) : Int = {
    val titles = titlesBatch.mkString("|")
    var url = new URL("http://example.org")
    val queryTemplatesUrl = String.format("https://en.wikipedia.org/w/api.php?action=query&prop=templates&format=json&tllimit=500&titles=%s", titles.replace(" ", "_"))
    val queryTemplatesUrlCommons = String.format("https://commons.wikimedia.org/w/api.php?action=query&prop=templates&format=json&tllimit=500&titles=%s", titles.replace(" ", "_"))
    if (commons) {
      url = new URL(queryTemplatesUrlCommons)
    }else{
      url = new URL(queryTemplatesUrl)
    }
    val responseStream = url.openConnection().getInputStream()
    val scan = new Scanner(responseStream).useDelimiter("\\A")
    var i = 0
    try {
      var commonsTemplateUsageCount = 0
      val test = scan.next()
      //println(test)
      val pages = new JSONObject(test).getJSONObject("query").getJSONObject("pages")
      val pageIds = pages.keys()
      while (pageIds.hasNext) {
        var page: JSONObject = pages.getJSONObject(pageIds.next().asInstanceOf[String])
        if (page.has("templates")) {
          val templates = page.getJSONArray("templates")
          var hasCommons = false
          while (i < templates.length() && !hasCommons) {
            if(commons) {
              hasCommons = templates.getJSONObject(i).get("title").equals("Template:VN")
            }else{
              hasCommons = templates.getJSONObject(i).get("title").equals("Template:Commons")
            }
            if(templates.getJSONObject(i).get("title").equals("Template:Redirect template")){
              println(page.getString("title") + " is a redirect")
              titlesCount -= 1
            }
            i += 1
          }
          if (hasCommons) {
            commonsTemplateUsageCount += 1
          }
        }
      }
      commonsTemplateUsageCount
    } catch {
      case e: JSONException => e.printStackTrace()
        0
    }
  }
}
