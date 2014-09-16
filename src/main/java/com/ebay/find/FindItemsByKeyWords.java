
package com.ebay.find;


import java.util.ArrayList;
import java.util.List;

import com.ebay.init.ClientConfigInit;
import com.ebay.services.client.FindingServiceClientFactory;
import com.ebay.services.finding.FindItemsByCategoryRequest;
import com.ebay.services.finding.FindItemsByCategoryResponse;
import com.ebay.services.finding.FindItemsByKeywordsRequest;
import com.ebay.services.finding.FindItemsByKeywordsResponse;
import com.ebay.services.finding.FindingServicePortType;
import com.ebay.services.finding.PaginationInput;
import com.ebay.services.finding.SortOrderType;


public class FindItemsByKeyWords {

	
	   static ClientConfigInit config;
	   static FindingServicePortType serviceClient;
	  	
		public FindItemsByKeyWords(){
	  		
	  		 config=new ClientConfigInit();
	  		serviceClient = FindingServiceClientFactory.getServiceClient(config.getConfig());
	  	}
   
  
    public FindItemsByKeywordsResponse FindItemByKeywords(String keywords,Integer entriesperpage,Integer pagenumber){
        
        FindItemsByKeywordsRequest request = new FindItemsByKeywordsRequest();
        request.setKeywords(keywords);
        PaginationInput pi = new PaginationInput();
        pi.setEntriesPerPage(entriesperpage);
        pi.setPageNumber(pagenumber);
        request.setPaginationInput(pi);
        request.setSortOrder(SortOrderType.BEST_MATCH);
        FindItemsByKeywordsResponse result = serviceClient.findItemsByKeywords(request);
    	return result;
    
    }
    
   public FindItemsByKeywordsResponse FindItemByKeywords(String keywords,Integer entriesperpage,Integer pagenumber,SortOrderType sorttype){
        
        FindItemsByKeywordsRequest request = new FindItemsByKeywordsRequest();
        request.setKeywords(keywords);
        PaginationInput pi = new PaginationInput();
        pi.setEntriesPerPage(entriesperpage);
        pi.setPageNumber(pagenumber);
        request.setPaginationInput(pi);
        request.setSortOrder(sorttype);
        FindItemsByKeywordsResponse result = serviceClient.findItemsByKeywords(request);
    	return result;
    
    }
    public FindItemsByCategoryResponse  finditemsbycategory(Integer categoryid,Integer entriesperpage,Integer pagenumber,String sorttype){
    	FindItemsByCategoryRequest request=new FindItemsByCategoryRequest();
    	List<String> list=new ArrayList<String>();
    	list.add(categoryid.toString());
    	SortOrderType value=null;
    	if(sorttype!=null){
    		try {
    			 value=SortOrderType.fromValue(sorttype);
    			}catch (IllegalArgumentException e){
                  System.out.println("ai tai lei le");
    				value=SortOrderType.BEST_MATCH;
    			}
    		request.setSortOrder(value);
    	}
    		
    	PaginationInput pi = new PaginationInput();
        pi.setEntriesPerPage(entriesperpage);
        pi.setPageNumber(pagenumber);
        request.setPaginationInput(pi);
        request.setCategoryId(list);
        FindItemsByCategoryResponse response=serviceClient.findItemsByCategory(request);
        return response;
    	
    }
}

