package com.fullstack.rest.webservices.model;

public class HelloWorldModel {

	private String message;
	private String messager;

	

	public HelloWorldModel(String message, String messager) {
		this.message = message;
		this.messager = messager;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessager() {
		return messager;
	}

	public void setMessager(String messager) {
		this.messager = messager;
	}

}
