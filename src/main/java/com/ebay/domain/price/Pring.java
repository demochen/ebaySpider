package com.ebay.domain.price;

public class Pring {

	/**
	 * @param args
	 */
	public Pring (String interval,int count){
		this.Interval=interval;
		this.count=count;
	}
	public String Interval;

	public int count;

	public String getInterval() {
		return Interval;
	}

	public void setInterval(String interval) {
		Interval = interval;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
