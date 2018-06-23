/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.dal.model;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-07 13:13:42
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