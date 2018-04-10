package com.fullstack.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication // annotation --> magic that's going to happen
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

		// to run Spring boot application.
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);

		// extracting bean out of Spring's applicationContext - Spring's way
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class); //default constructor or parameterized constructor

		// or

		// core java way
		// we're removing the tight coupling, and making it loosely coupled. -->
		// interface oriented design
		//BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
		
		int[] numbers = { 1, 2, 3, 4, 5 };
		binarySearchImpl.binarySearch(numbers, 5);
	}
}
