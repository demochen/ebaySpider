package com.ebay.domain.feedback;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "FEEDBACK")
public class FeedBack {
	@Id
	@Column(name = "FEEDBACK_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedbackId;

	@Column(name = "ITEM_ID")
	private String itemId;
	@Column(name = "ITEM_Name")
	private String itemName;
	@Column(name = "COMMENT")
	private String comment;
	@Column(name = "Feed_Date")
	private Date date;

	@Column(name = "Seller")
	private String sellername;
	@Column(name = "PRICE")
	private Double price;

	@Column(name = "ATTITUDE")
	private String attitude;

	@Column(name = "STAR_LEVEL")
	private int star;

	public String getAttitude() {
		return attitude;
	}

	public void setAttitude(String attitude) {
		this.attitude = attitude;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getItemId() {
		return itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public String getComment() {
		return comment;
	}

	public Date getDate() {
		return date;
	}

	public Double getPrice() {
		return price;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public String getSellername() {
		return sellername;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}
}
