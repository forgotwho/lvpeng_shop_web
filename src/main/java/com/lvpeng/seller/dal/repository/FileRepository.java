package com.lvpeng.seller.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.File;

public interface FileRepository extends MongoRepository<File, String> {
}
