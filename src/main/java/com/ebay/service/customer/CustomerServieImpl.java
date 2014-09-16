package com.ebay.service.customer;

import java.util.List;

import javax.annotation.Resource;

import com.ebay.dao.customer.CustomerDao;
import com.ebay.domain.customer.Customer;

public class CustomerServieImpl implements CustomerService{
    @Resource(name="eCustomerDao")
    protected CustomerDao customerdao;
	public List<Customer> getCustomers() {
		
		return customerdao.getCustomers();
	}

}
