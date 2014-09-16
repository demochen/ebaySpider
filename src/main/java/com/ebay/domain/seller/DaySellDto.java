package com.ebay.domain.seller;

public class DaySellDto {

	/**
	 * @param args
	 */
	public DaySellDto(String sellerName ,int day, double sellMoney) {
		this.sellerName = sellerName;
		this.sellMoney = sellMoney;
		this.day = day;
	}

	public String sellerName;

	public double sellMoney;

	public int day;

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

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
}
