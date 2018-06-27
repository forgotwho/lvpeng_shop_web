/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.dal.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-07 11:31:33
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class MemberPresentRule {

	@Id
	private int id;
	private String ruleName;
	private int cardId;
	private int limitCount;
	private int presentCouponId;
	private int shopId;
	private String unit;
	private Date createTime;
	private List<CategoryRule> categoryList;
	private List<GoodsRule> goodsList;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setLimitCount(int limitCount) {
		this.limitCount = limitCount;
	}

	public int getLimitCount() {
		return limitCount;
	}

	public void setPresentCouponId(int presentCouponId) {
		this.presentCouponId = presentCouponId;
	}

	public int getPresentCouponId() {
		return presentCouponId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getShopId() {
		return shopId;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getUnit() {
		return unit;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCategoryList(List<CategoryRule> categoryList) {
		this.categoryList = categoryList;
	}

	public List<CategoryRule> getCategoryList() {
		return categoryList;
	}

	public void setGoodsList(List<GoodsRule> goodsList) {
		this.goodsList = goodsList;
	}

	public List<GoodsRule> getGoodsList() {
		return goodsList;
	}

}