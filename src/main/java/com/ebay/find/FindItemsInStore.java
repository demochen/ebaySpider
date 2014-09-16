package com.ebay.find;

import com.ebay.init.ClientConfigInit;
import com.ebay.services.client.FindingServiceClientFactory;
import com.ebay.services.finding.FindItemsIneBayStoresRequest;
import com.ebay.services.finding.FindItemsIneBayStoresResponse;
import com.ebay.services.finding.FindingServicePortType;
import com.ebay.services.finding.PaginationInput;
import com.ebay.services.finding.SortOrderType;

public class FindItemsInStore {

	  static ClientConfigInit config;
	   static FindingServicePortType serviceClient;
	  	
		public FindItemsInStore(){
	  		
	  		config=new ClientConfigInit();
	  		serviceClient = FindingServiceClientFactory.getServiceClient(config.getConfig());
	  	}
		
		public FindItemsIneBayStoresResponse findinstore(String storename,String keywords,Integer entriesperpage,Integer pagenumber){
			FindItemsIneBayStoresRequest request=new FindItemsIneBayStoresRequest();
			PaginationInput pi = new PaginationInput();
	        pi.setEntriesPerPage(entriesperpage);
	        pi.setPageNumber(pagenumber);
			request.setStoreName(storename);
			request.setKeywords(keywords);
			request.setSortOrder(SortOrderType.BEST_MATCH);
			request.setPaginationInput(pi);
			FindItemsIneBayStoresResponse response = serviceClient.findItemsIneBayStores(request);
			return response;
		}
		
		public FindItemsIneBayStoresResponse findinstore(String storename,String keywords,Integer entriesperpage,Integer pagenumber,SortOrderType sorttype){
			FindItemsIneBayStoresRequest request=new FindItemsIneBayStoresRequest();
			PaginationInput pi = new PaginationInput();
	        pi.setEntriesPerPage(entriesperpage);
	        pi.setPageNumber(pagenumber);
			request.setStoreName(storename);
			request.setKeywords(keywords);
			request.setSortOrder(sorttype);
			request.setPaginationInput(pi);
			FindItemsIneBayStoresResponse response = serviceClient.findItemsIneBayStores(request);
			return response;
		}
}
