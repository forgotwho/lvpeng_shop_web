/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Auto-generated: 2018-06-07 14:4:51
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Member {

	@Id
	private String id;
	private int memberId;
	private int cardId;
	private String memberNumber;
	private int customerId;
	private int shopId;
	private String mpOpenid;
	private String appOpenid;
	private int bonus;
	private int balance;
	private Date acceptTime;
	private String phone;
	private double totalCost;
	private String remarkName;
	private int level;
	private String codeUrl;
	private String birthday;
	private String sex;
	private String address;
	private String note;
	private Date updateTime;
	private String nickName;
	private String offlineCard;
	private int customDiscount;
	@DBRef
	private DiscountRule discountRule;
	@DBRef
	private List<MemberPresentDetail> memberPresentDetails;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
	}

	public String getMemberNumber() {
		return memberNumber;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getShopId() {
		return shopId;
	}

	public void setMpOpenid(String mpOpenid) {
		this.mpOpenid = mpOpenid;
	}

	public String getMpOpenid() {
		return mpOpenid;
	}

	public void setAppOpenid(String appOpenid) {
		this.appOpenid = appOpenid;
	}

	public String getAppOpenid() {
		return appOpenid;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setAcceptTime(Date acceptTime) {
		this.acceptTime = acceptTime;
	}

	public Date getAcceptTime() {
		return acceptTime;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setRemarkName(String remarkName) {
		this.remarkName = remarkName;
	}

	public String getRemarkName() {
		return remarkName;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}

	public String getCodeUrl() {
		return codeUrl;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNote() {
		return note;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setOfflineCard(String offlineCard) {
		this.offlineCard = offlineCard;
	}

	public String getOfflineCard() {
		return offlineCard;
	}

	public void setCustomDiscount(int customDiscount) {
		this.customDiscount = customDiscount;
	}

	public int getCustomDiscount() {
		return customDiscount;
	}

	public void setDiscountRule(DiscountRule discountRule) {
		this.discountRule = discountRule;
	}

	public DiscountRule getDiscountRule() {
		return discountRule;
	}

	public void setMemberPresentDetails(List<MemberPresentDetail> memberPresentDetails) {
		this.memberPresentDetails = memberPresentDetails;
	}

	public List<MemberPresentDetail> getMemberPresentDetails() {
		return memberPresentDetails;
	}

}
