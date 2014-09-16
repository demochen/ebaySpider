package com.ebay.util.seller;

import java.io.IOException;
import java.net.Socket;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CatchSellerInfo {
    private final static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CatchSellerInfo.class);
	static String Isapi = "http://feedback.ebay.com/ws/eBayISAPI.dll?ViewFeedback2&userid=";
	public static String Combineurl(String sellername) {
		String url = Isapi + sellername;
		return url;
	}

	public  String preCountInfo(String url) {
		System.setProperty("sun.net.client.defaultConnectTimeout",String.valueOf(10000));
		System.setProperty("sun.net.client.defaultReadTimeout",String.valueOf(10000));
		String count="";
		try {
			
			Document doc = Jsoup.connect(url).get();
			Elements tests=doc.select("div.frp");
			if(tests.size()!=0){
			Element rating = doc.select("div.frp").get(0);
			Elements rates = rating.select("tr.fbsSmallYukon");
			for (int i = 0; i < 3; i++) {
				Elements counts = rates.get(i).select("td#RFRId");
				for (int j = 0; j < 3; j++) {
					count= count+counts.get(j).text();
					count=count+";";
				}
			}
			}
		} catch (IOException e) {
			count=null;
			log.info("preCountInfo EOOR ---------"+e.getMessage()+e.getCause());
		}
		return count;
	}
    
	public String preSellerInfo(String url){
		System.setProperty("sun.net.client.defaultConnectTimeout",String.valueOf(20000));
		System.setProperty("sun.net.client.defaultReadTimeout",String.valueOf(20000));
		String sellerInfo="";
		 try {
			 Document doc=Jsoup.connect(url).get();
			 Elements tests=doc.select("td#memberBadgeId");
			 if(tests.size()!=0){
			 Element masthead = doc.select("td#memberBadgeId").get(0);
			 Element member=masthead.select("span.mbg-l").get(0);
			 Element date=doc.select("span.ds2arial13color3").get(0);
			 sellerInfo=member.text()+date.text();
			 sellerInfo=dealSellerInfo(sellerInfo);
			}
		 }
		 catch (IOException e) {
	        log.info("preCountInfo EOOR ---------"+e.getMessage()+e.getCause());
			//e.printStackTrace();
		}
		return sellerInfo;
	}
	
	public String dealSellerInfo(String uninfo){
		String construct="";
		int c=uninfo.indexOf(")");
		String sum=uninfo.substring(2,c);
		construct=sum;
		uninfo=uninfo.substring(c+1,uninfo.length());
		String s1[]=uninfo.split(" in ");
		for(int i=0;i<s1.length;i++){
			construct=construct+";"+s1[i];
		}
		return construct;
	}
}
