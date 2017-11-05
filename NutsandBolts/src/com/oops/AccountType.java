package com.oops;

import java.io.Serializable;

public class AccountType implements Serializable{

	private char accountType;
	
	private String accountTypeDescription;

	public AccountType() {
		// TODO Auto-generated constructor stub
	}
	
	public AccountType(char accountType,String accountDescription) {
		// TODO Auto-generated constructor stub
		this.accountType=accountType;
		this.accountTypeDescription=accountDescription;
	}
	
	public char getAccountType() {
		return accountType;
	}

	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}

	public String getAccountTypeDescription() {
		return accountTypeDescription;
	}

	public void setAccountTypeDescription(String accountTypeDescription) {
		this.accountTypeDescription = accountTypeDescription;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return accountType+ " "+accountTypeDescription;
	}
}




