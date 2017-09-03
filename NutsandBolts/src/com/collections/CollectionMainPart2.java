package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.oops.Customer;
import com.oops.CustomerForComparator;

public class CollectionMainPart2 {

	public static void main(String[] args) {
		//List<Customer> customersForComparableList = constructCustomerForComparableList();
		//testCustomerListAsComparable(customersForComparableList);
		
		List<CustomerForComparator> customersForComparatorList = constructCustomerForComparatorList();
		testCustomerListAsComparator(customersForComparatorList);
		
	}

	private static void testCustomerListAsComparator(List<CustomerForComparator> customersForComparatorList) {
		// TODO Auto-generated method stub
		System.out.println("Before sorting");
		printCustomerAccBalanceFromListForComparator(customersForComparatorList);
		//String sortingParam="accountBalance";
		
		sortListOfCustomersUsingComparator(customersForComparatorList);
		
		System.out.println("After sorting");
		printCustomerAccBalanceFromListForComparator(customersForComparatorList);
	}

	private static void sortListOfCustomersUsingComparator(List<CustomerForComparator> customersForComparatorList) {
		// TODO Auto-generated method stub
		
		//additionally you need to pass Comparator's instance
		Collections.sort(customersForComparatorList,new CustomerIdComparator());
	}

	private static void testCustomerListAsComparable(List<Customer> customersForComparableList) {
		System.out.println("Before sorting");
		printCustomerAccBalanceFromList(customersForComparableList);
		//String sortingParam="accountBalance";
		
		sortListOfCustomersUsingComparable(customersForComparableList);
		
		System.out.println("After sorting");
		printCustomerAccBalanceFromList(customersForComparableList);
	}

	private static List<Customer> constructCustomerForComparableList() {
		List<Customer> customersList = new ArrayList<Customer>();

		// String customerName,int customerId,long customerAccBalance,String
		// customerAddress,List<String> nominees

		// pre-defined nominees list
		String[] nomineesArrayForCharles = { "Dinesh", "Tharun" };
		String[] nomineesArrayFoDavid = { "Jeeva", "Ram" };
		String[] nomineesArrayForArun = { "Jeeva", "Ram" };
		String[] nomineesArrayForDivya = { "Dinesh", "Tharun" };

		// individual customer objects wth diff data
		Customer charlesCustoomerObj = new Customer("Charles", 123, 10000l, "Chennai",
				Arrays.asList(nomineesArrayForCharles));
		Customer davidCustoomerObj = new Customer("David", 123, 1000l, "Chennai", Arrays.asList(nomineesArrayFoDavid));
		Customer arunCustoomerObj = new Customer("Arun", 125, 40000l, "Bengaluru", Arrays.asList(nomineesArrayForArun));
		Customer divyaCustoomerObj = new Customer("Divya", 126, 20000l, "US", Arrays.asList(nomineesArrayForDivya));

		// adding customer objects to the list
		customersList.add(charlesCustoomerObj);
		customersList.add(davidCustoomerObj);
		customersList.add(arunCustoomerObj);
		customersList.add(divyaCustoomerObj);
		return customersList;
	}
	
	//using comparable
	static void sortListOfCustomersUsingComparable(List<Customer> customersList)
	{
		Collections.sort(customersList);
	}
	
	static void printCustomerAccBalanceFromList(List<Customer> customersList)
	{
		for(Customer customerObj:customersList)
		{
			System.out.println(customerObj.getCustomerAccBalance());
		}
	}
	
	static void printCustomerAccBalanceFromListForComparator(List<CustomerForComparator> customersList)
	{
		for(CustomerForComparator customerObj:customersList)
		{
			System.out.println(customerObj.getCustomerName());
		}
	}
	
	
	static List<CustomerForComparator> constructCustomerForComparatorList()
	{
		List<CustomerForComparator> CustomerForComparatorsList = new ArrayList<CustomerForComparator>();

		// String CustomerForComparatorName,int CustomerForComparatorId,long CustomerForComparatorAccBalance,String
		// CustomerForComparatorAddress,List<String> nominees

		// pre-defined nominees list
		String[] nomineesArrayForCharles = { "Dinesh", "Tharun" };
		String[] nomineesArrayFoDavid = { "Jeeva", "Ram" };
		String[] nomineesArrayForArun = { "Jeeva", "Ram" };
		String[] nomineesArrayForDivya = { "Dinesh", "Tharun" };

		// individual CustomerForComparator objects wth diff data
		CustomerForComparator charlesCustoomerObj = new CustomerForComparator("Charles", 123, 10000l, "Chennai",
				Arrays.asList(nomineesArrayForCharles));
		CustomerForComparator davidCustoomerObj = new CustomerForComparator("David", 123, 1000l, "Chennai", Arrays.asList(nomineesArrayFoDavid));
		CustomerForComparator arunCustoomerObj = new CustomerForComparator("Arun", 125, 40000l, "Bengaluru", Arrays.asList(nomineesArrayForArun));
		CustomerForComparator divyaCustoomerObj = new CustomerForComparator("Divya", 126, 20000l, "US", Arrays.asList(nomineesArrayForDivya));
		
		// adding customer objects to the list
				CustomerForComparatorsList.add(charlesCustoomerObj);
				CustomerForComparatorsList.add(davidCustoomerObj);
				CustomerForComparatorsList.add(arunCustoomerObj);
				CustomerForComparatorsList.add(divyaCustoomerObj);
				
		return CustomerForComparatorsList;
				
	}
}
