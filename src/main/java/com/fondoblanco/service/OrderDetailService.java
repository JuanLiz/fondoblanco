package com.fondoblanco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fondoblanco.model.OrderDetail;
import com.fondoblanco.repository.OrderDetailRepository;

@Service
public class OrderDetailService {
	
	private final OrderDetailRepository orderDetailRepository;
	
	@Autowired
	public OrderDetailService(OrderDetailRepository orderDetailRepository) {
		this.orderDetailRepository = orderDetailRepository;
	}
	
	// Create order detail
	public void save(OrderDetail orderDetail) {
		orderDetailRepository.save(orderDetail);
	}
	
	// Read all orders details
	public List<OrderDetail> findAll(){
		return orderDetailRepository.findAll();
	}
	
	// Find order detail by id
	public Optional<OrderDetail> findById(String id) {
		return orderDetailRepository.findById(id);
	}
	
	// Delete order detail by id
	public void deleteById(String id) {
		orderDetailRepository.deleteById(id);
	}

}
