package com.fondoblanco.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fondoblanco.model.OrderDetail;

@Repository
public interface OrderDetailRepository extends MongoRepository<OrderDetail, String> {

}
