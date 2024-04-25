package com.curd.usercontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curd.model.User;
import com.curd.repository.UserRepository;

@RestController
@RequestMapping("/api/users/")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<User> getUser(){
		return userRepository.findAll();
		}
	@GetMapping("{id}")
	public Optional<User> getUser(@PathVariable Long id) {
		return userRepository.findById(id);
		}
	@DeleteMapping("/{id}")
	public boolean deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
		return true;
		
	}
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
		
	}
	
	@PutMapping
	public User updateUser(@RequestBody User user) {
		return userRepository.save(user);
		
	}
	
}
