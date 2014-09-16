package com.ebay.dao.customer;

import java.util.List;

import com.ebay.domain.customer.Customer;

public interface CustomerDao {
	public Customer save(Customer customer);

	public List<Customer> getCustomers();
}
