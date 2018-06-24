/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.customer.dal.model;
import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-23 22:17:23
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Plugin {
	@Id
    private int id;
    private int pageId;
    private int shopId;
    private String type;
    private Date createTime;
    private Date updateTime;
    private boolean isUse;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setPageId(int pageId) {
         this.pageId = pageId;
     }
     public int getPageId() {
         return pageId;
     }

    public void setShopId(int shopId) {
         this.shopId = shopId;
     }
     public int getShopId() {
         return shopId;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
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

    public void setIsUse(boolean isUse) {
         this.isUse = isUse;
     }
     public boolean getIsUse() {
         return isUse;
     }

}