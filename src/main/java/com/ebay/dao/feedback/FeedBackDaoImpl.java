package com.ebay.dao.feedback;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ebay.domain.feedback.FeedBack;
import com.ebay.domain.item.Item;
import com.ebay.domain.price.PriceDot;

@Repository("ebayfeedbackdao")
public class FeedBackDaoImpl implements FeedbackDao{
	@PersistenceContext(unitName = "ePU")
	protected EntityManager em;
   
	@Override
	public void Save(FeedBack feedback) {
       em.merge(feedback);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FeedBack> fecthFeedback(String sellername) {
		final Query query=em.createNamedQuery("List_FeedBack");
		query.setParameter("sellerName", sellername);
		return query.getResultList();
	}

	@Override
	public Item getSpecialItems(String sellername) {
		final Query query=em.createNamedQuery("SPECIAL_FEEDBACK");
		query.setParameter("sellername", sellername);
		query.getResultList();
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Item> getMaxItems(String sellername) {
		List<Item> list=new ArrayList<Item>();
		final Query query=em.createNamedQuery("SPECIAL_MAX_FEEDBACK");
		query.setParameter("sellername", sellername);
		list=query.getResultList();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Item> getMinItems(String sellername) {
		List<Item> list=new ArrayList<Item>();
		final Query query=em.createNamedQuery("SPECIAL_MIN_FEEDBACK");
		query.setParameter("sellername", sellername);
		list=query.getResultList();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PriceDot> getPriceDtos(String sellername) {
	 List<PriceDot> list=new ArrayList<PriceDot>();
	 final Query query=em.createNamedQuery("K_MEANS_PRICE");
	 query.setParameter("sellername", sellername);
	 list=query.getResultList();
	 return list;
	}

	@Override
	public int getKmeansMin(String sellername, double min) {
		 final Query query=em.createNamedQuery("KMEANS_MIN");
		 query.setParameter("sellername", sellername);
		 query.setParameter("min", min);
		 long count=(long) query.getSingleResult();
		return (int) count;
	}

	@Override
	public int getKmeansBet(String sellername, double min, double max) {
		 final Query query=em.createNamedQuery("KMEANS_BETWEEN");
		 query.setParameter("sellername", sellername);
		 query.setParameter("max", max);
		 query.setParameter("min", min);
		 long count=(long) query.getSingleResult();
		return (int) count;
	}

	@Override
	public int getKmenasMax(String sellername, double max) {
		 // TODO Auto-generated method stubKMEANS_MAX
		 final Query query=em.createNamedQuery("KMEANS_MAX");
		 query.setParameter("sellername", sellername);
		 query.setParameter("max", max);
		 long count=(long) query.getSingleResult();
		 return (int) count;
	}

	@Override
	public double getMaxPrice(String sellername) {
		final Query query=em.createNamedQuery("MAX_PRICE");
		query.setParameter("sellername", sellername);
		double result=(double) query.getSingleResult();
		return result;
	}

}
