/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.bean;

import java.util.Date;
import java.util.List;

import com.lvpeng.seller.dal.model.DiscountCategory;
import com.lvpeng.seller.dal.model.DiscountGoods;

/**
 * Auto-generated: 2018-06-07 11:31:33
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class DiscountRuleBean {

	private String id;
	private int cardId;
	private int level;
	private String levelName;
	private int discount;
	private int upgradeFee;
	private Date createTime;
	private List<DiscountCategory> discountCategoryLists;
	private List<DiscountGoods> discountGoodsLists;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setUpgradeFee(int upgradeFee) {
		this.upgradeFee = upgradeFee;
	}

	public int getUpgradeFee() {
		return upgradeFee;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setDiscountCategoryLists(List<DiscountCategory> discountCategoryLists) {
		this.discountCategoryLists = discountCategoryLists;
	}

	public List<DiscountCategory> getDiscountCategoryLists() {
		return discountCategoryLists;
	}

	public void setDiscountGoodsLists(List<DiscountGoods> discountGoodsLists) {
		this.discountGoodsLists = discountGoodsLists;
	}

	public List<DiscountGoods> getDiscountGoodsLists() {
		return discountGoodsLists;
	}

}