package com.ebay.find;

import com.ebay.init.ClientConfigInit;
import com.ebay.services.client.FindingServiceClientFactory;
import com.ebay.services.finding.FindItemsByProductRequest;
import com.ebay.services.finding.FindItemsByProductResponse;
import com.ebay.services.finding.FindingServicePortType;
import com.ebay.services.finding.PaginationInput;
import com.ebay.services.finding.ProductId;
import com.ebay.services.finding.SortOrderType;

public class FindItemsByProduct {

	/**
	 * @param args
	 */
   static ClientConfigInit config;
   static FindingServicePortType serviceClient;
  	
	public FindItemsByProduct(){
  		
  		 config=new ClientConfigInit();
  		serviceClient = FindingServiceClientFactory.getServiceClient(config.getConfig());
  	}
	
	public FindItemsByProductResponse findbyproduct(ProductId productid,Integer entriesperpage,Integer pagenumber){
		FindItemsByProductRequest request=new FindItemsByProductRequest();
		request.setProductId(productid);
		PaginationInput pi = new PaginationInput();
	    pi.setEntriesPerPage(entriesperpage);
	    pi.setPageNumber(pagenumber);
	    request.setPaginationInput(pi);
	    FindItemsByProductResponse response=serviceClient.findItemsByProduct(request);
		return response;
	}
	
	public FindItemsByProductResponse findbyproduct(ProductId productid,Integer entriesperpage,Integer pagenumber, SortOrderType sorttype){
		FindItemsByProductRequest request=new FindItemsByProductRequest();
		request.setProductId(productid);
        request.setSortOrder(sorttype);
		PaginationInput pi = new PaginationInput();
	    pi.setEntriesPerPage(entriesperpage);
	    pi.setPageNumber(pagenumber);
	    request.setPaginationInput(pi);
	    FindItemsByProductResponse response=serviceClient.findItemsByProduct(request);
		return response;
	}
	
	
}
