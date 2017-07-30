package com.Array;

public class CustomerTO {
	
	private String customerName;
	private long customerId;
	private long customerAccBalance;
	private char customerAccType;
	private boolean IsPremiumCustomer;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getCustomerAccBalance() {
		return customerAccBalance;
	}
	public void setCustomerAccBalance(long customerAccBalance) {
		this.customerAccBalance = customerAccBalance;
	}
	public char getCustomerAccType() {
		return customerAccType;
	}
	public void setCustomerAccType(char customerAccType) {
		this.customerAccType = customerAccType;
	}
	public boolean isIsPremiumCustomer() {
		return IsPremiumCustomer;
	}
	public void setIsPremiumCustomer(boolean isPremiumCustomer) {
		IsPremiumCustomer = isPremiumCustomer;
	}
	
	

}
