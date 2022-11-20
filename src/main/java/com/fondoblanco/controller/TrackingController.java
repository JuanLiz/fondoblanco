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

import com.fondoblanco.model.Tracking;
import com.fondoblanco.service.TrackingService;

@RestController
@RequestMapping("/api/orders")
public class TrackingController {

	private final TrackingService trackingService;

	@Autowired
	public TrackingController(TrackingService trackingService) {
		this.trackingService = trackingService;
	}

	// Create tracking
	@PostMapping("/tracking")
	public void save(@RequestBody Tracking tracking) {
		trackingService.save(tracking);
	}

	// Read all trackings
	@GetMapping("/tracking")
	public List<Tracking> findAll() {
		return trackingService.findAll();
	}

	// Read tracking by id
	@GetMapping("/tracking/{id}")
	public Tracking findById(@PathVariable String id) {
		return trackingService.findById(id).get();
	}

	// Update tracking
	@PutMapping("/tracking")
	public void update(@RequestBody Tracking tracking) {
		trackingService.save(tracking);
	}

	// Delete tracking by id
	@DeleteMapping("/tracking/{id}")
	public void deleteById(@PathVariable String id) {
		trackingService.deleteById(id);
	}

}
