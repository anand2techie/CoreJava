package com.oops;

import java.util.List;

public class Customer {

	//instance variables
	private int customerId;
	private String customerName;
	private long customerAccBalance;
	private String customerAddress;
	private List<String> nominees;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName,int customerId,long customerAccBalance,String customerAddress,List<String> nominees) {
		// TODO Auto-generated constructor stub
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerAccBalance=customerAccBalance;
		this.customerAddress=customerAddress;
		this.nominees=nominees;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerAccBalance() {
		return customerAccBalance;
	}
	public void setCustomerAccBalance(long customerAccBalance) {
		this.customerAccBalance = customerAccBalance;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public List<String> getNominees() {
		return nominees;
	}
	public void setNominees(List<String> nominees) {
		this.nominees = nominees;
	}
	
	//you have to override two methods:
	@Override
	public boolean equals(Customer customerObj) {
		// TODO Auto-generated method stub
		return customerObj.getCustomerId()==this.getCustomerId();
	}
	
}

