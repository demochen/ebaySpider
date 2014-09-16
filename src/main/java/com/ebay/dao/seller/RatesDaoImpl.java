package com.ebay.dao.seller;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ebay.domain.seller.RecentFeedbackratings;

@Repository("ebayRatesDao")
public class RatesDaoImpl implements RatesDao {
    
	@PersistenceContext(unitName = "ePU")
	protected EntityManager em;
	
	public void save(RecentFeedbackratings rate){
		 em.persist(rate);
	}
	@Override
	public RecentFeedbackratings GetRates(String sellerName) {
		final Query query=em.createNamedQuery("SELECT_RATES");
		query.setParameter("sellerName", sellerName);
		RecentFeedbackratings rate=null;
		try{
		rate=(RecentFeedbackratings) query.getSingleResult();
		}catch(NoResultException e){
			
		}
		return rate;
	}
	@Override
	public int ratesExits(String sellerName) {
		final Query query=em.createNamedQuery("SELECT_RATES_EXITS");
		query.setParameter("sellerName", sellerName);
		long count=(Long) query.getSingleResult();
		return (int) count;
	}

}
