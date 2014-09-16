package com.ebay.domain.seller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RecentFeedbackratings")
public class RecentFeedbackratings {
	@Id
	@Column(name = "RecentFeedRate_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	@Column(name="SellerName")
	protected String sellerName;
	
	@Column(name="one_Positive")
	protected int one_Positive;
	
	@Column(name="one_Neutral")
	protected int one_Neutral;
	
	@Column(name="one_Negative")
	protected int one_Negative;
	
	@Column(name="six_Positive")
	protected int six_Positive;
	
	@Column(name="six_Neutral")
	protected int six_Neutral;
	
	@Column(name="six_Negative")
	protected int six_Negative;
	
	@Column(name="twe_Positive")
	protected int twe_Positive;
	
	@Column(name="twe_Neutral")
	protected int twe_Neutral;
	
	@Column(name="twe_Negative")
	protected int twe_Negative;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public int getOne_Positive() {
		return one_Positive;
	}

	public void setOne_Positive(int one_Positive) {
		this.one_Positive = one_Positive;
	}

	public int getOne_Neutral() {
		return one_Neutral;
	}

	public void setOne_Neutral(int one_Neutral) {
		this.one_Neutral = one_Neutral;
	}

	public int getOne_Negative() {
		return one_Negative;
	}

	public void setOne_Negative(int one_Negative) {
		this.one_Negative = one_Negative;
	}

	public int getSix_Positive() {
		return six_Positive;
	}

	public void setSix_Positive(int six_Positive) {
		this.six_Positive = six_Positive;
	}

	public int getSix_Neutral() {
		return six_Neutral;
	}

	public void setSix_Neutral(int six_Neutral) {
		this.six_Neutral = six_Neutral;
	}

	public int getSix_Negative() {
		return six_Negative;
	}

	public void setSix_Negative(int six_Negative) {
		this.six_Negative = six_Negative;
	}

	public int getTwe_Positive() {
		return twe_Positive;
	}

	public void setTwe_Positive(int twe_Positive) {
		this.twe_Positive = twe_Positive;
	}

	public int getTwe_Neutral() {
		return twe_Neutral;
	}

	public void setTwe_Neutral(int twe_Neutral) {
		this.twe_Neutral = twe_Neutral;
	}

	public int getTwe_Negative() {
		return twe_Negative;
	}

	public void setTwe_Negative(int twe_Negative) {
		this.twe_Negative = twe_Negative;
	}
	
}
