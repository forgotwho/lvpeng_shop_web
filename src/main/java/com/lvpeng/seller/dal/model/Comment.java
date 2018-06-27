/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.dal.model;
import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-23 22:52:58
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Comment {

	@Id
    private int id;
    private int orderId;
    private int customerId;
    private int shopId;
    private int goodsId;
    private int star;
    private Date orderTime;
    private String comment;
    private String images;
    private String sku;
    private Date createTime;
    private Date updateTime;
    private String customer;
    private String goods;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setOrderId(int orderId) {
         this.orderId = orderId;
     }
     public int getOrderId() {
         return orderId;
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

    public void setGoodsId(int goodsId) {
         this.goodsId = goodsId;
     }
     public int getGoodsId() {
         return goodsId;
     }

    public void setStar(int star) {
         this.star = star;
     }
     public int getStar() {
         return star;
     }

    public void setOrderTime(Date orderTime) {
         this.orderTime = orderTime;
     }
     public Date getOrderTime() {
         return orderTime;
     }

    public void setComment(String comment) {
         this.comment = comment;
     }
     public String getComment() {
         return comment;
     }

    public void setImages(String images) {
         this.images = images;
     }
     public String getImages() {
         return images;
     }

    public void setSku(String sku) {
         this.sku = sku;
     }
     public String getSku() {
         return sku;
     }

    public void setCreateTime(Date createTime) {
         this.createTime = createTime;
     }
     public Date getCreateTime() {
         return createTime;
     }

    public void setUpdateTime(Date updateTime) {
         this.updateTime = updateTime;
     }
     public Date getUpdateTime() {
         return updateTime;
     }

    public void setCustomer(String customer) {
         this.customer = customer;
     }
     public String getCustomer() {
         return customer;
     }

    public void setGoods(String goods) {
         this.goods = goods;
     }
     public String getGoods() {
         return goods;
     }

}