/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.customer.dal.model;
import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-07 14:24:19
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Notice {

	@Id
    private String id;
    private int shopId;
    private String content;
    private int isShow;
    private int isHome;
    private Date createTime;
    private Date updateTime;
    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

    public void setShopId(int shopId) {
         this.shopId = shopId;
     }
     public int getShopId() {
         return shopId;
     }

    public void setContent(String content) {
         this.content = content;
     }
     public String getContent() {
         return content;
     }

    public void setIsShow(int isShow) {
         this.isShow = isShow;
     }
     public int getIsShow() {
         return isShow;
     }

    public void setIsHome(int isHome) {
         this.isHome = isHome;
     }
     public int getIsHome() {
         return isHome;
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