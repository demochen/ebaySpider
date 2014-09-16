package com.ebay.dao.feedback;

import java.util.List;

import com.ebay.domain.feedback.FeedBack;
import com.ebay.domain.item.Item;
import com.ebay.domain.price.PriceDot;

public interface FeedbackDao {

	public void Save(FeedBack feedback);
	
	public List<FeedBack> fecthFeedback(String sellername);
	
	public Item getSpecialItems(String sellername);
    
	public List<Item> getMaxItems(String sellername);
	
	public List<Item>  getMinItems(String sellername);
	
	public List<PriceDot> getPriceDtos(String sellername);
	
	public int getKmeansMin(String sellername,double min);
	
	public int getKmeansBet(String sellername,double min,double between);
	
	public int getKmenasMax(String sellername,double max);
	
	public double getMaxPrice(String sellername);

}
