package com.ebay.dao.seller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ebay.domain.seller.DaySellDto;
import com.ebay.domain.seller.Seller;
import com.ebay.domain.seller.SellerInfoDto;
import com.ebay.domain.seller.WeekSellInfo;

@Repository("ebaySellerDao")
public class SellerDaoImpl implements SellerDao{

	@PersistenceContext(unitName = "ePU")
	protected EntityManager em;
	
	@Override
	public int CountSeller(String sellername) {
		final Query query=em.createNamedQuery("SELECT_BY_SELLERNAME");
		query.setParameter("sellerName", sellername);
		long count=(Long) query.getSingleResult();
		return (int)count;
	
	}

	@Override
	public void save(Seller seller) {
		 em.persist(seller);
	}

	@Override
	public Seller sellect(String sellerName) {
		final Query query=em.createNamedQuery("SELECTSELLER_BY_SELLERNAME");
		query.setParameter("sellerName", sellerName);
		Seller seller=(Seller) query.getSingleResult();
		return seller;
	}

	@Override
	public int getSumDays(String sellerName) {
		final Query query=em.createNamedQuery("SELECTSELLER_BY_AllDays");
		query.setParameter("sellername", sellerName);
		long alldays=(Long)query.getSingleResult();
		return (int)alldays;
	}

	@Override
	public double getTotalSell(String sellerName) {
		final Query query=em.createNamedQuery("SELECT_BY_TOTALSELL");
		query.setParameter("sellerName", sellerName);
		double totalSell=(double) query.getSingleResult();
 		return totalSell;
	}

	@Override
	public int getSuccessSell(String sellerName) {
		final Query query=em.createNamedQuery("SELECT_BY_SUCCESSSELL");
		query.setParameter("sellerName",sellerName);
		query.setParameter("attitude", "Positive feedback rating");
		long successCount=(Long)query.getSingleResult();
		return (int)successCount;
	}

	@Override
	public int getFailedSell(String sellerName) {
		final Query query=em.createNamedQuery("SELECT_BY_SUCCESSSELL");
		query.setParameter("sellerName",sellerName);
		query.setParameter("attitude", "Negative feedback rating");
		long failedCount=0l;
		try{
			 failedCount =(Long)query.getSingleResult();
		}catch(Exception e){
		}
		
		return (int)failedCount;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<SellerInfoDto> getMonthInfo(String sellerName) {
		final Query query=em.createNamedQuery("MONTH_SELLINFO");
		query.setParameter("sellername", sellerName);
		List<SellerInfoDto> list=query.getResultList();
		return list;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DaySellDto> getDayInfo(String sellerName,int month) {
		final  Query query=em.createNamedQuery("DAY_SELLINFO");
		query.setParameter("sellername", sellerName);
		query.setParameter("months", month);
		List<DaySellDto> list=query.getResultList();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<WeekSellInfo> getWeekInfo(String sellerName, int month) {
		final  Query query=em.createNamedQuery("WEEK_SELLINFO");
		query.setParameter("sellername", sellerName);
		query.setParameter("months", month);
		List<WeekSellInfo> list=query.getResultList();
		return list;
	}
	
}
