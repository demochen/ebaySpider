package com.ebay.ebay_develop;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.ebay.util.seller.CatchSellerInfo;

public class Test_CatchSeller {

	/**
	 * @param args
	 * chen lin lin
	 */
	static String Isapi="http://feedback.ebay.com/ws/eBayISAPI.dll?ViewFeedback2&userid=";
	
	public static void main(String[] args) {
		//String s="( 3045)May-26-09 in Hong Kong";
    String sellerinfo="";
    CatchSellerInfo catch1=new CatchSellerInfo();
    String url=catch1.Combineurl("rayskillmanauto");
    System.out.println(url);
	String s=Test_CatchSeller.GetRates("rayskillmanauto");
	String s1=catch1.preCountInfo(url);
	System.out.println(s);
	System.out.println(s1);
	}
	
	public static String GetRates(String userid){
		String url=Isapi+userid;
		String count="";
		try {
			 Document doc=Jsoup.connect(url).get();
			 Elements tests=doc.select("div.frp");
			 if(tests.size()!=0){
			 Element rating=doc.select("div.frp").get(0);
			 Elements rates=rating.select("tr.fbsSmallYukon");
			 for(int i=0;i<3;i++){
				Elements counts=rates.get(i).select("td#RFRId");
				for(int j=0;j<3;j++){
					 count=count+counts.get(j).text();
					 count=count+";";
				}
			 }
			 }
		} catch (IOException e) {
			
		}
		return count;
	}
	
	public static String CatchSellerInfo(String sellername){
		String url=Isapi+sellername;
		String sellerInfo="";
		 try {
			 Document doc=Jsoup.connect(url).get();
			 Elements tests=doc.select("td#memberBadgeId");
			 if(tests.size()!=0){
			 Element masthead = doc.select("td#memberBadgeId").get(0);
			 Element member=masthead.select("span.mbg-l").get(0);
			 Element date=doc.select("span.ds2arial13color3").get(0);
			 sellerInfo=member.text()+date.text();
			 System.out.println(sellerInfo);
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sellerInfo;
	}
}
