package com.ebay.util.feedback;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import com.ebay.domain.customer.Customer;
import com.ebay.domain.customer.CustomerImpl;
import com.ebay.domain.feedback.FeedBack;

public class DealFeedback {

	public List<CustomerImpl> getCustomerFromfeedback(List<String> feedinfo) {
		List<CustomerImpl> customerlist = new ArrayList<CustomerImpl>();
		for (int i = 1; i < feedinfo.size(); i = i + 2) {
			String[] content = feedinfo.get(i).split(";");
			if (content.length != 0) {
				Customer customer = new CustomerImpl();
				String customerinfo = content[2];
				String[] name_star = customerinfo.split("[(] ");
				String name = name_star[0];
				String star = name_star[1];
				star = star.substring(0, star.length() - 1);
				customer.setCustomername(name);
				customer.setStar(Integer.parseInt(star));
				customerlist.add((CustomerImpl) customer);
			}
		}
		return customerlist;
	}

	public static CustomerImpl fetchCustomerInfo(String feedinfo) {
		String[] content = feedinfo.split(";");
		Customer customer = new CustomerImpl();
		if (content.length != 0) {
			String customerinfo = content[2];
			String[] name_star = customerinfo.split("[(] ");
			String name = name_star[0];
			String star = name_star[1];
			star = star.substring(0, star.length() - 1);
			customer.setCustomername(name);
			customer.setStar(Integer.parseInt(star));
		}
		return (CustomerImpl) customer;
	}

	@SuppressWarnings({ "rawtypes" })
	public static Map<String, List> StructInfo(Map<String, List<String>> map,String sellerName) {
		Map<String, List> combine = new HashMap<String, List>();
		if(map!=null){ 
		List<String> attitude = map.get("Attitude");
		List<String> feedinfo = map.get("FeedInfo");
		List<CustomerImpl> customerlist = new ArrayList<CustomerImpl>();
		List<FeedBack> FeedBacklist = new ArrayList<FeedBack>();
		int imgcount=0;
	
		for (int i = 0;i < feedinfo.size(); i=i+2) {
			List<String> SecondInfo = new ArrayList<String>();
			    SecondInfo.add(feedinfo.get(i));
			    SecondInfo.add(feedinfo.get(i+1));
			    if(SecondInfo.size()==2){
			    	FeedBack feedbackinfo = new FeedBack();
					Customer customer = new CustomerImpl();
					String comment, customerinfo, name, star, itemname, itemid;
					try{
					for(int m=0;m<2;m++){
					if (m % 2 == 0) {
						String[] content = SecondInfo.get(m).split("\\|");
						 String regEx="[`~!@#$%^&*✨👍]"; 
						 Pattern   p   =   Pattern.compile(regEx);  
						 comment = p.matcher(content[1]).replaceAll("");  
						customerinfo = content[2];
						Date date = Util.dealDate(content[3]);
						String[] name_star = customerinfo.split("[(] ");
						name = name_star[0];
						if(name.contains("private")){
							String peivate1[]=name.split("[(]");
							String name1=peivate1[0];
							star="0";
							customer.setCustomername(name);
							customer.setStar(Integer.parseInt(star.trim()));
							feedbackinfo.setStar(Integer.parseInt(star.trim()));
						}else{
						star = name_star[1];
						int right=star.indexOf(")");
						star = star.substring(0, right);
						customer.setCustomername(name);
						customer.setStar(Integer.parseInt(star.trim()));
						feedbackinfo.setStar(Integer.parseInt(star.trim()));
						}
						feedbackinfo.setComment(comment);
						feedbackinfo.setDate(date);
						feedbackinfo.setAttitude(attitude.get(imgcount));
						imgcount++;
					} else {
						String iteminfo[] =  SecondInfo.get(m).split("\\|");
						String[] itemname_id = iteminfo[1].split("[(]");
						itemname = itemname_id[0];
						itemid = itemname_id[1];
						String priceinfo[] = iteminfo[2].split("[$]");
						String price1=priceinfo[1].replace(",","");
						double price = Double.parseDouble(price1);
						itemid = itemid.substring(1, itemid.length() - 1);
						feedbackinfo.setItemId(itemid);
						feedbackinfo.setPrice(price);
						feedbackinfo.setItemName(itemname);
						feedbackinfo.setSellername(sellerName);
						SecondInfo.clear();
						SecondInfo=null;
					}
					}
					}catch(Exception e){
						e.printStackTrace();
					}
					customerlist.add((CustomerImpl) customer);
					FeedBacklist.add(feedbackinfo);
					
			    }else{
			    	continue;
			    }
			}
		
		
	      combine.put("CUSTOMER", customerlist);
		  combine.put("FEEDBACK", FeedBacklist);
		}
		return combine;
	}

}
