package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Image;

public interface ImageRepository extends MongoRepository<Image, String> {

}
