/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.dal.model;
import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-07 11:15:11
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ShopChargeLimit {

	@Id
	private String id;
    private int shopId;
    private int couponLimit;
    private int memberLimit;
    private int orderLimit;
    private int mpLimit;
    private int smsLimit;
    private String chargeVersion;
    private Date createTime;
    private Date updateTime;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    
    public void setShopId(int shopId) {
         this.shopId = shopId;
     }
     public int getShopId() {
         return shopId;
     }

    public void setCouponLimit(int couponLimit) {
         this.couponLimit = couponLimit;
     }
     public int getCouponLimit() {
         return couponLimit;
     }

    public void setMemberLimit(int memberLimit) {
         this.memberLimit = memberLimit;
     }
     public int getMemberLimit() {
         return memberLimit;
     }

    public void setOrderLimit(int orderLimit) {
         this.orderLimit = orderLimit;
     }
     public int getOrderLimit() {
         return orderLimit;
     }

    public void setMpLimit(int mpLimit) {
         this.mpLimit = mpLimit;
     }
     public int getMpLimit() {
         return mpLimit;
     }

    public void setSmsLimit(int smsLimit) {
         this.smsLimit = smsLimit;
     }
     public int getSmsLimit() {
         return smsLimit;
     }

    public void setChargeVersion(String chargeVersion) {
         this.chargeVersion = chargeVersion;
     }
     public String getChargeVersion() {
         return chargeVersion;
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

}
