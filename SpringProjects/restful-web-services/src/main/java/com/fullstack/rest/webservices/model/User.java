package com.fullstack.rest.webservices.model;

import java.util.Date;

public class User {
	
	private String username;
	private String location;
	private Date birthDate;
	
	
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
