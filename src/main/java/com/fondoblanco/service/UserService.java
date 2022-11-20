package com.fondoblanco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fondoblanco.model.User;
import com.fondoblanco.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	// Create user
	public void save(User user) {
		userRepository.save(user);
	}

	// Read all users
	public List<User> findAll() {
		return userRepository.findAll();
	}

	// Find user by id
	public Optional<User> findById(String id) {
		return userRepository.findById(id);
	}

	// Delete user by id
	public void deleteById(String id) {
		userRepository.deleteById(id);
	}

}
