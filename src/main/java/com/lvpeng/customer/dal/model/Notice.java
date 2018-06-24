/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.customer.dal.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-23 21:50:44
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Notice {

	@Id
	private int id;
	private int shopId;
	private String content;
	private int isShow;
	private int isHome;
	private Date createTime;
	private Date updateTime;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getShopId() {
		return shopId;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setIsShow(int isShow) {
		this.isShow = isShow;
	}

	public int getIsShow() {
		return isShow;
	}

	public void setIsHome(int isHome) {
		this.isHome = isHome;
	}

	public int getIsHome() {
		return isHome;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

}