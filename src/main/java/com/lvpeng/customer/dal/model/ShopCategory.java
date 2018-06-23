/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.customer.dal.model;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-07 11:30:1
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ShopCategory {

	@Id
    private int id;
    private String name;
    private int pid;
    private String createTime;
    private String updateTime;
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

    public void setPid(int pid) {
         this.pid = pid;
     }
     public int getPid() {
         return pid;
     }

    public void setCreateTime(String createTime) {
         this.createTime = createTime;
     }
     public String getCreateTime() {
         return createTime;
     }

    public void setUpdateTime(String updateTime) {
         this.updateTime = updateTime;
     }
     public String getUpdateTime() {
         return updateTime;
     }

}