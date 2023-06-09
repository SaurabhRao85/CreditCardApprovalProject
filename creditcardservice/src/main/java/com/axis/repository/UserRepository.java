package com.axis.repository;

import org.bson.types.ObjectId;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.axis.model.User;

public interface UserRepository extends MongoRepository<User, ObjectId>{

}
