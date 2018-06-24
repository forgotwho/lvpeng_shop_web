/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.customer.dal.model;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Auto-generated: 2018-06-23 23:22:45
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Order {

	@Id
	private String id;
    private int orderId;
    private String uuid;
    private int customerId;
    private int status;
    private double dealPrice;
    private double finalPrice;
    private int couponUsedId;
    private String message;
    private String address;
    private String receiveName;
    private String receivePhone;
    private int shopId;
    private String shopName;
    private int paymentType;
    private Date orderTime;
    private Date paymentTime;
    private Date sendedTime;
    private String closeTime;
    private Date updateTime;
    private String finishTime;
    private String reqRefundTime;
    private String refundTime;
    private String takeOrderTime;
    private String arrivedTime;
    private String receivedTime;
    private int postFee;
    private String deliveryType;
    private int couponPrice;
    private String sellerNote;
    private String formId;
    private int reduceFee;
    private int orderType;
    private int leAppid;
    private int leId;
    private String arriveTime;
    private int discount;
    private int discountPrice;
    private int bonus;
    private int bonusPrice;
    private int memberId;
    private String source;
    private String onlinePayType;
    @DBRef
    private List<OrderGoodsInfo> orderGoodsInfos;
    private List<String> orderRefunds;
    private String orderExpress;
    private String customer;
    private String orderCloseNote;
    @DBRef
    private List<OrderPriceHistory> orderPriceHistory;
    public void setOrderId(int orderId) {
         this.orderId = orderId;
     }
     public int getOrderId() {
         return orderId;
     }

    public void setUuid(String uuid) {
         this.uuid = uuid;
     }
     public String getUuid() {
         return uuid;
     }

    public void setCustomerId(int customerId) {
         this.customerId = customerId;
     }
     public int getCustomerId() {
         return customerId;
     }

    public void setStatus(int status) {
         this.status = status;
     }
     public int getStatus() {
         return status;
     }

    public void setDealPrice(double dealPrice) {
         this.dealPrice = dealPrice;
     }
     public double getDealPrice() {
         return dealPrice;
     }

    public void setFinalPrice(double finalPrice) {
         this.finalPrice = finalPrice;
     }
     public double getFinalPrice() {
         return finalPrice;
     }

    public void setCouponUsedId(int couponUsedId) {
         this.couponUsedId = couponUsedId;
     }
     public int getCouponUsedId() {
         return couponUsedId;
     }

    public void setMessage(String message) {
         this.message = message;
     }
     public String getMessage() {
         return message;
     }

    public void setAddress(String address) {
         this.address = address;
     }
     public String getAddress() {
         return address;
     }

    public void setReceiveName(String receiveName) {
         this.receiveName = receiveName;
     }
     public String getReceiveName() {
         return receiveName;
     }

    public void setReceivePhone(String receivePhone) {
         this.receivePhone = receivePhone;
     }
     public String getReceivePhone() {
         return receivePhone;
     }

    public void setShopId(int shopId) {
         this.shopId = shopId;
     }
     public int getShopId() {
         return shopId;
     }

    public void setShopName(String shopName) {
         this.shopName = shopName;
     }
     public String getShopName() {
         return shopName;
     }

    public void setPaymentType(int paymentType) {
         this.paymentType = paymentType;
     }
     public int getPaymentType() {
         return paymentType;
     }

    public void setOrderTime(Date orderTime) {
         this.orderTime = orderTime;
     }
     public Date getOrderTime() {
         return orderTime;
     }

    public void setPaymentTime(Date paymentTime) {
         this.paymentTime = paymentTime;
     }
     public Date getPaymentTime() {
         return paymentTime;
     }

    public void setSendedTime(Date sendedTime) {
         this.sendedTime = sendedTime;
     }
     public Date getSendedTime() {
         return sendedTime;
     }

    public void setCloseTime(String closeTime) {
         this.closeTime = closeTime;
     }
     public String getCloseTime() {
         return closeTime;
     }

    public void setUpdateTime(Date updateTime) {
         this.updateTime = updateTime;
     }
     public Date getUpdateTime() {
         return updateTime;
     }

    public void setFinishTime(String finishTime) {
         this.finishTime = finishTime;
     }
     public String getFinishTime() {
         return finishTime;
     }

    public void setReqRefundTime(String reqRefundTime) {
         this.reqRefundTime = reqRefundTime;
     }
     public String getReqRefundTime() {
         return reqRefundTime;
     }

    public void setRefundTime(String refundTime) {
         this.refundTime = refundTime;
     }
     public String getRefundTime() {
         return refundTime;
     }

    public void setTakeOrderTime(String takeOrderTime) {
         this.takeOrderTime = takeOrderTime;
     }
     public String getTakeOrderTime() {
         return takeOrderTime;
     }

    public void setArrivedTime(String arrivedTime) {
         this.arrivedTime = arrivedTime;
     }
     public String getArrivedTime() {
         return arrivedTime;
     }

    public void setReceivedTime(String receivedTime) {
         this.receivedTime = receivedTime;
     }
     public String getReceivedTime() {
         return receivedTime;
     }

    public void setPostFee(int postFee) {
         this.postFee = postFee;
     }
     public int getPostFee() {
         return postFee;
     }

    public void setDeliveryType(String deliveryType) {
         this.deliveryType = deliveryType;
     }
     public String getDeliveryType() {
         return deliveryType;
     }

    public void setCouponPrice(int couponPrice) {
         this.couponPrice = couponPrice;
     }
     public int getCouponPrice() {
         return couponPrice;
     }

    public void setSellerNote(String sellerNote) {
         this.sellerNote = sellerNote;
     }
     public String getSellerNote() {
         return sellerNote;
     }

    public void setFormId(String formId) {
         this.formId = formId;
     }
     public String getFormId() {
         return formId;
     }

    public void setReduceFee(int reduceFee) {
         this.reduceFee = reduceFee;
     }
     public int getReduceFee() {
         return reduceFee;
     }

    public void setOrderType(int orderType) {
         this.orderType = orderType;
     }
     public int getOrderType() {
         return orderType;
     }

    public void setLeAppid(int leAppid) {
         this.leAppid = leAppid;
     }
     public int getLeAppid() {
         return leAppid;
     }

    public void setLeId(int leId) {
         this.leId = leId;
     }
     public int getLeId() {
         return leId;
     }

    public void setArriveTime(String arriveTime) {
         this.arriveTime = arriveTime;
     }
     public String getArriveTime() {
         return arriveTime;
     }

    public void setDiscount(int discount) {
         this.discount = discount;
     }
     public int getDiscount() {
         return discount;
     }

    public void setDiscountPrice(int discountPrice) {
         this.discountPrice = discountPrice;
     }
     public int getDiscountPrice() {
         return discountPrice;
     }

    public void setBonus(int bonus) {
         this.bonus = bonus;
     }
     public int getBonus() {
         return bonus;
     }

    public void setBonusPrice(int bonusPrice) {
         this.bonusPrice = bonusPrice;
     }
     public int getBonusPrice() {
         return bonusPrice;
     }

    public void setMemberId(int memberId) {
         this.memberId = memberId;
     }
     public int getMemberId() {
         return memberId;
     }

    public void setSource(String source) {
         this.source = source;
     }
     public String getSource() {
         return source;
     }

    public void setOnlinePayType(String onlinePayType) {
         this.onlinePayType = onlinePayType;
     }
     public String getOnlinePayType() {
         return onlinePayType;
     }

    public void setOrderGoodsInfos(List<OrderGoodsInfo> orderGoodsInfos) {
         this.orderGoodsInfos = orderGoodsInfos;
     }
     public List<OrderGoodsInfo> getOrderGoodsInfos() {
         return orderGoodsInfos;
     }

    public void setOrderRefunds(List<String> orderRefunds) {
         this.orderRefunds = orderRefunds;
     }
     public List<String> getOrderRefunds() {
         return orderRefunds;
     }

    public void setOrderExpress(String orderExpress) {
         this.orderExpress = orderExpress;
     }
     public String getOrderExpress() {
         return orderExpress;
     }

    public void setCustomer(String customer) {
         this.customer = customer;
     }
     public String getCustomer() {
         return customer;
     }

    public void setOrderCloseNote(String orderCloseNote) {
         this.orderCloseNote = orderCloseNote;
     }
     public String getOrderCloseNote() {
         return orderCloseNote;
     }

    public void setOrderPriceHistory(List<OrderPriceHistory> orderPriceHistory) {
         this.orderPriceHistory = orderPriceHistory;
     }
     public List<OrderPriceHistory> getOrderPriceHistory() {
         return orderPriceHistory;
     }

}