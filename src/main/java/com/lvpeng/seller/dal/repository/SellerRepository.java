package com.lvpeng.seller.dal.repository;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Seller;

public interface SellerRepository extends MongoRepository<Seller, String> {

	public Seller findByPhone(String phone);

	public Seller findByPhoneAndAppCode(String phone, String appCode);

	public Seller findByLoginCodeAndExpireTimeGreaterThan(String loginCode, Date expireTime);
}
