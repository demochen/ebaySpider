package com.ebay.util.seller;

import com.ebay.domain.seller.RecentFeedbackratings;
import com.ebay.domain.seller.Seller;
import com.ebay.domain.seller.SellerImpl;
import com.ebay.util.feedback.Util;

public class ConvertStruct {

	public RecentFeedbackratings Convert(String info,String sellername){
		//Todo panduan shi fou wei kong
		RecentFeedbackratings rates=new RecentFeedbackratings();
		if(info!=""){
		String[] infos=info.split(";");
		rates.setSellerName(sellername);
		rates.setOne_Positive(Integer.parseInt(infos[0]));
		rates.setSix_Positive(Integer.parseInt(infos[1]));
		rates.setTwe_Positive(Integer.parseInt(infos[2]));
		rates.setOne_Neutral(Integer.parseInt(infos[3]));
		rates.setSix_Neutral(Integer.parseInt(infos[4]));
		rates.setTwe_Neutral(Integer.parseInt(infos[5]));
		rates.setOne_Negative(Integer.parseInt(infos[6]));
		rates.setSix_Negative(Integer.parseInt(infos[7]));
		rates.setTwe_Negative(Integer.parseInt(infos[8]));
		}
		return rates;
	}
	
	public Seller ConvertSeller(String info,String sellername){
		Seller seller=new SellerImpl(); 
		if(info!=""){
		String[] infos=info.split(";");
	    seller.setSellerName(sellername);
	    seller.setCountry(infos[2]);
	    seller.setSinceDate(Util.dealCreateDate(infos[1]));
	    seller.setStar(Integer.parseInt(infos[0].trim()));
		}
		return seller;
	}
}
