package com.customer;

public class CustomerBO {
	//global static variable
	
	static String bankName="Axis Bank";
	String name;
	
	//global instance variable
	String address;

	void xxxMethod()
	{
		System.out.println(name); //global variables can be
		//System.out.println(number); local variable can't be accessed outside it's block
		
		int customerId=100;
		float customerAccBalance=10000.50f;
		long customerPhoneNumber=9629090705l;
		
		boolean privilegedCustomer=false;
		
		char accountType='S';
	}

	void findEvenOrNot(int number)
	{
		if(number%2==0)
		{
			System.out.println("It's an even");
		}
		else
		{
			System.out.println("It's an odd");
		}
	}
	
	
	/**
	 * 
		it is divisible only by itself & 1.	reminder =0 should be only twice.
		
		5   ----> prime number
		
		5/1 --> 0
		5/2 --> 3
		5/3 --> 2
		5/4 --> 1
		5/5 --> 0

	 * @param primeLimit
	 */
	
	void printCustomerIdOfprimesTillN(int primeLimit)
	{
		
		System.out.println("Prime numbers till "+primeLimit+" are:");
		
		boolean result=false;
		//numerator
		for(int i=2;i<primeLimit;i++)
		{
			int countOfReminderZero=0;
			//denominator
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					countOfReminderZero++;
				}
			}
			
			if(countOfReminderZero!=2)
			{
				//System.out.println(i);
			}
			else
			{
				System.out.println(i);
			}
		}
	}
	
	void createCustomers(String customerName,long phoneNo,int customerId)
	{
		Customer customer=new Customer(customerName,phoneNo,customerId);
		customer.printCustomerDetails();
	}
}
