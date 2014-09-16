package com.ebay.domain.seller;

public class SellerDto {

	public int successCount;

	public int failedCount;

	public double totalSales;

	public int days;

	public double sellPerday;
	
	public  int allAccount;

	public SellerDto(int successCount, int failedCount, double totalSales,
			int days, double sellPerday) {
           this.successCount=successCount;
           this.failedCount=failedCount;
           this.totalSales=totalSales;
           this.days=days;
           this.sellPerday=sellPerday;
           this.allAccount=	successCount+  failedCount; 
	}

	public int getSuccessCount() {
		return successCount;
	}

	public void setSuccessCount(int successCount) {
		this.successCount = successCount;
	}

	public int getFailedCount() {
		return failedCount;
	}

	public void setFailedCount(int failedCount) {
		this.failedCount = failedCount;
	}

	public double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public double getSellPerday() {
		return sellPerday;
	}

	public void setSellPerday(double sellPerday) {
		this.sellPerday = sellPerday;
	}

	public int getAllAccount() {
		return allAccount;
	}

	public void setAllAccount(int allAccount) {
		this.allAccount = allAccount;
	}

}
