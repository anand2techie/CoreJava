package com.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.oops.Customer;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating a Map
		Map<Integer,Customer> customerMap=new TreeMap<Integer,Customer>();
		
		String[] nomineesArray={"Arun","Charles"};
		//adding values to the Map
		customerMap.put(123, new Customer("Alex", 123, 10000l, "Chennai",Arrays.asList(nomineesArray)));
		customerMap.put(127, new Customer("Charles", 124, 10000l, "Chennai",Arrays.asList(nomineesArray)));
		customerMap.put(125, new Customer("Rajini", 125, 10000l, "Chennai",Arrays.asList(nomineesArray)));
		customerMap.put(127, new Customer("David", 125, 10000l, "Chennai",Arrays.asList(nomineesArray)));
		
		Iterator<Customer> customerValues=customerMap.values().iterator();
		while(customerValues.hasNext())
		{
			System.out.println(customerValues.next().getCustomerName());
		}
	}

}
