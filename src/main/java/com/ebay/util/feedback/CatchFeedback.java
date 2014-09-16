package com.ebay.util.feedback;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CatchFeedback {
   
	static String Isapi="http://feedback.ebay.com/ws/eBayISAPI.dll?ViewFeedback2&userid=";
	static String  back="&&sspagename=VIP:feedback&ftab=FeedbackAsSeller";
	public  String combineUrl(String userid){
		    String url=Isapi+userid+back; 
	         return url;
	}
	
	public String combineUrl(String userid,int perpage,int pagenumber){
		String url=Isapi+userid+"&items="+perpage+"&page="+pagenumber;
		return url;
	}
	
	public List<String> preInfo(String url) throws IOException{
		System.setProperty("sun.net.client.defaultConnectTimeout", String.valueOf(10000));
	    System.setProperty("sun.net.client.defaultReadTimeout", String.valueOf(10000)); 
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
	
		public Map<String,List<String>> ToInfo(String url){
			Map<String,List<String>> map=new HashMap<String,List<String>>();
			List<String> prefeedInfo=new ArrayList<String>();
			List<String> attitude=new ArrayList<String>(); 
			System.setProperty("sun.net.client.defaultConnectTimeout", String.valueOf(10000));
		    System.setProperty("sun.net.client.defaultReadTimeout", String.valueOf(10000)); 
			  Document doc;
			try {
				doc = Jsoup.connect(url).get();
				  Element masthead = doc.select("table.FbOuterYukon").get(0);
			      Elements tr=masthead.select("tr");
			      Elements attitudes=masthead.select("td>img");
			      for(Element e:attitudes){
			    	  attitude.add(e.attr("alt").toString());
			      }
			      ListIterator<Element> list=tr.listIterator();
			      int count=0;
				  while(list.hasNext()){
				  Elements tds=list.next().select("td");
				  count++;
				  String s="start";
				  for(int i=1;i<4;i++){
					   s=s+"|"+tds.get(i).text().toString(); 
				  }
				  prefeedInfo.add(s);
				  System.out.println(s);
				  }
				  map.put("Attitude", attitude);
				  map.put("FeedInfo", prefeedInfo);
			} catch (Exception e1) {
			    map=null;
			}
		    
		      return map;
		}
	
  
	
}
