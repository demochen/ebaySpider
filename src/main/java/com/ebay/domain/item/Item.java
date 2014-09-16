package com.ebay.domain.item;

public class Item {

	/**
	 * @param args
	 */
   public Item( String itemId,String itemName,Double price){
	   this.itemId=itemId;
	   this.itemName=itemName;
	   this.price=price;
   }
	public String itemId;

	public String itemName;

	public Double price;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
