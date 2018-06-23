package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Comment;

public interface CommentRepository extends MongoRepository<Comment, String> {

}
