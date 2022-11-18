package com.fondoblanco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fondoblanco.model.Product;
import com.fondoblanco.repository.ProductRepository;


@Service
public class ProductService {

	private final ProductRepository productRepository;

	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	// Create product
	public void save(Product product) {
		productRepository.save(product);
	}
	
	// Read all products
	public List<Product> findAll(){
		return productRepository.findAll();
	}
	
	// Find product by id
	public Optional<Product> findById(String id) {
		return productRepository.findById(id);
	}
	
	// Delete product
	public void deleteById(String id) {
		productRepository.deleteById(id);
	}
	
	
}
