package com.ebay.domain.item;

public class RecomendPrice {

	/**
	 * @param args
	 */
	public RecomendPrice(double minPrice, double avgPrice, double maxPrice) {

		this.avgPrice = avgPrice;
		this.maxPrice = maxPrice;
		this.minPrice = minPrice;
	}

	public double minPrice;

	public double avgPrice;

	public double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}

	public double getAvgPrice() {
		return avgPrice;
	}

	public void setAvgPrice(double avgPrice) {
		this.avgPrice = avgPrice;
	}

	public double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public double maxPrice;

}
