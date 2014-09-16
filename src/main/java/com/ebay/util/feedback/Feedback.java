package com.ebay.util.feedback;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Feedback {
   
	static String Isapi="http://feedback.ebay.com/ws/eBayISAPI.dll?ViewFeedback2&userid=";
	static String  back="&&sspagename=VIP:feedback&ftab=FeedbackAsSeller";
	public  String combineUrl(String userid){
		    String url=Isapi+userid+back; 
	         return url;
	}
	
	public List<String> preInfo(String url) throws IOException{
		List<String> prefeedInfo=new ArrayList<String>();
		 Document doc=Jsoup.connect(url).get();
	      Element masthead = doc.select("table.FbOuterYukon").get(0);
	       Elements tr=masthead.select("tr");
	      ListIterator<Element> list=tr.listIterator();
		  while(list.hasNext()){
		  Elements tds=list.next().select("td");
		  String s="start";
		  for(int i=1;i<4;i++){
			 s=s+";"+tds.get(i).text().toString(); 
			    }
		  prefeedInfo.add(s);
		  }
	    	return prefeedInfo;
	}
	
	

	
}
