package com.ebay.util.feedback;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CatchFeedbackPlus {
   
	static String Isapi="http://feedback.ebay.com/ws/eBayISAPI.dll?ViewFeedback2&userid=";
	static String  back="&&sspagename=VIP:feedback&ftab=FeedbackAsSeller";
	
	public  static String combineUrl(String userid){
		     String url=Isapi+userid+back; 
	         return url;
	}
	
	public String combineUrl(String userid,int perpage,int pagenumber){
		String url=Isapi+userid+"&items="+perpage+"&page="+pagenumber+back;
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

	public static int[]  sumFeedBack(String url){
		int feedback[]={1,0};  
		long start=new Date().getTime();
		try {
			Document doc=Jsoup.connect(url).get();
			Elements presumpage=doc.select("span.pg-cw");
			Element sumpage=presumpage.first().child(1);
			String spagecount=sumpage.text().toString();
			String count[]=spagecount.split(" ");
			int pagecount=Integer.parseInt(count[1]);
		    feedback[0]=pagecount;
		    Element masthead = doc.select("table.FbOuterYukon").get(0);
		    Elements tr=masthead.select("tr");
		    if(tr.size()>=50){
		    feedback[1]=pagecount*25;
		    }
		    long end=new Date().getTime(); 
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		return feedback;
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
			      int count=1;
			      do{
			    	 if(tr.get(count).className().equals("")&&tr.get(count).childNodeSize()==4&&tr.get(count+1).className().equals("bot")){
			    		  Elements tds=tr.get(count).select("td");
			    		  String alt=tds.get(0).childNode(0).attr("alt");
			    		  if(alt!=null){
			    		  attitude.add(alt);
			    			String s="start";
			    		  for(int m=1;m<4;m++){
			    			  s=s+"|"+tds.get(m).text().toString(); 
			    		  }
			    		  prefeedInfo.add(s);
			    		  Elements tds1=tr.get(count+1).select("td");
			    			String s1="start";
			    		  for(int m=1;m<3;m++){
			    			  Elements priceException=tds1.get(m).select("div[style]");
			    			  if(priceException.size()==0){
								   s1=s1+"|"+tds1.get(m).text().toString(); 
								  }else{
									  s1=s1+"|"+priceException.get(0).text().toString();
								  }
			    		  }
			    		  prefeedInfo.add(s1);
			    		  }
			    		  count=count+2;
			    	   }else if(tr.get(count).className().equals("fbOuterAddComm")||(tr.get(count).className().equals("")&&tr.get(count+1).className().equals(""))){
			    		   count=count+3;
			    	   }
			    	
			      }while(count<tr.size());
				  map.put("Attitude", attitude);
				  map.put("FeedInfo", prefeedInfo);
			} catch (Exception e1) {
			    map=null;
			   e1.printStackTrace();
			}
		      return map;
		}
	
    public  Map<String,List<String>> realInfo(String sellername){
    	Map<String,List<String>> map=new HashMap<String,List<String>>();
		 List<String> attitude = new ArrayList<String>();
	     List<String> feedinfo =new ArrayList<String>();
	     String trl=combineUrl(sellername);
	 	 int sum=CatchFeedbackPlus.sumFeedBack(trl)[1];
	 	 if(sum>0&&sum<1000){
	 		 int i=sum%200;
	 		 for(int j=1;j<=i;j++){
	 			 String url=combineUrl(sellername, 200, j);
	 			 map=ToInfo(url);
	 			attitude.addAll(map.get("Attitude"));
	 			feedinfo.addAll(map.get("FeedInfo"));
	 		 }
	 	    map.put("Attitude", attitude);
	 		map.put("FeedInfo", feedinfo);
	 	 }else if(sum>=1000){
	 		 for(int j=1;j<=5;j++){
	 			String url=combineUrl(sellername, 200, j);
	 			//System.out.println(url);
	 			map=ToInfo(url);
	 			attitude.addAll(map.get("Attitude"));
	 			feedinfo.addAll(map.get("FeedInfo"));
	 		 }
	 	    map.put("Attitude", attitude);
	 		map.put("FeedInfo", feedinfo); 
	 	 }else{
	 		 map=null;
	 	 }
	 		 
    	return map;
    	
    }
	
}
