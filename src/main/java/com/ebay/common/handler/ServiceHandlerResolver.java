/*
Copyright (c) 2011 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and 
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent 
version thereof released by eBay.  The then-current version of the License 
can be found at https://www.codebase.ebay.com/Licenses.html and in the 
eBaySDKLicense file that is under the eBay SDK install directory.
*/
package com.ebay.common.handler;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

/**
 * Jax-ws handler resolver
 * 
 * @author boyang
 * @version 1.0
 *
 */
public class ServiceHandlerResolver implements HandlerResolver {
	
	@SuppressWarnings("unchecked")
	public List<Handler> getHandlerChain(PortInfo portInfo) {
		List<Handler> handlerChain = new ArrayList<Handler>();
		
		//add handler for logging, header setting
		JAXWSHandler handler = new JAXWSHandler();
		handlerChain.add(handler);
		
		return handlerChain;
	}
}
