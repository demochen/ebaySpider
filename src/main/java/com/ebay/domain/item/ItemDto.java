package com.ebay.domain.item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ItemDto")
public class ItemDto {

	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	@Column(name = "keyWords")
	public String keyWords;
	@Column(name = "ItemId")
	public String itemId;
	@Column(name = "title")
	public String title;
	@Column(name = "viewItemURL")
	public String viewItemURL;
	@Column(name = "country")
	public String country;
	@Column(name = "galleryURL")
	public String galleryURL;
	@Column(name = "price")
	public double price;
	@Column(name = "sellCount")
	public int sellCount;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getViewItemURL() {
		return viewItemURL;
	}

	public void setViewItemURL(String viewItemURL) {
		this.viewItemURL = viewItemURL;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}



	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSellCount() {
		return sellCount;
	}

	public void setSellCount(int sellCount) {
		this.sellCount = sellCount;
	}

	public String getKeyWords() {
		return keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	public String getGalleryURL() {
		return galleryURL;
	}

	public void setGalleryURL(String galleryURL) {
		this.galleryURL = galleryURL;
	}
}
