package com.fondoblanco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fondoblanco.model.Order;
import com.fondoblanco.repository.OrderRepository;

@Service
public class OrderService {

	private final OrderRepository orderRepository;

	@Autowired
	public OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
	
	// Create order
	public void save(Order order) {
		orderRepository.save(order);
	}
	
	// Read all orders
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	// Find order by id
	public Optional<Order> findById(String id) {
		return orderRepository.findById(id);
	}
	
	// Delete order by id
	public void deleteById(String id) {
		orderRepository.deleteById(id);
	}

}
