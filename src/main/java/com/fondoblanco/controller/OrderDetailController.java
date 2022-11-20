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

import com.fondoblanco.model.OrderDetail;
import com.fondoblanco.service.OrderDetailService;

@RestController
@RequestMapping("/api")
public class OrderDetailController {

	private final OrderDetailService orderDetailService;

	@Autowired
	public OrderDetailController(OrderDetailService orderDetailService) {
		this.orderDetailService = orderDetailService;
	}

	// Create order detail
	@PostMapping("/orders-details")
	public void save(@RequestBody OrderDetail orderDetail) {
		orderDetailService.save(orderDetail);
	}

	// Read all orders details
	@GetMapping("/orders-details")
	public List<OrderDetail> findAll() {
		return orderDetailService.findAll();
	}

	// Read order detail by id
	@GetMapping("/orders-details/{id}")
	public OrderDetail findByid(@PathVariable String id) {
		return orderDetailService.findById(id).get();
	}

	// Update order detail
	@PutMapping("/orders-details")
	public void update(@RequestBody OrderDetail orderDetail) {
		orderDetailService.save(orderDetail);
	}

	// Delete order detail by id
	@DeleteMapping("/orders-details/{id}")
	public void deleteById(@PathVariable String id) {
		orderDetailService.deleteById(id);
	}

}
