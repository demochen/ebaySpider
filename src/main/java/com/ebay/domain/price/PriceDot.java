package com.ebay.domain.price;

public class PriceDot {

	/**
	 * @param args
	 */
    public PriceDot(double price,long count){
		this.price=price;
		this.count=(int) count;
	}
	public double price;
	
	public int count;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
