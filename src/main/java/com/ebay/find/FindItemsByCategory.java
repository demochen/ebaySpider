package com.ebay.find;

import java.util.ArrayList;
import java.util.List;

import com.ebay.init.ClientConfigInit;
import com.ebay.services.client.FindingServiceClientFactory;
import com.ebay.services.finding.FindItemsByCategoryRequest;
import com.ebay.services.finding.FindItemsByCategoryResponse;
import com.ebay.services.finding.FindingServicePortType;
import com.ebay.services.finding.PaginationInput;
import com.ebay.services.finding.SortOrderType;

public class FindItemsByCategory {

	/**
	 * @param args
	 */
	   static ClientConfigInit config;
	   static FindingServicePortType serviceClient;
	  	
		public FindItemsByCategory(){
	  		
	  		 config=new ClientConfigInit();
	  		serviceClient = FindingServiceClientFactory.getServiceClient(config.getConfig());
	  	}
   
		 public FindItemsByCategoryResponse  finditemsbycategory(Integer categoryid,Integer entriesperpage,Integer pagenumber){
		    	FindItemsByCategoryRequest request=new FindItemsByCategoryRequest();
		    	List<String> list=new ArrayList<String>();
		    	list.add(categoryid.toString());
		    	PaginationInput pi = new PaginationInput();
		        pi.setEntriesPerPage(entriesperpage);
		        pi.setPageNumber(pagenumber);
		        request.setPaginationInput(pi);
		        request.setCategoryId(list);
		        request.setSortOrder(SortOrderType.BEST_MATCH);
		        FindItemsByCategoryResponse response=serviceClient.findItemsByCategory(request);
		        return response;
		    }
		 
		 public FindItemsByCategoryResponse  finditemsbycategory(Integer categoryid,Integer entriesperpage,Integer pagenumber,SortOrderType sorttype){
		    	FindItemsByCategoryRequest request=new FindItemsByCategoryRequest();
		    	List<String> list=new ArrayList<String>();
		    	list.add(categoryid.toString());
		    	SortOrderType value=null;
		        request.setSortOrder(value);
		    	PaginationInput pi = new PaginationInput();
		        pi.setEntriesPerPage(entriesperpage);
		        pi.setPageNumber(pagenumber);
		        request.setPaginationInput(pi);
		        request.setCategoryId(list);
		        FindItemsByCategoryResponse response=serviceClient.findItemsByCategory(request);
		        return response;
		    	
		    }

}
