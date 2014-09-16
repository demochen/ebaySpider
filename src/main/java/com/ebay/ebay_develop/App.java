package com.ebay.ebay_develop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App 
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
        System.setProperty("sun.net.client.defaultConnectTimeout", String  
                .valueOf(10000));// （单位：毫秒）  
        System.setProperty("sun.net.client.defaultReadTimeout", String  
                .valueOf(10000)); //
        Document doc=Jsoup.connect(url).get();
  
      Element masthead = doc.select("table.FbOuterYukon").get(0);
      Elements tr=masthead.select("tr");
      long statt=new Date().getTime();
//      Elements attitude=masthead.select("td>img");
//    
//       for(Element e:attitude){
//    	 
//    	   System.out.println(e.attr("alt"));
//       }
		List<String> prefeedInfo=new ArrayList<String>();

      ListIterator<Element> list=tr.listIterator();
	  while(list.hasNext()){
	  Elements tds=list.next().select("td");
	  String s="start";
	  for(int i=1;i<4;i++){
		 s=s+"|"+tds.get(i).text().toString(); 
		    }
	  prefeedInfo.add(s);
	  }
	  int i=0;
	  for(String s:prefeedInfo){
		i++;
		System.out.println(s);
	  }
	  System.out.println(i);
//     ListIterator<Element> list=	tr.listIterator();
//	  while(list.hasNext()){
//     // System.out.println(list.next().text().toString());  
//	  Elements tds=list.next().select("td");
//	  for(int i=1;i<tds.size();i++){
//		
//		  System.out.println(tds.get(i).text());
//	  }
//	  }
 long end=new Date().getTime();
 System.out.println(end-statt);
        
    }
}
    
