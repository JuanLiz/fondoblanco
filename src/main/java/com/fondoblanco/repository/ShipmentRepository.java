package com.fondoblanco.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fondoblanco.model.Shipment;

@Repository
public interface ShipmentRepository extends MongoRepository<Shipment, String> {

}
