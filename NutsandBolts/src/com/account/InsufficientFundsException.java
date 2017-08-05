package com.account;

public class InsufficientFundsException  extends RuntimeException{
	
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Insufficient funds. Please try again!";
	}

}
