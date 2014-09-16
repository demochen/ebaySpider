package com.ebay.util.feedback;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Util {
  
	public static Date dealDate(String srource) throws ParseException{
	
		SimpleDateFormat df=new SimpleDateFormat("MMMM-dd-yy hh:mm",Locale.ENGLISH);
		SimpleDateFormat ch=new SimpleDateFormat("yyyy-MM-dd hh:mm");
		Date date1 = null;
		String date2 = null;
		Date date3=null;
		
			date1 = df.parse(srource);
			date2=ch.format(date1);
			date3=ch.parse(date2);
		
	    return date3;
	}
	public static Date dealCreateDate(String srource){
		
		SimpleDateFormat df=new SimpleDateFormat("MMMM-dd-yy",Locale.ENGLISH);
		SimpleDateFormat ch=new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = null;
		String date2 = null;
		Date date3=null;
		try {
			date1 = df.parse(srource);
			date2=ch.format(date1);
			date3=ch.parse(date2);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	    return date3;
	}
	
	public static int getDaysByMonth(int month){
		int day=30;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			day=31;
		}else if(month==2){
			day=28;
		}
		return day;
	}
}
