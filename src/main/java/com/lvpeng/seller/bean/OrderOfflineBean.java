/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.bean;

/**
 * Auto-generated: 2018-06-23 23:47:58
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class OrderOfflineBean {

    private int orderType;
    private int paymentType;
    private String dealPrice;
    private String finalPrice;
    public void setOrderType(int orderType) {
         this.orderType = orderType;
     }
     public int getOrderType() {
         return orderType;
     }

    public void setPaymentType(int paymentType) {
         this.paymentType = paymentType;
     }
     public int getPaymentType() {
         return paymentType;
     }

    public void setDealPrice(String dealPrice) {
         this.dealPrice = dealPrice;
     }
     public String getDealPrice() {
         return dealPrice;
     }

    public void setFinalPrice(String finalPrice) {
         this.finalPrice = finalPrice;
     }
     public String getFinalPrice() {
         return finalPrice;
     }

}