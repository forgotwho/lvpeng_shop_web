package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Coupon;

public interface CouponRepository extends MongoRepository<Coupon, String> {

	public Coupon findById(int id);
}
