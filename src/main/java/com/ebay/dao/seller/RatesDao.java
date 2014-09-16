package com.ebay.dao.seller;

import com.ebay.domain.seller.RecentFeedbackratings;

public interface RatesDao {
	
	public RecentFeedbackratings GetRates(String sellerName);

	public void save(RecentFeedbackratings rate);
	
	public int ratesExits(String sellerName);
}
