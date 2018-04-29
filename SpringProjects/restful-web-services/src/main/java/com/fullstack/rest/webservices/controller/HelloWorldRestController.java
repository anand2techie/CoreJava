package com.fullstack.rest.webservices.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.rest.webservices.model.HelloWorldModel;

@RestController
public class HelloWorldRestController {

	// returning a message - "Hello World"
	// @GetMapping("/hello-world-rest")
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world-rest")
	// @PostMapping("/registerUsers") e.g. placeOrder, doEnquire
	public String helloWorld() {
		return "hello world using Spring Boot exposed as a RESTful Web Services";// if it's a controller, what you're
																					// returning will be resolved as a
																					// html page name
	}

	@GetMapping("/hello-world-model")
	public HelloWorldModel helloWorldModel() {
		return new HelloWorldModel("Message from Hello World Model", "Ananth");
	}

	@GetMapping("/hello-world-model-list")
	public List<HelloWorldModel> helloWorldModelList() {
		List<HelloWorldModel> helloWorldModelList = new ArrayList<HelloWorldModel>();
		helloWorldModelList.add(new HelloWorldModel("Message from Hello World Model-Ananth", "Ananth"));
		helloWorldModelList.add(new HelloWorldModel("Message from Hello World Model-Akil", "Akil"));
		helloWorldModelList.add(new HelloWorldModel("Message from Hello World Model-Raj", "Raj"));
		return helloWorldModelList;
	}

	@GetMapping("/hello-world-model-with-name/{name}")
	public HelloWorldModel helloWorldModelWithName(@PathVariable("name") String name) {
		return new HelloWorldModel("Message from Hello World Model", name);
	}

}
