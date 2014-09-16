package com.ebay.ebay_develop;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ebay.domain.feedback.FeedBack;
import com.ebay.util.feedback.CatchFeedbackPlus;
import com.ebay.util.feedback.DealFeedback;

public class Test_FeedBack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CatchFeedbackPlus feedback=new CatchFeedbackPlus();
		String sellername="ctcycleparts";
		 Map<String,List<String>> map=new HashMap<String,List<String>>();
		 List<String> attitude = new ArrayList<String>();
	     List<String> feedinfo =new ArrayList<String>();
	     map=feedback.realInfo(sellername);
		 Map<String, List> combine = new HashMap<String, List>();
		 combine=DealFeedback.StructInfo(map, sellername);
		 List<FeedBack> feedinfo1 = combine.get("FEEDBACK");
		 System.out.println("success");
//		long start=new Date().getTime();
//	    for(int i=1;i<3;i++){
//	    String url=feedback.combineUrl(sellername, 200, i);
//		map=feedback.ToInfo(url);
//		attitude.addAll(map.get("Attitude"));
//		feedinfo.addAll(map.get("FeedInfo"));
//	    }
//	    map.put("Attitude", attitude);
//		map.put("FeedInfo", feedinfo);
//		long end=new Date().getTime();
//		System.out.println(end-start);
//	    Map<String,List<String>> map=new HashMap<String,List<String>>();
//	    Map<String, List> combine = new HashMap<String, List>();
//	    DealFeedback deal=new DealFeedback();
//		map=feedback.ToInfo(url);
//		combine=DealFeedback.StructInfo(map, sellername);
//		if(!combine.isEmpty()){
//		List<FeedBack> feedinfo = combine.get("FEEDBACK");
//		System.out.println(feedinfo.size());
//		}
		
		}

}
