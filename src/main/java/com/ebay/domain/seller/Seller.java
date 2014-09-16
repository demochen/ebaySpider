package com.ebay.domain.seller;

import java.util.Date;

public interface Seller {

	public String getSellerName();

	public void setSellerName(String sellerName);

	public String getCountry();

	public void setCountry(String country);

	public int getStar();

	public void setStar(int star);

	public Date getSinceDate();

	public void setSinceDate(Date sinceDate);
}
