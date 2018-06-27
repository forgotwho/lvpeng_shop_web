/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.dal.model;
import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-23 22:17:23
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Component {
	@Id
    private int id;
    private String type;
    private int pageId;
    private int shopId;
    private int seq;
    private String title;
    private String param;
    private String data;
    private Date createTime;
    private Date updateTime;
    private boolean isUse;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
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

    public void setSeq(int seq) {
         this.seq = seq;
     }
     public int getSeq() {
         return seq;
     }

    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setParam(String param) {
         this.param = param;
     }
     public String getParam() {
         return param;
     }

    public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public void setUse(boolean isUse) {
		this.isUse = isUse;
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