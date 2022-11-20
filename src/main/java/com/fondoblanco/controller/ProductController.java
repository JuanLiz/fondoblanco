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

import com.fondoblanco.model.Product;
import com.fondoblanco.service.ProductService;


@RestController
@RequestMapping("/api")
public class ProductController {
	
	private final ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	// Create product
	@PostMapping("/products")
	public void save(@RequestBody Product product) {
		productService.save(product);
	}

	// Read all products
	@GetMapping("/products")
	public List<Product> findAll() {
		return productService.findAll();
	}

	// Read product by id
	@GetMapping("/products/{id}")
	public Product findByid(@PathVariable String id) {
		return productService.findById(id).get();
	}

	// Update product
	@PutMapping("/products")
	public void update(@RequestBody Product product) {
		productService.save(product);
	}

	// Delete product by id
	@DeleteMapping("/products/{id}")
	public void deleteById(@PathVariable String id) {
		productService.deleteById(id);
	}

}
