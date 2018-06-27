/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.dal.model;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-23 23:2:12
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class FavoriteGoods {

	@Id
	private String id;
	private int goodsId;
	private String goodsSku;
	private String goodsName;
	private int innerCid;
	private String goodsImage;
	private double goodsPrice;
	private int goodsNum;
	private String totalPrice;
	private double originalPrice;
	private boolean check;
	private Quantity quantity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsSku(String goodsSku) {
		this.goodsSku = goodsSku;
	}

	public String getGoodsSku() {
		return goodsSku;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setInnerCid(int innerCid) {
		this.innerCid = innerCid;
	}

	public int getInnerCid() {
		return innerCid;
	}

	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}

	public String getGoodsImage() {
		return goodsImage;
	}

	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public double getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}

	public int getGoodsNum() {
		return goodsNum;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public boolean getCheck() {
		return check;
	}

	public void setQuantity(Quantity quantity) {
		this.quantity = quantity;
	}

	public Quantity getQuantity() {
		return quantity;
	}

}