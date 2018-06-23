package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.SmsCode;

public interface SmsCodeRepository extends MongoRepository<SmsCode, String> {

	public SmsCode findByPhoneAndCode(String phone, String code);
}
