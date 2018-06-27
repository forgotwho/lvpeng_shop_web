/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.dal.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-23 21:50:44
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ShopStatusInfo {

	@Id
	private String id;
	private int shopId;
    private String status;
    private String beginTime;
    private String endTime;
    private boolean open;
    private Date createTime;
	private Date updateTime;
    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public void setStatus(String status) {
         this.status = status;
     }
     public String getStatus() {
         return status;
     }

    public void setBeginTime(String beginTime) {
         this.beginTime = beginTime;
     }
     public String getBeginTime() {
         return beginTime;
     }

    public void setEndTime(String endTime) {
         this.endTime = endTime;
     }
     public String getEndTime() {
         return endTime;
     }

    public void setOpen(boolean open) {
         this.open = open;
     }
     public boolean getOpen() {
         return open;
     }
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}