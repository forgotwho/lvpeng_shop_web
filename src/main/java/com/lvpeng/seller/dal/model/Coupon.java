/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.dal.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-07 13:50:50
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Coupon {

	@Id
	private int id;
    private String name;
    private String type;
    private int price;
    private int limitPrice;
    private int shopId;
    private String beginTime;
    private String dueTime;
    private int stock;
    private int perLimit;
    private int suitLimit;
    private Date createTime;
    private int isCampaign;
    private String campaignImg;
    private int campaignScene;
    private int isPlatform;
    private int supportType;
    private int isSelfUse;
    private int isPresent;
    private int presentFee;
    private int isShow;
    private int isShowHome;
    private String desc;
    private List<String> goodsIdList;
    private CouponCustomerCount couponCustomerCount;
    private boolean sendNow;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setPrice(int price) {
         this.price = price;
     }
     public int getPrice() {
         return price;
     }

    public void setLimitPrice(int limitPrice) {
         this.limitPrice = limitPrice;
     }
     public int getLimitPrice() {
         return limitPrice;
     }

    public void setShopId(int shopId) {
         this.shopId = shopId;
     }
     public int getShopId() {
         return shopId;
     }

    public void setBeginTime(String beginTime) {
         this.beginTime = beginTime;
     }
     public String getBeginTime() {
         return beginTime;
     }

    public void setDueTime(String dueTime) {
         this.dueTime = dueTime;
     }
     public String getDueTime() {
         return dueTime;
     }

    public void setStock(int stock) {
         this.stock = stock;
     }
     public int getStock() {
         return stock;
     }

    public void setPerLimit(int perLimit) {
         this.perLimit = perLimit;
     }
     public int getPerLimit() {
         return perLimit;
     }

    public void setSuitLimit(int suitLimit) {
         this.suitLimit = suitLimit;
     }
     public int getSuitLimit() {
         return suitLimit;
     }

    public void setCreateTime(Date createTime) {
         this.createTime = createTime;
     }
     public Date getCreateTime() {
         return createTime;
     }

    public void setIsCampaign(int isCampaign) {
         this.isCampaign = isCampaign;
     }
     public int getIsCampaign() {
         return isCampaign;
     }

    public void setCampaignImg(String campaignImg) {
         this.campaignImg = campaignImg;
     }
     public String getCampaignImg() {
         return campaignImg;
     }

    public void setCampaignScene(int campaignScene) {
         this.campaignScene = campaignScene;
     }
     public int getCampaignScene() {
         return campaignScene;
     }

    public void setIsPlatform(int isPlatform) {
         this.isPlatform = isPlatform;
     }
     public int getIsPlatform() {
         return isPlatform;
     }

    public void setSupportType(int supportType) {
         this.supportType = supportType;
     }
     public int getSupportType() {
         return supportType;
     }

    public void setIsSelfUse(int isSelfUse) {
         this.isSelfUse = isSelfUse;
     }
     public int getIsSelfUse() {
         return isSelfUse;
     }

    public void setIsPresent(int isPresent) {
         this.isPresent = isPresent;
     }
     public int getIsPresent() {
         return isPresent;
     }

    public void setPresentFee(int presentFee) {
         this.presentFee = presentFee;
     }
     public int getPresentFee() {
         return presentFee;
     }

    public void setIsShow(int isShow) {
         this.isShow = isShow;
     }
     public int getIsShow() {
         return isShow;
     }

    public void setIsShowHome(int isShowHome) {
         this.isShowHome = isShowHome;
     }
     public int getIsShowHome() {
         return isShowHome;
     }

    public void setDesc(String desc) {
         this.desc = desc;
     }
     public String getDesc() {
         return desc;
     }

    public void setGoodsIdList(List<String> goodsIdList) {
         this.goodsIdList = goodsIdList;
     }
     public List<String> getGoodsIdList() {
         return goodsIdList;
     }

    public void setCouponCustomerCount(CouponCustomerCount couponCustomerCount) {
         this.couponCustomerCount = couponCustomerCount;
     }
     public CouponCustomerCount getCouponCustomerCount() {
         return couponCustomerCount;
     }

    public void setSendNow(boolean sendNow) {
         this.sendNow = sendNow;
     }
     public boolean getSendNow() {
         return sendNow;
     }


}