package com.ebay.domain.seller;

public class SellerInfoDto {

	/**
	 * @param args
	 */
	public SellerInfoDto(String sellerName,int months,double sellMoney) {
       this.months=months;
       this.sellerName=sellerName;
       this.sellMoney=sellMoney;
	}
	public String sellerName;
	
	public double sellMoney;
	
	public int months;

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public double getSellMoney() {
		return sellMoney;
	}

	public void setSellMoney(double sellMoney) {
		this.sellMoney = sellMoney;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

}
