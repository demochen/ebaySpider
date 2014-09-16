package com.ebay.init;

import com.ebay.services.client.ClientConfig;

public class ClientConfigInit {
 
	 static  ClientConfig config=new ClientConfig();
	
	public ClientConfig getConfig() {
		return config;
	}

	public void setConfig(ClientConfig config) {
		this.config = config;
	}

	public ClientConfigInit(){
		
		        
	 config.setApplicationId("TCSb713cb-2809-469d-8016-393aefb7f2c");
		   
		  
	}
}
