/*
Copyright (c) 2011 eBay, Inc.

This program is licensed under the terms of the eBay Common Development and 
Distribution License (CDDL) Version 1.0 (the "License") and any subsequent 
version thereof released by eBay.  The then-current version of the License 
can be found at https://www.codebase.ebay.com/Licenses.html and in the 
eBaySDKLicense file that is under the eBay SDK install directory.
*/
package com.ebay.services.client;

/**
 * Config object for eBay SOA service client 
 * 
 * @author boyang
 *
 */
public class ClientConfig {
	
	/**
	 * eBay developer application id;
	 */
	private String applicationId;
	private String serviceVersion;
	private String globalId;
	
	/**
	 * Service endpoint address
	 */
	private String endPointAddress;
	/**
	 * Should payload compression be enabled or not
	 */
	private boolean httpCompressionEnabled = true;
	/**
	 * Should http header logging be enabled or not
	 */
	private boolean httpHeaderLoggingEnabled = true;
	/**
	 * Should soap message logging be enabled or not
	 */
	private boolean soapMessageLoggingEnabled = true;
	
	/**
	 * Http timeout setting
	 */
	private int httpTimeout = 60000;
	
    /**
     * Get eBay developer account application ID (AppID).
     * @return AppID string
     */
	public String getApplicationId() {
		return applicationId;
	}
	/**
	 * Set eBay developer account application ID (AppID),
	 * this is mandatory.
	 * @param applicationId
	 */
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	
    /**
     * Get the service version.
     * @return service version string
     */
	public String getServiceVersion() {
		return serviceVersion;
	}
    /**
     * Set the service version your application want to use,
     * If not set, the latest version will be used. 
     * @param serviceVersion
     */
	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}
	
	/**
	 * Get the global id.
	 * @return global id string
	 */
	public String getGlobalId() {
		return globalId;
	}
	
    /**
     * The unique identifier for a combination of site, language, and territory.
     * For example, EBAY-US (the default) is the global ID that corresponds to the
     * eBay US site. The Global ID you specify must correspond to an eBay site with
     * site ID. Refer to <a href="http://developer.ebay.com/devzone/finding/Concepts/SiteIDToGlobalID.html">eBay Site ID to Global ID Mapping</a>. 
     * In addition, <a href="http://developer.ebay.com/devzone/finding/CallRef/Enums/GlobalIdList.html">Global ID Values</a> contains a complete list of the eBay global IDs.
     * 
     * If not set, default to EBAY-US.
     * @param globalId
     */
	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}
	

	/**
	 * Get the service endpoint address
	 * @return Service endpoint address
	 */
	public String getEndPointAddress() {
		return endPointAddress;
	}
	/**
     * Set the service endpoint(either production or sandbox) you request will be sent to.
     * If not set, production server address will be used.
	 * @return endpoint address string
	 */
	public void setEndPointAddress(String endPointAddress) {
		this.endPointAddress = endPointAddress;
	}
	
	/**
	 * Is http compression enabled or not
	 * 
	 * @return true if http compression is enabled, false otherwise
	 */
	public boolean isHttpCompressionEnabled() {
		return httpCompressionEnabled;
	}
	/**
	 * Set http compression enabled or not
	 * 
	 * @param httpCompressionEnabled
	 */
	public void setHttpCompressionEnabled(boolean httpCompressionEnabled) {
		this.httpCompressionEnabled = httpCompressionEnabled;
	}
	
	/**
	 * Is http header logging enabled or not
	 * 
	 * @return true if http header logging is enabled, false otherwise.
	 */
	public boolean isHttpHeaderLoggingEnabled() {
		return httpHeaderLoggingEnabled;
	}
	
	/**
	 * Set http header logging enabled or not 
	 * 
	 * @param httpHeaderLoggingEnabled
	 */
	public void setHttpHeaderLoggingEnabled(boolean httpHeaderLoggingEnabled) {
		this.httpHeaderLoggingEnabled = httpHeaderLoggingEnabled;
	}
	
	/**
	 * Is soap message logging enabled or not
	 * 
	 * @return true if soap message logging is enabled, false otherwise.
	 */
	public boolean isSoapMessageLoggingEnabled() {
		return soapMessageLoggingEnabled;
	}
	/**
	 * Set soap message logging enabled or not
	 * 
	 * @param soapMessageLoggingEnabled
	 */
	public void setSoapMessageLoggingEnabled(boolean soapMessageLoggingEnabled) {
		this.soapMessageLoggingEnabled = soapMessageLoggingEnabled;
	}
	
	/**
	 * Get current http timeout setting
	 * 
	 * @return timeout value in milliseconds
	 */
	public int getHttpTimeout() {
		return httpTimeout;
	}
	/**
	 * Set http timeout value, unit in milliseconds
	 * 
	 * @param httpTimeout
	 */
	public void setHttpTimeout(int httpTimeout) {
		this.httpTimeout = httpTimeout;
	}

}
