package com.ebay.util.feedback;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Date1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Date date=new Date();
		//SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		//SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm");
		SimpleDateFormat df=new SimpleDateFormat("MMMM-dd-yy hh:mm",Locale.ENGLISH);
		SimpleDateFormat ch=new SimpleDateFormat("yyyy-MM-dd hh:mm");
		Date date1 = null;
		String date2 = null;
		Date date3=null;
		try {
			date1 = df.parse("Nov-19-13 03:02");
			date2=ch.format(date1);
			date3=ch.parse(date2);
		} catch (ParseException e) {
		
			e.printStackTrace();
		}
	
	
		
	}

}
