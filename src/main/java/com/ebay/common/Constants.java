/*
Copyright (c) 2011 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and 
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent 
version thereof released by eBay.  The then-current version of the License 
can be found at https://www.codebase.ebay.com/Licenses.html and in the 
eBaySDKLicense file that is under the eBay SDK install directory.
*/
package com.ebay.common;

/**
 * <p>Title: Common Constants </p>
 * <p>Description: Common constants used by the service kit</p>
 * <p>Copyright: Copyright (c) 2011</p>
 * <p>Company: eBay Inc.</p>
 * @author boyang
 * @version 1.0
 */
public interface Constants {
    
	//used in jax-ws handlers
    public static final String HANDLER_CLIENT_CONFIG = "client_config";
	
    //for http headers
    public static final String HTTP_READ_TIMEOUT = "com.sun.xml.ws.request.timeout";
    public static final String HTTP_ACCEPT_ENCODING = "Accept-Encoding";
	public static final String HTTP_GZIP_ENCODING = "gzip";
	
	public static final String HTTP_CONNECT_TIMEOUT = "com.sun.xml.ws.connect.timeout";
	
	public static final String HEADER_USER_AGENT = "User-Agent";
	
	
	/**
	 * Prefix used by all SOA headers.
	 */
	public static final String SYS_PREFIX = "X-EBAY-SOA-";

	/**
	 * Message protocol (SOAP, etc.).
	 */
	public static final String MESSAGE_PROTOCOL = SYS_PREFIX + "MESSAGE-PROTOCOL";

	/**
	 * Service operation name.
	 */
	public static final String SERVICE_OPERATION_NAME = SYS_PREFIX + "OPERATION-NAME";

	/**
	 * Service qname.
	 */
	public static final String SERVICE_NAME = SYS_PREFIX + "SERVICE-NAME";

	/**
	 * Global ID for this request/response.
	 */
	public static final String GLOBAL_ID = SYS_PREFIX + "GLOBAL-ID";

	/**
	 * Service version in which client (in requests) or server (in responses) is operating.
	 */
	public static final String VERSION = SYS_PREFIX + "SERVICE-VERSION";
	
	/**
	 * Security related SOA headers
	 */
	public static final String AUTH_APPNAME = SYS_PREFIX + "SECURITY-APPNAME";
	
	/**
	 * SOA name for SOAP 1.1 protocol processor.
	 */
	public static final String MSG_PROTOCOL_SOAP_11 = "SOAP11";

	/**
	 * SOA name for SOAP 1.2 protocol processor.
	 */
	public static final String MSG_PROTOCOL_SOAP_12 = "SOAP12";
	
	/**
	 * Service kit name for tracking purpose
	 */
	public static final String SERVICE_KIT_NAME = "eBayServiceKit(Java)";
	
	/**
	 * User agent http header value for tracking purpose
	 */
	public static final String USER_AGENT_VALUE = SERVICE_KIT_NAME;
	
	/**
	 * Supported service name for tracking purpose
	 */
	public static final String FINDING_SERVICE_TRACKING_NAME = "FindingAPI";
    
}
