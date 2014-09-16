package com.ebay.dao.seller;

import java.util.List;

import com.ebay.domain.seller.DaySellDto;
import com.ebay.domain.seller.Seller;
import com.ebay.domain.seller.SellerInfoDto;
import com.ebay.domain.seller.WeekSellInfo;

public interface SellerDao {

	public int CountSeller(String sellername);

	public void save(Seller seller);

	public Seller sellect(String sellerName);

	public int getSumDays(String sellerName);

	public double getTotalSell(String sellerName);

	public int getSuccessSell(String sellerName);

	public int getFailedSell(String sellerName);

	public List<SellerInfoDto> getMonthInfo(String sellerName);

	public List<DaySellDto> getDayInfo(String sellerName,int month);
	
	public List<WeekSellInfo> getWeekInfo(String sellerName,int month);
}
