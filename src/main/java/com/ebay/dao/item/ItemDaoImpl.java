package com.ebay.dao.item;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ebay.domain.item.ItemDto;
import com.ebay.domain.item.RecomendPrice;

@Repository("ebayitemdao")
public class ItemDaoImpl implements ItemDao {
   
	@PersistenceContext(unitName = "ePU")
	protected EntityManager em;
   
	@Override
	public void save(ItemDto dto) {
		 em.merge(dto);	
		
	}

	@Override
	public int getcount(String keyWords) {
		final Query  query=em.createNamedQuery("SELECT_ITEMS");
		query.setParameter("keyWords", keyWords);
		long count=(long) query.getSingleResult();
		return (int)count;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ItemDto> getAllByWords(String keywords) {
		final Query query=em.createNamedQuery("SELECT_ALLITEMS");
		query.setParameter("keyWords", keywords);
		List<ItemDto> list=query.getResultList();
		return list;
	}

	@Override
	public RecomendPrice getRecPrice(String keywords) {
		final Query query=em.createNamedQuery("SELECT_RECOMENDPRICE");
		query.setParameter("keyWords", keywords);
		RecomendPrice rprice=(RecomendPrice) query.getSingleResult();
		return rprice;
	}

	

}
