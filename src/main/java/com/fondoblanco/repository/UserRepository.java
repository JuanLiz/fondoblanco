package com.fondoblanco.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fondoblanco.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
