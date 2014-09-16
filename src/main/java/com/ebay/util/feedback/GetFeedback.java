package com.ebay.util.feedback;

public class GetFeedback {
   
	static String Isapi="http://feedback.ebay.com/ws/eBayISAPI.dll?ViewFeedback2&userid=";
	static String  back="&&sspagename=VIP:feedback&ftab=FeedbackAsSeller";
	
	public  String combineUrl(String userid){
		    String url=Isapi+userid+back; 
	         return url;
	}
	
	
	

	
}
