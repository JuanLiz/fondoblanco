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

import com.fondoblanco.model.Order;
import com.fondoblanco.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {
	
	private final OrderService orderService;
	
	@Autowired
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	// Create order
	@PostMapping("/orders")
	public void save(@RequestBody Order order) {
		orderService.save(order);
	}

	// Read all orders
	@GetMapping("/orders")
	public List<Order> findAll() {
		return orderService.findAll();
	}

	// Read order by id
	@GetMapping("/orders/{id}")
	public Order findByid(@PathVariable String id) {
		return orderService.findById(id).get();
	}

	// Update order
	@PutMapping("/orders")
	public void update(@RequestBody Order order) {
		orderService.save(order);
	}

	// Delete order by id
	@DeleteMapping("/orders/{id}")
	public void deleteById(@PathVariable String id) {
		orderService.deleteById(id);
	}

}
