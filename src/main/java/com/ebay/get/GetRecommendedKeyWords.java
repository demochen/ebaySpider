package com.ebay.get;

import com.ebay.init.ClientConfigInit;
import com.ebay.services.client.FindingServiceClientFactory;
import com.ebay.services.finding.FindingServicePortType;
import com.ebay.services.finding.GetSearchKeywordsRecommendationRequest;
import com.ebay.services.finding.GetSearchKeywordsRecommendationResponse;

public class GetRecommendedKeyWords {

	/**
	 * @param args
	 */
   static ClientConfigInit config;
  	
	public GetRecommendedKeyWords(){
  		
  		 config=new ClientConfigInit();
  	}
	
	public GetSearchKeywordsRecommendationResponse getsearchkeywords(String value){
    	FindingServicePortType serviceClient = FindingServiceClientFactory.getServiceClient(config.getConfig());
    	GetSearchKeywordsRecommendationRequest request=new GetSearchKeywordsRecommendationRequest();
    	request.setKeywords(value);
    	GetSearchKeywordsRecommendationResponse response=serviceClient.getSearchKeywordsRecommendation(request);
    	System.out.println(response.getKeywords());
    	return response;
	}

}
