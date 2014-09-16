package com.ebay.service.feedback;

import java.util.List;

import com.ebay.domain.feedback.FeedBack;
import com.ebay.domain.item.Item;
import com.ebay.domain.price.PriceDot;
import com.ebay.domain.price.Pring;

public interface FeedbackService {
  
	public void AddFeedback(FeedBack feedback);
	
	public void AddFeedbacks(List<FeedBack> feedbacks);
	
	public List<FeedBack> selectFeedback(String sellername);

	public List<Item> getSpecial(String sellername);
	
	public List<PriceDot> getDots(String sellername);
	
	public double[] getTypePrice(String sellername);
	
	public List<Pring> getResult(String sellername);
	
 }
