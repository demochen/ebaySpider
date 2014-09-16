package com.ebay.ebay_develop;

import java.io.IOException;
import java.util.Date;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class Img 
{
    public static void main( String[] args ) throws IOException
    {
       
        String ISAPI="http://feedback.ebay.com/ws/eBayISAPI.dll?ViewFeedback2&userid=";
        String userid="watchgrabber";
        String itemid="171124220716";
        String  middle="&&_trksid=p2047675.l2560&rt=nc&iid=";
        String back="&sspagename=VIP:feedback&ftab=FeedbackAsSeller";
      
        String url=ISAPI+userid+middle+itemid+back;
        System.out.println(url);
        Document doc=Jsoup.connect(url).get();
  
      Element masthead = doc.select("table.FbOuterYukon").get(0);
      Elements tr=masthead.select("tr");
      long statt=new Date().getTime();
      Elements attitude=masthead.select("td>img");
         int i=0;
       for(Element e:attitude){
    	    i++;
    	   System.out.println(e.attr("alt").toString());
       }
		System.out.println(i);
    }
}
    
