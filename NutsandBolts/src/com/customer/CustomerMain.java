//package packageName;
package com.customer;

import com.test1.Test1;

//keyword class ClassName{ main method }
public class CustomerMain {

	//main method -  starting point of execution
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my main method for testing.");
		
		//local variable
		int number=20;
		
		//creating an Object
		CustomerBO customerBOObj=new CustomerBO();
		//customerBOObj.findEvenOrNot(number);
		
		//customerBOObj.printCustomerIdOfprimesTillN(100);
		customerBOObj.createCustomers("Charles", 9629090705l, 100);
		//Test1.yyyMethod(); //accessing a static method
	}
	
}
