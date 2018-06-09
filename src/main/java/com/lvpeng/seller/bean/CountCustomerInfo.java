package com.lvpeng.seller.bean;

import java.util.Date;

public class CountCustomerInfo {

	private Date lastOrderTime;

	private double totalPrice;

	private int totalOrderCount;

	private int totalCouponCount;

	public Date getLastOrderTime() {
		return lastOrderTime;
	}

	public void setLastOrderTime(Date lastOrderTime) {
		this.lastOrderTime = lastOrderTime;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getTotalOrderCount() {
		return totalOrderCount;
	}

	public void setTotalOrderCount(int totalOrderCount) {
		this.totalOrderCount = totalOrderCount;
	}

	public int getTotalCouponCount() {
		return totalCouponCount;
	}

	public void setTotalCouponCount(int totalCouponCount) {
		this.totalCouponCount = totalCouponCount;
	}
	
	

}
