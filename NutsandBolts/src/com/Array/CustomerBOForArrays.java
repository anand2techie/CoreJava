package com.Array;

import java.util.Arrays;

public class CustomerBOForArrays {
	
	//init at the time of declaration
	char[] accountTypes={'S','R','C','L'};
	
	void pushCustomerNames(int noOfCustomersToBeAdded){
		String[] customerNames=new String[noOfCustomersToBeAdded];
		
		try
		{
		customerNames[0]="Ram";
		customerNames[1]="Ganesh";
		customerNames[2]="Arun";
		customerNames[3]="Swathi";
		customerNames[4]="Meera";
		
		/*System.out.println("Before sorting:");
		printCustomerNames(customerNames);
		System.out.println("After sorting:");*/
		sortCustomerNames(customerNames);
		
		ArraysClassOverview arraysClassOverview=new ArraysClassOverview();
		arraysClassOverview.learnArraysClass(customerNames);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You're trying to add/manipulate elements more than the size.");
		}
	}
	
	private void sortCustomerNames(String[] customerNames) {
		// TODO Auto-generated method stub
		//Arrays arrays=new Arrays(); constructor is not available for Arrays class
		Arrays.sort(customerNames);
		printCustomerNames(customerNames);
	}

	void pushCustomers(int noOfCustomersToBeAdded){
		
		CustomerTO[] customerDetails=new CustomerTO[noOfCustomersToBeAdded];
		
		CustomerTO arunTO=new CustomerTO();
		arunTO.setCustomerName("Arun");
		arunTO.setCustomerAccBalance(10000l);
		arunTO.setCustomerAccType(accountTypes[0]);
		arunTO.setIsPremiumCustomer(false);;
		arunTO.setCustomerId(12345l);
		

		CustomerTO jeevaTO=new CustomerTO();
		jeevaTO.setCustomerName("Jeeva");
		jeevaTO.setCustomerAccBalance(50000l);
		jeevaTO.setCustomerAccType(accountTypes[1]);
		jeevaTO.setIsPremiumCustomer(false);;
		jeevaTO.setCustomerId(4567l);
		

		CustomerTO chrisTO=new CustomerTO();
		chrisTO.setCustomerName("Chris");
		chrisTO.setCustomerAccBalance(1500l);
		chrisTO.setCustomerAccType(accountTypes[0]);
		chrisTO.setIsPremiumCustomer(true);;
		chrisTO.setCustomerId(123l);
		
		customerDetails[0]=arunTO;
		customerDetails[1]=jeevaTO;
		customerDetails[2]=chrisTO;
		
		printCustomerNamesWhoseBalIsMoreThan10000(customerDetails);
	}

	private void printCustomerNamesWhoseBalIsMoreThan10000(CustomerTO[] customerDetails) {
		// TODO Auto-generated method stub
		for(CustomerTO customerTO:customerDetails)
		{
			//null check
			if(customerTO!=null)
			{
				if(customerTO.getCustomerAccBalance()>10000)
				{
					System.out.println(customerTO.getCustomerName());
				}
			}
		}
	}

	private void printCustomerNames(String[] customerNames) {
		// TODO Auto-generated method stub
		/*for(int index=0;index<customerNames.length;index++)
		{
			System.out.println(customerNames[index]);
		}*/
		//for-each: Recommended
		for(String customerName:customerNames)
		{
			System.out.println(customerName);
		}
	}

}
