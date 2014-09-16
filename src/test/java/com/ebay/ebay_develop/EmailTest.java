package com.ebay.ebay_develop;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ebay.util.mail.MailSenderInfo;
import com.ebay.util.mail.SimpleMailSender;

public class EmailTest {

	@Test
	public void test() {
		  MailSenderInfo mailInfo = new MailSenderInfo();    
	      mailInfo.setMailServerHost("smtp.qq.com");    
	      mailInfo.setMailServerPort("25");    
	      mailInfo.setValidate(true);    
	      mailInfo.setUserName("1040479030@qq.com");    
	      mailInfo.setPassword("10081210mc*");//您的邮箱密码    
	      mailInfo.setFromAddress("1040479030@qq.com");    
	      mailInfo.setToAddress("demochen@hotmail.com");    
	      mailInfo.setSubject("test please ignore");    
	      mailInfo.setContent("设置邮箱内容 如http://www.guihua.org 中国桂花网 是中国最大桂花网站==");    
	         //这个类主要来发送邮件   
	      SimpleMailSender sms = new SimpleMailSender();   
	      sms.sendTextMail(mailInfo);//发送文体格式    
	}

}
