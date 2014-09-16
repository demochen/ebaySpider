/*
Copyright (c) 2011 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and 
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent 
version thereof released by eBay.  The then-current version of the License 
can be found at https://www.codebase.ebay.com/Licenses.html and in the 
eBaySDKLicense file that is under the eBay SDK install directory.
*/
package com.ebay.common;

import java.lang.reflect.Method;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.MessageContext;

import org.apache.log4j.Logger;

import com.ebay.common.handler.ServiceHandlerResolver;
import com.ebay.services.client.ClientConfig;
/**
 * A Generic factory class to get eBay SOA service client proxy instance
 * 
 * @author boyang
 *
 */
public class ClientFactory {
	
	private static final Logger logger = Logger.getLogger(ClientFactory.class);
	
	/**
	 *  A static fractory method to get eBay SOA service client proxy instance
	 * 
	 * @param <I> service endpoint interface generic
	 * @param <C> service client generic
	 * @param serviceEndpointInterface,service endpoint interface class 
	 * @param serviceClient, service client class
	 * @param clientConfig, client side configuration
	 * @param serviceTrackingName, serviceName for usage tracking
	 * @return instance implementing client endpoint interface
	 */
	public static <I, C>I getServiceClient(
			Class<I> serviceEndpointInterface,
			Class<C> serviceClient,
			ClientConfig clientConfig, String servcieTrackingName) {
		
		// Get namespace and service name from annotation on the service client
		String targetNamespace = serviceClient.getAnnotation(WebServiceClient.class).targetNamespace();
		String serviceName = serviceClient.getAnnotation(WebServiceClient.class).name();
		QName serviceQName = new QName(targetNamespace, serviceName);
		
		// wsdl is in the same package as the service client
		String wsdlLocation = serviceClient.getAnnotation(WebServiceClient.class).wsdlLocation();
	    URL wsdlUrl = serviceClient.getResource(wsdlLocation);
	    
	    if (wsdlUrl == null) {
	    	logger.error("Can not find wsdl on specified location: " + wsdlLocation);
	    	throw new RuntimeException("can not find wsdl on specified location: " + wsdlLocation);
	    }
	    
	    logger.debug("begin to create service instance ... ");
	    logger.debug("wsdl : " + wsdlUrl.toString());
	    logger.debug("service : " + serviceQName.toString());
	    
	    // Service objects provide the client view of a Web service.
	    // can be used to create proxy for a target service endpoint
	    Service service = Service.create(wsdlUrl, serviceQName);
	    
	    // enable handlers on the service, for logging, http header setting, etc...
	    HandlerResolver hr = new ServiceHandlerResolver();
	    service.setHandlerResolver(hr);
	    
	    // get service endpoint name
        QName serviceEndpiontQName = null;
        String serviceEndpointName = getServiceEndpointName(serviceClient);
        if (serviceEndpointName != null) {
        	serviceEndpiontQName = new QName(targetNamespace, serviceEndpointName);
        }
        
        I port = null;
        // get proxy for a target service endpoint
        if (serviceEndpiontQName != null) {
        	port = service.getPort(serviceEndpiontQName, serviceEndpointInterface);
        } else {
        	port = service.getPort(serviceEndpointInterface);
        }
        
        // set http headers required by eBay SOA service
        initReqeustContext(port, clientConfig, servcieTrackingName);
        
        return port;
	}
	
	// Get service endpoint name by inspecting annotation on the service client
	private static <C> String getServiceEndpointName(Class<C> serviceClient) {
		Method[] methods = serviceClient.getDeclaredMethods();
		WebEndpoint webEndpoint = null;
		for (Method method: methods) {
			webEndpoint = method.getAnnotation(WebEndpoint.class);
			if (webEndpoint != null) break;
		}
		if (webEndpoint == null) {
			logger.debug("unable to find service endpoint name in service client : " 
						+ serviceClient.getName());
			return null;
		}
		String endpontName = webEndpoint.name();
		return endpontName;
	}
	
	/**
	 * Set http headers in the JAX-WS RequestContext
	 * 
	 * @param port, the client proxy.
	 * @param clientConfig, configuration for the proxy.
	 * @param serviceTrackingName, serviceName for usage tracking
	 */
    private static void initReqeustContext(Object port, ClientConfig clientConfig, String serviceTrackingName) {
        Map<String, Object> requestContext = ((BindingProvider)port).getRequestContext();

		//set client config object, will be used by handlers at runtime
		requestContext.put(Constants.HANDLER_CLIENT_CONFIG, clientConfig);
        
        //set endpoint address
	    if (clientConfig.getEndPointAddress() != null) {
	    	requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, clientConfig.getEndPointAddress());
	    }
        
        Map<String, List<String>> httpHeaders = new HashMap<String, List<String>>();

        //set soa specific headers
        //httpHeaders.put("X-EBAY-SOA-SERVICE-NAME", Collections.singletonList(serviceEndpointConfig.getServiceName()));
        
        //set service version
        String serviceVersion = clientConfig.getServiceVersion();
        if (serviceVersion != null && serviceVersion.length() > 0) {
        	httpHeaders.put(Constants.VERSION, Collections.singletonList(serviceVersion));
        }
        //set global id
        String globalId = clientConfig.getGlobalId();
        if (globalId != null && globalId.length() > 0) {
        	httpHeaders.put(Constants.GLOBAL_ID, Collections.singletonList(globalId));
        }
        //set application id
        String appId = clientConfig.getApplicationId();
        if (appId != null && appId.length() > 0) {
        	httpHeaders.put(Constants.AUTH_APPNAME, Collections.singletonList(appId));
        }
        
        // only support SOAP now
        httpHeaders.put(Constants.MESSAGE_PROTOCOL, 
        		Collections.singletonList(Constants.MSG_PROTOCOL_SOAP_12));
        
        // usage tracking
        
        String uaValue = Constants.USER_AGENT_VALUE;
        if (serviceTrackingName != null) {
        	uaValue += "-" + serviceTrackingName;
        }
        httpHeaders.put(Constants.HEADER_USER_AGENT, 
        		Collections.singletonList(uaValue));
        
		//set http gzip compression
		boolean isHttpCompressionEnabled = clientConfig.isHttpCompressionEnabled();
		if (isHttpCompressionEnabled) {
			//now eBay server does not support gzipped request
			//httpHeaders.put("Content-Encoding", Collections.singletonList("gzip"));
			httpHeaders.put(Constants.HTTP_ACCEPT_ENCODING, 
					Collections.singletonList(Constants.HTTP_GZIP_ENCODING));
		}

        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);
        
		//set timeout
		int timeout = clientConfig.getHttpTimeout();
		if (timeout > 0) {
			requestContext.put(Constants.HTTP_CONNECT_TIMEOUT, timeout);
			//TODO, need read timeout?(boyang)
			requestContext.put(Constants.HTTP_READ_TIMEOUT, timeout);
		} else { // remove timeout setting
			if (requestContext.containsKey(Constants.HTTP_CONNECT_TIMEOUT)) {
				requestContext.remove(Constants.HTTP_CONNECT_TIMEOUT);
			}
			if (requestContext.containsKey(Constants.HTTP_READ_TIMEOUT)) {
				requestContext.remove(Constants.HTTP_READ_TIMEOUT);
			}
		}
    }

}
