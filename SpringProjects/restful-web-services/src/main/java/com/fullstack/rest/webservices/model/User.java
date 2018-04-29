package com.fullstack.rest.webservices.model;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {
	
	@Size(min=4)
	private String username;
	private String location;
	@Past
	private Date birthDate;
	
	//to be used from client side from POST request
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String username, String location, Date birthDate) {
		this.username = username;
		this.location = location;
		this.birthDate = birthDate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	

}
