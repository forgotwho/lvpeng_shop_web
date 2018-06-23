/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.customer.dal.model;

import org.springframework.data.annotation.Id;

import com.lvpeng.customer.bean.GoodsSkuDetailBase;

/**
 * Auto-generated: 2018-06-07 13:13:42
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class GoodsSkuDetail {

	@Id
	private String id;
    private String sku;
    private GoodsSkuDetailBase goodsSkuDetailBase;
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    public void setSku(String sku) {
         this.sku = sku;
     }
     public String getSku() {
         return sku;
     }

    public void setGoodsSkuDetailBase(GoodsSkuDetailBase goodsSkuDetailBase) {
         this.goodsSkuDetailBase = goodsSkuDetailBase;
     }
     public GoodsSkuDetailBase getGoodsSkuDetailBase() {
         return goodsSkuDetailBase;
     }

}