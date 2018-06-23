package com.lvpeng.customer.dal.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Delivery {

	@Id
	private String id;

	private int shopId;

	private String type;
	private String name;
	private String limitPrice;
	private String fee;
	private String fromLimit;
	private String fromLimit2;
	private String location;
	private String toLimit;
	private String toLimit1;
	private String toLimit2;

	private Date createTime;
	private Date updateTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLimitPrice() {
		return limitPrice;
	}
	public void setLimitPrice(String limitPrice) {
		this.limitPrice = limitPrice;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getFromLimit2() {
		return fromLimit2;
	}
	public void setFromLimit2(String fromLimit2) {
		this.fromLimit2 = fromLimit2;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getToLimit() {
		return toLimit;
	}
	public void setToLimit(String toLimit) {
		this.toLimit = toLimit;
	}
	public String getToLimit2() {
		return toLimit2;
	}
	public void setToLimit2(String toLimit2) {
		this.toLimit2 = toLimit2;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getFromLimit() {
		return fromLimit;
	}
	public void setFromLimit(String fromLimit) {
		this.fromLimit = fromLimit;
	}
	public String getToLimit1() {
		return toLimit1;
	}
	public void setToLimit1(String toLimit1) {
		this.toLimit1 = toLimit1;
	}

	

}
