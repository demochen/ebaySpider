package com.ebay.service.seller;

import java.util.List;

import com.ebay.domain.seller.DaySellDto;
import com.ebay.domain.seller.RecentFeedbackratings;
import com.ebay.domain.seller.Seller;
import com.ebay.domain.seller.SellerDto;
import com.ebay.domain.seller.SellerInfoDto;
import com.ebay.domain.seller.WeekSellInfo;

public interface SellerService {

	public boolean sellerExits(String sellername);

	public void AddSeller(Seller seller);

	public void AddRates(RecentFeedbackratings rates);

	public RecentFeedbackratings selectRate(String sellername);

	public Seller FindSeller(String sellername);

	public boolean ratesExits(String sellername);

	public SellerDto getSellerDto(String userName);
	
	public List<SellerInfoDto> getMonthInfo(String userName);
	
	public List<DaySellDto> getDayInfo(String sellername,int month);
	
	public List<WeekSellInfo> getWeekInfo(String sellername,int month);

}
