package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.File;

public interface FileRepository extends MongoRepository<File, String> {
}
