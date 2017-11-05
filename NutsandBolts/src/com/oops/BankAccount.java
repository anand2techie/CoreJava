package com.oops;

import java.io.Serializable;

public class BankAccount implements Serializable{

	private int accountId;
	private String bank;
	private char accountType;
	private int accountBalance;
	private String accountBranch;
	private transient String bankKey; //A sensitive data. Transient - skips serialization
	
	public String getBankKey() {
		return bankKey;
	}
	public void setBankKey(String bankKey) {
		this.bankKey = bankKey;
	}
	//provide getter & setter methods for all the fields
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public char getAccountType() {
		return accountType;
	}
	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountBranch() {
		return accountBranch;
	}
	public void setAccountBranch(String accountBranch) {
		this.accountBranch = accountBranch;
	}
	
}
