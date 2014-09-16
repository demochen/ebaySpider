package com.ebay.domain.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerImpl implements Customer{
	
	@Id
	@Column(name = "CUSTOMER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	@Column(name="CUSTOMER_NAME")
	protected String customername;
	
    @Column(name="STAR")
    protected int star;
   
   public String getCustomername() {
		
		return customername;
	}
	public void setCustomername(String customername) {
		
		this.customername=customername;
	}

	public int getStar() {
		
		return star;
	}

	public void setStar(int star) {
		this.star=star;
	}
	

}
