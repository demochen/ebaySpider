package com.ebay.util.mail;


public class SendEmail {
  
	public static void send(String toAddress,String passWord){
		  MailSenderInfo mailInfo = new MailSenderInfo();    
	      mailInfo.setMailServerHost("smtp.qq.com");    
	      mailInfo.setMailServerPort("25");    
	      mailInfo.setValidate(true); 
	      mailInfo.setUserName("1040479030@qq.com");    
	      mailInfo.setPassword("10081210cm*"); 
	      mailInfo.setFromAddress("1040479030@qq.com");
	      mailInfo.setToAddress(toAddress);    
	      mailInfo.setSubject("Find Your PassWord");    
	      mailInfo.setContent(passWord);    
	      SimpleMailSender sms = new SimpleMailSender();   
	      sms.sendTextMail(mailInfo);
	}
	
	
}
