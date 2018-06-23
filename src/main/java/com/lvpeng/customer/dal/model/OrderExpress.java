/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.customer.dal.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-07 13:45:58
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class OrderExpress {

	@Id
	private String id;
	
	private int orderId;
	private String expressNo;
	private String expressType;
	private String telPhone;
	private String status;
	private String expressBases;
	private String note;
	private Date createTime;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public String getExpressNo() {
		return expressNo;
	}

	public void setExpressType(String expressType) {
		this.expressType = expressType;
	}

	public String getExpressType() {
		return expressType;
	}

	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}

	public String getTelPhone() {
		return telPhone;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setExpressBases(String expressBases) {
		this.expressBases = expressBases;
	}

	public String getExpressBases() {
		return expressBases;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNote() {
		return note;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

}