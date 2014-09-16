package com.ebay.service.seller;


import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ebay.dao.feedback.FeedbackDao;
import com.ebay.dao.seller.RatesDao;
import com.ebay.dao.seller.SellerDao;
import com.ebay.domain.seller.DaySellDto;
import com.ebay.domain.seller.RecentFeedbackratings;
import com.ebay.domain.seller.Seller;
import com.ebay.domain.seller.SellerDto;
import com.ebay.domain.seller.SellerInfoDto;
import com.ebay.domain.seller.WeekSellInfo;

@Service("sellerService")
public class SellerServiceImpl implements SellerService {

	@Resource(name = "ebayRatesDao")
	private RatesDao ratesdao;
    @Resource(name="ebaySellerDao")
    private SellerDao sellerdao;
	
    
	@Override
	public boolean sellerExits(String sellername) {
		boolean flag = true;
		int count = sellerdao.CountSeller(sellername);
		if (count ==0) {
			flag = false;
		}
		return flag;
	}

	@Override
	@Transactional
	public void AddSeller(Seller seller) {
		sellerdao.save(seller);
	}

	@Override
	@Transactional
	public void AddRates(RecentFeedbackratings rates) {
      ratesdao.save(rates);
	}

	@Override
	public RecentFeedbackratings selectRate(String sellername) {
		return ratesdao.GetRates(sellername);
	}

	@Override
	public Seller FindSeller(String sellername) {
		return sellerdao.sellect(sellername);
	}

	@Override
	public boolean ratesExits(String sellername) {
		boolean flag=false;
		int account=ratesdao.ratesExits(sellername);
		if(account!=0){
			flag=true;
		}
		return flag;
	}

	@Override
	public SellerDto getSellerDto(String sellerName) {
	   int days=sellerdao.getSumDays(sellerName);
	   double totalsell=sellerdao.getTotalSell(sellerName);
	   int succecount=sellerdao.getSuccessSell(sellerName);
	   int failedcount=sellerdao.getFailedSell(sellerName);
	   double sellperday=totalsell/(failedcount+succecount);
	   SellerDto sellerDto=new SellerDto(succecount, failedcount, totalsell, days, sellperday);
	   return sellerDto;
	}

	@Override
	public List<SellerInfoDto> getMonthInfo(String userName) {
		List<SellerInfoDto> list=sellerdao.getMonthInfo(userName);
		return list;
	}

	@Override
	public List<DaySellDto> getDayInfo(String sellername, int month) {
		List<DaySellDto> list=sellerdao.getDayInfo(sellername, month);
		return list;
	}

	@Override
	public List<WeekSellInfo> getWeekInfo(String sellername, int month) {
		List<WeekSellInfo> list=sellerdao.getWeekInfo(sellername, month);
		return list;
	}



}
