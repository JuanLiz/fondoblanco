package com.fondoblanco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fondoblanco.model.Tracking;
import com.fondoblanco.repository.TrackingRepository;

@Service
public class TrackingService {
	
	private final TrackingRepository trackingRepository;

	@Autowired
	public TrackingService(TrackingRepository trackingRepository) {
		this.trackingRepository = trackingRepository;
	}

	// Create tracking
	public void save(Tracking tracking) {
		trackingRepository.save(tracking);
	}

	// Read all trackings
	public List<Tracking> findAll() {
		return trackingRepository.findAll();
	}

	// Find tracking by id
	public Optional<Tracking> findById(String id) {
		return trackingRepository.findById(id);
	}

	// Delete tracking by id
	public void deleteById(String id) {
		trackingRepository.deleteById(id);
	}

}
