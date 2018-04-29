package com.fullstack.rest.webservices.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fullstack.rest.webservices.exception.UserNotFoundException;
import com.fullstack.rest.webservices.model.User;
import com.fullstack.rest.webservices.service.UserDaoService;

@RestController
public class UserController {

	@Autowired
	UserDaoService userDaoService;

	// request mapping
	@GetMapping("/findUser/{usernameFromPath}")
	public User getUserByUsername(@PathVariable("usernameFromPath") String username) {
		User user = userDaoService.findOne(username);
		if (user == null) {
			throw new UserNotFoundException();
		}
		return user;
	}
	// findOne method in UserDaoService by passing username as request parameter

	@GetMapping("/findAllUsers")
	public List<User> getAllUsers() {
		return userDaoService.findAll();
	}

	// for saving users: username, location and birthDate
	@PostMapping("/addUser")
	public ResponseEntity<Object> addUser(@Valid @RequestBody User user) {
		User savedUser = userDaoService.save(user);
		// an URI - link/reference of a resource
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser).toUri();
		
		//send back the response for created
		return ResponseEntity.created(location).build();
	}

	// deleteUser
	@GetMapping("deleteUser/{usernameFromPath}")
	public void deleteUser(@PathVariable("usernameFromPath") String username) {
		userDaoService.delete(username);
	}
}
