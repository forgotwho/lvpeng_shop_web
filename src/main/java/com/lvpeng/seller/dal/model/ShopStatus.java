/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.dal.model;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-07 14:21:49
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ShopStatus {

	@Id
	private String id;
	private int shopId;
	private String status;
	private String beginTime;
	private String endTime;
	private boolean open;
	

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

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public boolean getOpen() {
		return open;
	}

}