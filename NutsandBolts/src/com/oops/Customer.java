package com.oops;

import java.io.Serializable;
import java.util.List;

public class Customer implements Comparable<Customer>,Serializable{

	//instance variables
	private int customerId;
	private String customerName;
	private long customerAccBalance;
	private String customerAddress;
	private List<String> nominees;
	private List<AccountType> accountTypes;
	private Boolean isValidCustomer;
	
	private BankAccount bankAccount;
	
	
	public List<AccountType> getAccountTypes() {
		return accountTypes;
	}
	public void setAccountTypes(List<AccountType> accountTypes) {
		this.accountTypes = accountTypes;
	}
	public Boolean getIsValidCustomer() {
		return isValidCustomer;
	}
	public void setIsValidCustomer(Boolean isValidCustomer) {
		this.isValidCustomer = isValidCustomer;
	}
	public BankAccount getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
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
	
	public Customer(String customerName,int customerId,long customerAccBalance,String customerAddress,List<String> nominees,Boolean isValidCustomer) {
		// TODO Auto-generated constructor stub
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerAccBalance=customerAccBalance;
		this.customerAddress=customerAddress;
		this.nominees=nominees;
		this.isValidCustomer=isValidCustomer;
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
	
	
	public Boolean isValidCustomer() {
		return isValidCustomer;
	}
	public void setValidCustomer(Boolean isValidCustomer) {
		this.isValidCustomer = isValidCustomer;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj!=null)
		{
		return ((Customer) obj).getCustomerId()==this.customerId;
		}
		else
		{
		return false;
		}
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.customerId;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "valid flag for "+customerName+" is "+isValidCustomer;
	}
	
	
	@Override
	public int compareTo(Customer customerObj) {
		// TODO Auto-generated method stub
		
		int returnValue=0;
		
		if(customerObj.getCustomerAccBalance()>this.customerAccBalance)
		{
			returnValue=-1;
		}
		else if(customerObj.getCustomerAccBalance()<this.customerAccBalance)
		{
			returnValue=1;
		}
		
		return returnValue;
	}
}

