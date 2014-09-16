package com.ebay.ebay_develop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestConvert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	String str="Super ebayeur 👍 envoie rapide et conforme 👍 pièces de qualité 👍100%✨✨✨";
    String regEx="[`~!@#$%^&*✨👍]"; 
	Pattern   p   =   Pattern.compile(regEx);     
      Matcher   m   =   p.matcher(str);    
	System.out.println(m.replaceAll(""));
	}

}
