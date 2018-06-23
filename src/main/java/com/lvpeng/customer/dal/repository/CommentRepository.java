package com.lvpeng.customer.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.customer.dal.model.Comment;

public interface CommentRepository extends MongoRepository<Comment, String> {

}
