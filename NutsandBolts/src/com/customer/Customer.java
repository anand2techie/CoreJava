package com.customer;

public final class Customer {
	
	static int something;
	static String name;
	static int rollNo;
	static int marks;
	
	final float PI=3.14f;
	final float RATE_OF_INTEREST=10f;
	
	String customerName;
	long phoneNo;
	int customerId;
	
	 // static block
    static {
    	something=10;
    	staticMethod();
        System.out.println("Static block initialized.");
    }
 
	static final void staticMethod()
	{
		
	}
	
	private Customer() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor called");
		//PI=4.14f;
	}
	
	public Customer(int customerId) {
		// TODO Auto-generated constructor stub
		System.out.println("1 int param constructor called");
	}
	
	public Customer(char customerAccountType) {
		// TODO Auto-generated constructor stub
		System.out.println("1 char param constructor called");
	}
	
	public Customer(String customerName,long phoneNo,int customerId) {
		System.out.println("3 param constructor called");
		this.customerName=customerName;
		this.phoneNo=phoneNo;
		this.customerId=customerId;
		
		//this is always recommended to access instance variables
		System.out.println(this.marks);
		
		this.printCustomerDetails();
	}
	
	void printCustomerDetails()
	{
		System.out.println("Customer Name "+customerName);
		System.out.println("PhoneNo "+phoneNo);
		System.out.println("Customer Id "+customerId);
	}
	
	
	public void useWrapper()
	{
		int primitiveValue=100;
		//primitiveValue.
		//ClassName objectName=new ClassName/ConstructorName();
		
		//Autoboxing: conversion of primitive to wrapper
		Integer wrapperOfPrimitiveValue=new Integer(primitiveValue);
		wrapperOfPrimitiveValue.toString();
		
		//unboxing: conversion of wrapper to primitive
		int backToPrimitive=wrapperOfPrimitiveValue;
		
		for(int i=0;i<wrapperOfPrimitiveValue;i++)
		{
			
		}
		
		Math.sqrt(wrapperOfPrimitiveValue); //internal wrapper will  be converted to primitive
		
		
		int amount=10000;
		float amountInFloat=amount; //upcasting/autocasting/implicit
		int amountInInteger=(int) amountInFloat; //downcasting/manual/explicit typecasting
	}

}
