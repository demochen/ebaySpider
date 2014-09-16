package com.ebay.domain.seller;

public class WeekSellInfo {

	/**
	 * @param args
	 */
	public WeekSellInfo(String sellerName,int week,double sellMoney) {
	       this.week=week;
	       this.sellerName=sellerName;
	       this.sellMoney=sellMoney;
		}
	public String sellerName;
	
	public double sellMoney;
	
	public int week;

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

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

}
