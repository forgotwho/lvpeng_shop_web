/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.dal.model;
import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-07 14:4:51
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class MemberPresentDetail {

	@Id
	private String id;
    private int memberId;
    private int ruleId;
    private int currentCount;
    private int totalCount;
    private int presentCount;
    private Date updateTime;
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    public void setMemberId(int memberId) {
         this.memberId = memberId;
     }
     public int getMemberId() {
         return memberId;
     }

    public void setRuleId(int ruleId) {
         this.ruleId = ruleId;
     }
     public int getRuleId() {
         return ruleId;
     }

    public void setCurrentCount(int currentCount) {
         this.currentCount = currentCount;
     }
     public int getCurrentCount() {
         return currentCount;
     }

    public void setTotalCount(int totalCount) {
         this.totalCount = totalCount;
     }
     public int getTotalCount() {
         return totalCount;
     }

    public void setPresentCount(int presentCount) {
         this.presentCount = presentCount;
     }
     public int getPresentCount() {
         return presentCount;
     }

    public void setUpdateTime(Date updateTime) {
         this.updateTime = updateTime;
     }
     public Date getUpdateTime() {
         return updateTime;
     }

}