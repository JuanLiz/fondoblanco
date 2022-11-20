package com.fondoblanco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fondoblanco.model.Shipment;
import com.fondoblanco.service.ShipmentService;

@RestController
@RequestMapping("/api/orders")
public class ShipmentController {

	private final ShipmentService shipmentService;

	@Autowired
	public ShipmentController(ShipmentService shipmentService) {
		this.shipmentService = shipmentService;
	}

	// Create shipment
	@PostMapping("/shipment")
	public void save(@RequestBody Shipment shipment) {
		shipmentService.save(shipment);
	}

	// Read all shipments
	@GetMapping("/shipment")
	public List<Shipment> findAll() {
		return shipmentService.findAll();
	}

	// Read shipment by id
	@GetMapping("/shipment/{id}")
	public Shipment findById(@PathVariable String id) {
		return shipmentService.findById(id).get();
	}

	// Update shipment
	@PutMapping("/shipment")
	public void update(@RequestBody Shipment shipment) {
		shipmentService.save(shipment);
	}

	// Delete shipment by id
	@DeleteMapping("/shipment/{id}")
	public void deleteById(@PathVariable String id) {
		shipmentService.deleteById(id);
	}

}
