package com.lvpeng.customer.dal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.Notice;

public interface NoticeRepository extends MongoRepository<Notice, String> {
}
