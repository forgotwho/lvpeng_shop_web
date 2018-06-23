/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.customer.bean;
import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2018-06-23 22:43:35
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class GoodsBean {

    private int id;
    private String uuid;
    private String name;
    private int shopId;
    private int status;
    private double originalPrice;
    private double sellPrice;
    private int innerCid;
    private String innerCategoryName;
    private int globalCid;
    private int isRecommend;
    private int isDeleted;
    private Date createTime;
    private Date updateTime;
    private int postType;
    private int postFee;
    private String deliveryTemplateFee;
    private int deliveryTemplateId;
    private String deliveryTemplateName;
    private String subhead;
    private String type;
    private List<GoodsStocks> goodsStocks;
    private int salesVolume;
    private int favoriteCount;
    private int totalStock;
    private List<Images> images;
    private List<GoodsDetails> goodsDetails;
    private String goodsSkuInfo;
    private List<String> tags;
    private String booking;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setUuid(String uuid) {
         this.uuid = uuid;
     }
     public String getUuid() {
         return uuid;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setShopId(int shopId) {
         this.shopId = shopId;
     }
     public int getShopId() {
         return shopId;
     }

    public void setStatus(int status) {
         this.status = status;
     }
     public int getStatus() {
         return status;
     }

    public void setOriginalPrice(double originalPrice) {
         this.originalPrice = originalPrice;
     }
     public double getOriginalPrice() {
         return originalPrice;
     }

    public void setSellPrice(double sellPrice) {
         this.sellPrice = sellPrice;
     }
     public double getSellPrice() {
         return sellPrice;
     }

    public void setInnerCid(int innerCid) {
         this.innerCid = innerCid;
     }
     public int getInnerCid() {
         return innerCid;
     }

    public void setInnerCategoryName(String innerCategoryName) {
         this.innerCategoryName = innerCategoryName;
     }
     public String getInnerCategoryName() {
         return innerCategoryName;
     }

    public void setGlobalCid(int globalCid) {
         this.globalCid = globalCid;
     }
     public int getGlobalCid() {
         return globalCid;
     }

    public void setIsRecommend(int isRecommend) {
         this.isRecommend = isRecommend;
     }
     public int getIsRecommend() {
         return isRecommend;
     }

    public void setIsDeleted(int isDeleted) {
         this.isDeleted = isDeleted;
     }
     public int getIsDeleted() {
         return isDeleted;
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

    public void setPostType(int postType) {
         this.postType = postType;
     }
     public int getPostType() {
         return postType;
     }

    public void setPostFee(int postFee) {
         this.postFee = postFee;
     }
     public int getPostFee() {
         return postFee;
     }

    public void setDeliveryTemplateFee(String deliveryTemplateFee) {
         this.deliveryTemplateFee = deliveryTemplateFee;
     }
     public String getDeliveryTemplateFee() {
         return deliveryTemplateFee;
     }

    public void setDeliveryTemplateId(int deliveryTemplateId) {
         this.deliveryTemplateId = deliveryTemplateId;
     }
     public int getDeliveryTemplateId() {
         return deliveryTemplateId;
     }

    public void setDeliveryTemplateName(String deliveryTemplateName) {
         this.deliveryTemplateName = deliveryTemplateName;
     }
     public String getDeliveryTemplateName() {
         return deliveryTemplateName;
     }

    public void setSubhead(String subhead) {
         this.subhead = subhead;
     }
     public String getSubhead() {
         return subhead;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setGoodsStocks(List<GoodsStocks> goodsStocks) {
         this.goodsStocks = goodsStocks;
     }
     public List<GoodsStocks> getGoodsStocks() {
         return goodsStocks;
     }

    public void setSalesVolume(int salesVolume) {
         this.salesVolume = salesVolume;
     }
     public int getSalesVolume() {
         return salesVolume;
     }

    public void setFavoriteCount(int favoriteCount) {
         this.favoriteCount = favoriteCount;
     }
     public int getFavoriteCount() {
         return favoriteCount;
     }

    public void setTotalStock(int totalStock) {
         this.totalStock = totalStock;
     }
     public int getTotalStock() {
         return totalStock;
     }

    public void setImages(List<Images> images) {
         this.images = images;
     }
     public List<Images> getImages() {
         return images;
     }

    public void setGoodsDetails(List<GoodsDetails> goodsDetails) {
         this.goodsDetails = goodsDetails;
     }
     public List<GoodsDetails> getGoodsDetails() {
         return goodsDetails;
     }

    public void setGoodsSkuInfo(String goodsSkuInfo) {
         this.goodsSkuInfo = goodsSkuInfo;
     }
     public String getGoodsSkuInfo() {
         return goodsSkuInfo;
     }

    public void setTags(List<String> tags) {
         this.tags = tags;
     }
     public List<String> getTags() {
         return tags;
     }

    public void setBooking(String booking) {
         this.booking = booking;
     }
     public String getBooking() {
         return booking;
     }

}