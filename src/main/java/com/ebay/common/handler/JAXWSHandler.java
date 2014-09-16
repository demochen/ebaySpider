/*
Copyright (c) 2011 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and 
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent 
version thereof released by eBay.  The then-current version of the License 
can be found at https://www.codebase.ebay.com/Licenses.html and in the 
eBaySDKLicense file that is under the eBay SDK install directory.
*/
package com.ebay.common.handler;

import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.log4j.Logger;

import com.ebay.common.Constants;
import com.ebay.services.client.ClientConfig;

/**
 * Jax-ws handler for logging, header setting purpose
 * 
 * @author boyang
 * @version 1.0
 *
 */
public class JAXWSHandler implements SOAPHandler<SOAPMessageContext> {
    
	private static final Logger logger = Logger.getLogger(JAXWSHandler.class);
    
    @SuppressWarnings("unchecked")
	public boolean handleMessage(SOAPMessageContext smc) {
    	// Get clientConfig from SOAPMessageContext
    	ClientConfig clientConfig = (ClientConfig)smc.get(Constants.HANDLER_CLIENT_CONFIG);
        
        Boolean request = (Boolean)
             smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (request.booleanValue()) {//for request message
        	
        	// log soap request
        	if (clientConfig.isSoapMessageLoggingEnabled()) {
	        	String xmlStr = this.getXmlString(smc.getMessage());
	        	xmlStr = "sending soap request message ...\r\n" + xmlStr;
	        	logger.info(xmlStr);
        	}
        	
        	// eBay SOA service need operation name to be set on http header
        	// we extract operation name from soap message and set it on request http header
        	String operationName = this.getOperationName(smc.getMessage());
        	Map<String, List<String>> http_req_headers = (Map<String, List<String>>) smc
        	                                             .get(MessageContext.HTTP_REQUEST_HEADERS);
        	http_req_headers.put(Constants.SERVICE_OPERATION_NAME, Collections.singletonList(operationName));
        	
        	// log http headers
        	if (clientConfig.isHttpHeaderLoggingEnabled()) {
				
				logger.info("---[HTTP Request Headers]---");
			
				if (http_req_headers != null) {
					logger.info(outputMap(http_req_headers));
				} else {
					logger.info("HTTP Request Headers is not available!");
				}
        	}
        	
        } else { //for response message
        	
			if (clientConfig.isHttpHeaderLoggingEnabled()) {
	        	Map http_resp_headers = (Map) smc
		        .get(MessageContext.HTTP_RESPONSE_HEADERS);			
			
				logger.info("---[HTTP Response Headers]---");
			
				if (http_resp_headers != null) {
					logger.info(outputMap(http_resp_headers));
				} else {
					logger.info("HTTP Response Headers is not available!");
				}
			}
        	
        	if (clientConfig.isSoapMessageLoggingEnabled()) {
	        	String xmlStr = this.getXmlString(smc.getMessage());
	        	xmlStr = "receiving soap response message ...\r\n" + xmlStr;
	        	logger.info(xmlStr);
        	}
        	
        }
   	
        return true;
    }
    
	// get xml string from SOAPMessage
    private String getXmlString(SOAPMessage message) {

        String xmlStr = null;
        try {
        	Source payload = message.getSOAPPart().getContent();
    		xmlStr = sourceToSting(payload);
    	} catch (Exception e) {
    		logger.error("fail to get xml string from SOAP message", e);
    	}
    	return xmlStr;
    }
    
	// convert Source to formatted XML String
	private static String sourceToSting(Source payload) throws TransformerException {
    	String result = null;
        StreamResult strResult = new StreamResult(new StringWriter());
        
        if(payload != null) {
            TransformerFactory factory = TransformerFactory.newInstance();
            //factory.setAttribute("indent-number", new Integer(2));
            
            Transformer transformer = factory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformer.transform(payload, strResult);

	    	result = strResult.getWriter().toString();
        }
        return result;
	}
	
	// get operation name from the soap message
	private String getOperationName(SOAPMessage message) {
		String opName = null;
		try {
			String requestName = message.getSOAPBody().getFirstChild().getLocalName();
			// remove Request suffix
			opName = requestName.replace("Request", "");
		} catch (SOAPException e) {
    		logger.error("fail to get operation name in the SOAP message", e);
		}
		return opName;
	}
    
    // log soap fault
	public boolean handleFault(SOAPMessageContext smc) {
    	//get clientConfig from SOAPMessageContext
    	ClientConfig clientConfig = (ClientConfig)smc.get(Constants.HANDLER_CLIENT_CONFIG);

    	if (clientConfig.isSoapMessageLoggingEnabled()) {
        	String xmlStr = this.getXmlString(smc.getMessage());
        	xmlStr = "receiving soap fault message ...\r\n" + xmlStr;
        	logger.info(xmlStr);
    	}
		
		return true;
		
	}
	
	public void close(MessageContext mc) {
	}

	public Set<QName> getHeaders() {
		return null;
	}
	
	// convert a map (key, value) into string form
    @SuppressWarnings("unchecked")
	private static String outputMap(Map map){
    	StringBuffer output = new StringBuffer("");
    	Set entries = map.entrySet();
    	Iterator it = entries.iterator();
    	while (it.hasNext()){
    		Entry entry = (Entry) it.next();
    		Object key = entry.getKey();
    		Object value = entry.getValue();
    		output.append(((key==null)?"null":key.toString()) + " : " + ((value==null)?"null":value.toString()) + "\n");
    	}
    	return output.toString();    	
    }
}
