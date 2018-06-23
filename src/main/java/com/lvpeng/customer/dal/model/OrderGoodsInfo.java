/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.customer.dal.model;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-07 13:36:39
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class OrderGoodsInfo {

	@Id
	private String id;
	
    private int goodsId;
    private String imageUrl;
    private String goodsName;
    private String goodsSku;
    private int goodsPrice;
    private int goodsSellPrice;
    private int count;
    private int innerCid;
    
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

    public void setImageUrl(String imageUrl) {
         this.imageUrl = imageUrl;
     }
     public String getImageUrl() {
         return imageUrl;
     }

    public void setGoodsName(String goodsName) {
         this.goodsName = goodsName;
     }
     public String getGoodsName() {
         return goodsName;
     }

    public void setGoodsSku(String goodsSku) {
         this.goodsSku = goodsSku;
     }
     public String getGoodsSku() {
         return goodsSku;
     }

    public void setGoodsPrice(int goodsPrice) {
         this.goodsPrice = goodsPrice;
     }
     public int getGoodsPrice() {
         return goodsPrice;
     }

    public void setGoodsSellPrice(int goodsSellPrice) {
         this.goodsSellPrice = goodsSellPrice;
     }
     public int getGoodsSellPrice() {
         return goodsSellPrice;
     }

    public void setCount(int count) {
         this.count = count;
     }
     public int getCount() {
         return count;
     }

    public void setInnerCid(int innerCid) {
         this.innerCid = innerCid;
     }
     public int getInnerCid() {
         return innerCid;
     }

}