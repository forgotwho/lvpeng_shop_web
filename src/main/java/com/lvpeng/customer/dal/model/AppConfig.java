package com.lvpeng.customer.dal.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class AppConfig {

	@Id
	private String id;
	private String appCode;
	private int shopId;
	private String shopType;
	private String wxappId;
	private String wxappSecret;
	private Date createTime;
	private Date updateTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopType() {
		return shopType;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getWxappId() {
		return wxappId;
	}

	public void setWxappId(String wxappId) {
		this.wxappId = wxappId;
	}

	public String getWxappSecret() {
		return wxappSecret;
	}

	public void setWxappSecret(String wxappSecret) {
		this.wxappSecret = wxappSecret;
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

}
