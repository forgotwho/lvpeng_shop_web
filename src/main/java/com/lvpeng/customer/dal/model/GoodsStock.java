/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.customer.dal.model;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-23 22:43:35
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class GoodsStock {

	@Id
	private String id;
	private int goodsId;
	private String sku;
	private int stock;

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getSku() {
		return sku;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

}