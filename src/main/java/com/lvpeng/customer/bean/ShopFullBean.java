/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.customer.bean;
import java.util.List;

import com.lvpeng.customer.dal.model.GoodsInnerCategory;
import com.lvpeng.customer.dal.model.Member;
import com.lvpeng.customer.dal.model.MemberCard;
import com.lvpeng.customer.dal.model.Notice;
import com.lvpeng.customer.dal.model.Shop;
import com.lvpeng.customer.dal.model.ShopChargeLimit;
import com.lvpeng.customer.dal.model.ShopStatusInfo;

/**
 * Auto-generated: 2018-06-23 21:50:44
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ShopFullBean {

    private Shop shop;
    private ShopStatusInfo shopStatusInfo;
    private List<Notice> notices;
    private List<String> reduceRules;
    private ShopChargeLimit shopChargeLimit;
    private MemberCard memberCard;
    private Member member;
    private List<GoodsInnerCategory> goodsInnerCategory;
    private String homePageConfig;
    private int homePageId;
    private int customPageId;
    private String campaignCoupon;
    public void setShop(Shop shop) {
         this.shop = shop;
     }
     public Shop getShop() {
         return shop;
     }

    public void setShopStatusInfo(ShopStatusInfo shopStatusInfo) {
         this.shopStatusInfo = shopStatusInfo;
     }
     public ShopStatusInfo getShopStatusInfo() {
         return shopStatusInfo;
     }

    public void setNotices(List<Notice> notices) {
         this.notices = notices;
     }
     public List<Notice> getNotices() {
         return notices;
     }

    public void setReduceRules(List<String> reduceRules) {
         this.reduceRules = reduceRules;
     }
     public List<String> getReduceRules() {
         return reduceRules;
     }

    public void setShopChargeLimit(ShopChargeLimit shopChargeLimit) {
         this.shopChargeLimit = shopChargeLimit;
     }
     public ShopChargeLimit getShopChargeLimit() {
         return shopChargeLimit;
     }

    public void setMemberCard(MemberCard memberCard) {
         this.memberCard = memberCard;
     }
     public MemberCard getMemberCard() {
         return memberCard;
     }

    public void setMember(Member member) {
         this.member = member;
     }
     public Member getMember() {
         return member;
     }

    public void setGoodsInnerCategories(List<GoodsInnerCategory> goodsInnerCategory) {
         this.goodsInnerCategory = goodsInnerCategory;
     }
     public List<GoodsInnerCategory> getGoodsInnerCategories() {
         return goodsInnerCategory;
     }

    public void setHomePageConfig(String homePageConfig) {
         this.homePageConfig = homePageConfig;
     }
     public String getHomePageConfig() {
         return homePageConfig;
     }

    public void setHomePageId(int homePageId) {
         this.homePageId = homePageId;
     }
     public int getHomePageId() {
         return homePageId;
     }

    public void setCustomPageId(int customPageId) {
         this.customPageId = customPageId;
     }
     public int getCustomPageId() {
         return customPageId;
     }

    public void setCampaignCoupon(String campaignCoupon) {
         this.campaignCoupon = campaignCoupon;
     }
     public String getCampaignCoupon() {
         return campaignCoupon;
     }

}