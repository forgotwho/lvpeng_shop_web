/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.dal.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-07 11:31:33
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class BonusRule {

	@Id
	private String id;
	private int cardId;
	private int initIncreaseBonus;
	private int costMoneyUnit;
	private int increaseBonus;
	private int maxIncreaseBonus;
	private int costBonusUnit;
	private int reduceMoney;
	private int limitMoney;
	private int maxReduceBonus;
	private Date createTime;
	private int isCost;

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setInitIncreaseBonus(int initIncreaseBonus) {
		this.initIncreaseBonus = initIncreaseBonus;
	}

	public int getInitIncreaseBonus() {
		return initIncreaseBonus;
	}

	public void setCostMoneyUnit(int costMoneyUnit) {
		this.costMoneyUnit = costMoneyUnit;
	}

	public int getCostMoneyUnit() {
		return costMoneyUnit;
	}

	public void setIncreaseBonus(int increaseBonus) {
		this.increaseBonus = increaseBonus;
	}

	public int getIncreaseBonus() {
		return increaseBonus;
	}

	public void setMaxIncreaseBonus(int maxIncreaseBonus) {
		this.maxIncreaseBonus = maxIncreaseBonus;
	}

	public int getMaxIncreaseBonus() {
		return maxIncreaseBonus;
	}

	public void setCostBonusUnit(int costBonusUnit) {
		this.costBonusUnit = costBonusUnit;
	}

	public int getCostBonusUnit() {
		return costBonusUnit;
	}

	public void setReduceMoney(int reduceMoney) {
		this.reduceMoney = reduceMoney;
	}

	public int getReduceMoney() {
		return reduceMoney;
	}

	public void setLimitMoney(int limitMoney) {
		this.limitMoney = limitMoney;
	}

	public int getLimitMoney() {
		return limitMoney;
	}

	public void setMaxReduceBonus(int maxReduceBonus) {
		this.maxReduceBonus = maxReduceBonus;
	}

	public int getMaxReduceBonus() {
		return maxReduceBonus;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setIsCost(int isCost) {
		this.isCost = isCost;
	}

	public int getIsCost() {
		return isCost;
	}

}