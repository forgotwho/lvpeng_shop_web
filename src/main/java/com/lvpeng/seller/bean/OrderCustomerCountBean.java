/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.bean;
import java.util.Date;

import com.lvpeng.seller.dal.model.Customer;
import com.lvpeng.seller.dal.model.Member;

/**
 * Auto-generated: 2018-06-07 14:4:51
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class OrderCustomerCountBean {

    private double countValue;
    private Customer customer;
    private Member member;
    public void setCountValue(double countValue) {
         this.countValue = countValue;
     }
     public double getCountValue() {
         return countValue;
     }

    public void setCustomer(Customer customer) {
         this.customer = customer;
     }
     public Customer getCustomer() {
         return customer;
     }

    public void setMember(Member member) {
         this.member = member;
     }
     public Member getMember() {
         return member;
     }

}