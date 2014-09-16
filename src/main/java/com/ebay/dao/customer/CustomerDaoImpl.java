package com.ebay.dao.customer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ebay.domain.customer.Customer;
@Repository("eCustomerDao")
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext(unitName = "ePU")
	protected EntityManager em;
    
	
	public Customer save(Customer customer) {
		Customer response=em.merge(customer);
		return response;
	}

	@SuppressWarnings("unchecked")
	public List<Customer> getCustomers() {
		final	Query query=em.createNamedQuery("SELECT_CUSTOMERS");
		return query.getResultList();
	}

}
