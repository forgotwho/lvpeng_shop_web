/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.dal.model;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-07 13:50:50
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class CouponCustomerCount {

	@Id
	private String id;
    private int couponId;
    private int acceptCount;
    private int usedCount;
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
    public void setCouponId(int couponId) {
         this.couponId = couponId;
     }
     public int getCouponId() {
         return couponId;
     }

    public void setAcceptCount(int acceptCount) {
         this.acceptCount = acceptCount;
     }
     public int getAcceptCount() {
         return acceptCount;
     }

    public void setUsedCount(int usedCount) {
         this.usedCount = usedCount;
     }
     public int getUsedCount() {
         return usedCount;
     }

}