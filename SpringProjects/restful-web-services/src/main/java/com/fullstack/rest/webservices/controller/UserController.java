package com.fullstack.rest.webservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.rest.webservices.model.User;
import com.fullstack.rest.webservices.restfulwebservices.UserDaoService;

@RestController
public class UserController {

	@Autowired
	UserDaoService userDaoService;

	// request mapping
	@GetMapping("/findUser/{usernameFromPath}")
	public User getUserByUsername(@PathVariable("usernameFromPath") String username) {
		return userDaoService.findOne(username);
	}
	// findOne method in UserDaoService by passing username as request parameter

	@GetMapping("/findAllUsers")
	public List<User> getAllUsers() {
		return userDaoService.findAll();
	}

	// for saving users: username, location and birthDate
	@PostMapping("/addUser")
	public void addUser(@RequestBody User user) {
		userDaoService.save(user);
	}
}
