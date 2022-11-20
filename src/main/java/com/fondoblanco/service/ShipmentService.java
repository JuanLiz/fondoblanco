package com.fondoblanco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fondoblanco.model.Shipment;
import com.fondoblanco.repository.ShipmentRepository;

@Service
public class ShipmentService {
	
	private final ShipmentRepository shipmentRepository;

	@Autowired
	public ShipmentService(ShipmentRepository shipmentRepository) {
		this.shipmentRepository = shipmentRepository;
	}

	// Create shipment
	public void save(Shipment shipment) {
		shipmentRepository.save(shipment);
	}

	// Read all shipments
	public List<Shipment> findAll() {
		return shipmentRepository.findAll();
	}

	// Find shipment by id
	public Optional<Shipment> findById(String id) {
		return shipmentRepository.findById(id);
	}

	// Delete shipment by id
	public void deleteById(String id) {
		shipmentRepository.deleteById(id);
	}

}
