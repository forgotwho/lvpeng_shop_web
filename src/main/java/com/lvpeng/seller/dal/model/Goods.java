/**
  * Copyright 2018 bejson.com 
  */
package com.lvpeng.seller.dal.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

/**
 * Auto-generated: 2018-06-07 13:13:42
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Goods {

	@Id
	private int id;
	private String uuid;
	private String name;
	private int shopId;
	private int status;
	private int originalPrice;
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
	private String serviceParam;
	private List<GoodsStock> goodsStocks;
	private int salesVolume;
	private int favoriteCount;
	private int totalStock;
	private List<Image> images;
	private List<GoodsDetail> goodsDetails;
	private GoodsSkuInfo goodsSkuInfo;
	private List<String> tags;

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

	public void setOriginalPrice(int originalPrice) {
		this.originalPrice = originalPrice;
	}

	public int getOriginalPrice() {
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

	public void setServiceParam(String serviceParam) {
		this.serviceParam = serviceParam;
	}

	public String getServiceParam() {
		return serviceParam;
	}

	public void setGoodsStocks(List<GoodsStock> goodsStocks) {
		this.goodsStocks = goodsStocks;
	}

	public List<GoodsStock> getGoodsStocks() {
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

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setGoodsDetails(List<GoodsDetail> goodsDetails) {
		this.goodsDetails = goodsDetails;
	}

	public List<GoodsDetail> getGoodsDetails() {
		return goodsDetails;
	}

	public void setGoodsSkuInfo(GoodsSkuInfo goodsSkuInfo) {
		this.goodsSkuInfo = goodsSkuInfo;
	}

	public GoodsSkuInfo getGoodsSkuInfo() {
		return goodsSkuInfo;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<String> getTags() {
		return tags;
	}

}