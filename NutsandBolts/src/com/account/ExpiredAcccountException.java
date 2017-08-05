package com.account;

public class ExpiredAcccountException extends Exception {
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Account Expired";
	}
	

}
