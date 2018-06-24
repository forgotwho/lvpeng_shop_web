package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.Image;

public interface ImageRepository extends MongoRepository<Image, String> {
}
