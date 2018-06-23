package com.lvpeng.customer.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.Coupon;

public interface CouponRepository extends MongoRepository<Coupon, String> {

	public Coupon findById(int id);
}
