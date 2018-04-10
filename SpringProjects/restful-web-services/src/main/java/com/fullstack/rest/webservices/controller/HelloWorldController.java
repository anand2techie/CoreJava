package com.fullstack.rest.webservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	// returning a message - "Hello World"
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "helloworld";//if it's a controller, what you're returning will be resolved as a html page name
	}
}
