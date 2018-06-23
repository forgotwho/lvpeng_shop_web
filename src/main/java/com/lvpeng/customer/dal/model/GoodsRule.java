/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.customer.dal.model;
import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-07 11:31:33
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class GoodsRule {

	@Id
	private String id;
    private int ruleId;
    private int goodsId;
    private Date createTime;
    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    public void setRuleId(int ruleId) {
         this.ruleId = ruleId;
     }
     public int getRuleId() {
         return ruleId;
     }

    public void setGoodsId(int goodsId) {
         this.goodsId = goodsId;
     }
     public int getGoodsId() {
         return goodsId;
     }

    public void setCreateTime(Date createTime) {
         this.createTime = createTime;
     }
     public Date getCreateTime() {
         return createTime;
     }

}