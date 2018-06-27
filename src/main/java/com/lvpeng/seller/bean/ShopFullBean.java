/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.bean;
import java.util.List;

import com.lvpeng.seller.dal.model.InnerCategory;
import com.lvpeng.seller.dal.model.Member;
import com.lvpeng.seller.dal.model.MemberCard;
import com.lvpeng.seller.dal.model.Notice;
import com.lvpeng.seller.dal.model.Shop;
import com.lvpeng.seller.dal.model.ShopChargeLimit;
import com.lvpeng.seller.dal.model.ShopStatus;

/**
 * Auto-generated: 2018-06-23 21:50:44
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ShopFullBean {

    private Shop shop;
    private ShopStatus shopStatusInfo;
    private List<Notice> notices;
    private List<String> reduceRules;
    private ShopChargeLimit shopChargeLimit;
    private MemberCard memberCard;
    private Member member;
    private List<InnerCategory> goodsInnerCategory;
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

    public void setShopStatusInfo(ShopStatus shopStatusInfo) {
         this.shopStatusInfo = shopStatusInfo;
     }
     public ShopStatus getShopStatusInfo() {
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

    public void setGoodsInnerCategories(List<InnerCategory> goodsInnerCategory) {
         this.goodsInnerCategory = goodsInnerCategory;
     }
     public List<InnerCategory> getGoodsInnerCategories() {
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