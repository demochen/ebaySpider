package com.ebay.util.feedback;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ebay.domain.customer.Customer;
import com.ebay.domain.customer.CustomerImpl;
import com.ebay.domain.feedback.FeedBack;

public class testsplit {

	/**
	 * @param args
	 */
	static String Isapi="http://feedback.ebay.com/ws/eBayISAPI.dll?ViewFeedback2&userid=";
	static String  back="&&sspagename=VIP:feedback&ftab=FeedbackAsSeller";
	public static void main(String[] args) throws ParseException {
		List<String> list = new ArrayList<String>();
		list.add("start;Feedback;From Buyer/price;Date/time");
		list.add("start;Товар пришел, спасибо;a***t ( 10);Nov-19-13 03:02");
		list.add("start;Emporio Armani Classic Leather Mens Watch AR0431 (#181246673308);US $207.50;View Item Emporio Armani Classic Leather Mens Watch AR0431");
		list.add("start;Espectacular reloj y excelente servicio!!;n***a ( 3 );Nov-19-13 02:42");
		list.add("start;Seiko Sportura Mens Watch SRK023P2 (#190912463504);US $149.15;View Item Seiko Sportura Mens Watch SRK023P2");
		list.add("start;Fast delivery. Everything was great.;e***e ( 53);Nov-18-13 21:11");
		list.add("start;Michael Kors Lexington Gold-Tone Chronograph Mens Watch MK8281 (#181234881003);US $213.52;View Item Michael Kors Lexington Gold-Tone Chronograph Mens Watch MK8281");
		list.add("start;Товар пришел, спасибо;a***t ( 10);Nov-19-13 03:02");
		list.add("start;Emporio Armani Classic Leather Mens Watch AR0431 (#181246673308);US $207.50;View Item Emporio Armani Classic Leather Mens Watch AR0431");
		list.add("start;Espectacular reloj y excelente servicio!!;n***a ( 3 );Nov-19-13 02:42");
		list.add("start;Seiko Sportura Mens Watch SRK023P2 (#190912463504);US $149.15;View Item Seiko Sportura Mens Watch SRK023P2");
		list.add("start;Fast delivery. Everything was great.;e***e ( 53);Nov-18-13 21:11");
		list.add("start;Michael Kors Lexington Gold-Tone Chronograph Mens Watch MK8281 (#181234881003);US $213.52;View Item Michael Kors Lexington Gold-Tone Chronograph Mens Watch MK8281");
		list.add("start;Товар пришел, спасибо;a***t ( 10);Nov-19-13 03:02");
		list.add("start;Emporio Armani Classic Leather Mens Watch AR0431 (#181246673308);US $207.50;View Item Emporio Armani Classic Leather Mens Watch AR0431");
		list.add("start;Espectacular reloj y excelente servicio!!;n***a ( 3 );Nov-19-13 02:42");
		list.add("start;Seiko Sportura Mens Watch SRK023P2 (#190912463504);US $149.15;View Item Seiko Sportura Mens Watch SRK023P2");
		list.add("start;Fast delivery. Everything was great.;e***e ( 53);Nov-18-13 21:11");
		list.add("start;Michael Kors Lexington Gold-Tone Chronograph Mens Watch MK8281 (#181234881003);US $213.52;View Item Michael Kors Lexington Gold-Tone Chronograph Mens Watch MK8281");
		list.add("start;Товар пришел, спасибо;a***t ( 10);Nov-19-13 03:02");
		list.add("start;Emporio Armani Classic Leather Mens Watch AR0431 (#181246673308);US $207.50;View Item Emporio Armani Classic Leather Mens Watch AR0431");
		list.add("start;Espectacular reloj y excelente servicio!!;n***a ( 3 );Nov-19-13 02:42");
		list.add("start;Seiko Sportura Mens Watch SRK023P2 (#190912463504);US $149.15;View Item Seiko Sportura Mens Watch SRK023P2");
		list.add("start;Fast delivery. Everything was great.;e***e ( 53);Nov-18-13 21:11");
		list.add("start;Michael Kors Lexington Gold-Tone Chronograph Mens Watch MK8281 (#181234881003);US $213.52;View Item Michael Kors Lexington Gold-Tone Chronograph Mens Watch MK8281");
		List<CustomerImpl> customerlist=new ArrayList<CustomerImpl>();
		List<FeedBack> FeedBacklist=new ArrayList<FeedBack>();
		Long start=new Date().getTime();
		for (int i = 1; i < list.size(); i++) {
			FeedBack feedbackinfo=new FeedBack();
			Customer customer=new CustomerImpl();
			if(i%2!=0){
				String[] content = list.get(i).split(";");
				String comment=content[1];
				String customerinfo = content[2];
				Date date=Util.dealDate(content[3]);
				String[] name_star = customerinfo.split("[(] ");
				String name = name_star[0];
				String star = name_star[1];
				star=star.substring(0, star.length()-1);
				customer.setCustomername(name);
				customer.setStar(Integer.parseInt(star.trim()));
				feedbackinfo.setComment(comment);
				feedbackinfo.setDate(date);
				feedbackinfo.setStar(Integer.parseInt(star.trim()));
			}else{
				String iteminfo[]=list.get(i).split(";");
				String[] itemname_id=iteminfo[1].split("[(]");
				String itemname=itemname_id[0];
				String itemid=itemname_id[1];
				String priceinfo[]=iteminfo[2].split("[$]");
				double price=Double.parseDouble(priceinfo[1]);
				itemid=itemid.substring(1,itemid.length()-1);
				feedbackinfo.setItemId(itemid);
				feedbackinfo.setPrice(price);
				feedbackinfo.setItemName(itemname);
			}
		   customerlist.add((CustomerImpl) customer);
		   FeedBacklist.add(feedbackinfo);
		}
		  Long end=new Date().getTime();
		  System.out.println(FeedBacklist.size());
		
	}
	
	
}
