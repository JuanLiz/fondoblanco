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

import com.fondoblanco.model.User;
import com.fondoblanco.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	// Create user
	@PostMapping("/users")
	public void save(@RequestBody User user) {
		userService.save(user);
	}

	// Read all users
	@GetMapping("/users")
	public List<User> findAll() {
		return userService.findAll();
	}

	// Read user by id
	@GetMapping("/users/{id}")
	public User findByid(@PathVariable String id) {
		return userService.findById(id).get();
	}

	// Update user
	@PutMapping("/users")
	public void update(@RequestBody User user) {
		userService.save(user);
	}

	// Delete user by id
	@DeleteMapping("/users/{id}")
	public void deleteById(@PathVariable String id) {
		userService.deleteById(id);
	}

}
