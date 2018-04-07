package com.fullstack.springboot.basics.springbootin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fullstack.springboot.basics") //specify the base package where the scanning should happen
public class SpringbootIn5StepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootIn5StepsApplication.class, args);
	}
}
