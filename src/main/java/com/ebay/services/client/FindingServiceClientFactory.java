/*
Copyright (c) 2011 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and 
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent 
version thereof released by eBay.  The then-current version of the License 
can be found at https://www.codebase.ebay.com/Licenses.html and in the 
eBaySDKLicense file that is under the eBay SDK install directory.
*/
package com.ebay.services.client;

import com.ebay.common.ClientFactory;
import com.ebay.common.Constants;
import com.ebay.services.finding.FindingService;
import com.ebay.services.finding.FindingServicePortType;

/**
 * Factory class to get eBay Finding Service client proxy
 * 
 * @author boyang
 *
 */
public class FindingServiceClientFactory {
	
	/**
	 * Get a client object which can communicate with
	 * Finding service.
	 * 
	 * @param config, client-side configuration object
	 * @return a client object which implements the interface
	 *         of Finding service.
	 */
	public static FindingServicePortType getServiceClient(ClientConfig config) {
        FindingServicePortType serviceClient = 
        	ClientFactory.getServiceClient(FindingServicePortType.class, FindingService.class, 
        			config, Constants.FINDING_SERVICE_TRACKING_NAME);
        return serviceClient;
	}

}
