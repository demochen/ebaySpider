package com.ebay.domain.seller;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="SELLER")
public class SellerImpl implements Seller {
	@Id
	@Column(name = "Seller_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	@Column(name="SellerName")
	public String SellerName;
	
	@Column(name="Country")
	public String country;
	
	@Column(name="Star")
	public int star;
	
	@Column(name="CreateDate")
	public Date sinceDate;
	
	@Override
	public String getSellerName() {
		return this.SellerName;
	}
	@Override
	public void setSellerName(String sellerName) {
		this.SellerName=sellerName;
	}
	@Override
	public String getCountry() {
		return this.country;
	}
	@Override
	public void setCountry(String country) {
		this.country=country;
	}
	@Override
	public int getStar() {
		return this.star;
	}
	@Override
	public void setStar(int star) {
		this.star=star;
	}
	@Override
	public Date getSinceDate() {
		return this.sinceDate;
	}
	@Override
	public void setSinceDate(Date sinceDate) {
            this.sinceDate=sinceDate;		
	}
}
