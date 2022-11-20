package com.fondoblanco.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fondoblanco.model.Tracking;

@Repository
public interface TrackingRepository extends MongoRepository<Tracking, String> {

}
