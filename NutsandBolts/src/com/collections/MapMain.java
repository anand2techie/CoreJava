package com.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.oops.Customer;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating a Map
		Map<Integer,Customer> customerMap=new HashMap<Integer,Customer>();
		
		String[] nomineesArray={"Arun","Charles"};
		//adding values to the Map
		customerMap.put(123, new Customer("Alex", 123, 10000l, "Chennai",Arrays.asList(nomineesArray)));
		customerMap.put(127, new Customer("Charles", 124, 10000l, "Chennai",Arrays.asList(nomineesArray)));
		customerMap.put(125, new Customer("Rajini", 125, 10000l, "Chennai",Arrays.asList(nomineesArray)));
		customerMap.put(127, new Customer("David", 125, 10000l, "Chennai",Arrays.asList(nomineesArray)));
		customerMap.put(130, null);
		customerMap.put(null, new Customer("Randy", 135, 10000l, "Chennai",Arrays.asList(nomineesArray))); //- will check this at.
		
		//all the Map operations will apply here
		customerMap.put(null, new Customer("Sara", 135, 10000l, "Chennai",Arrays.asList(nomineesArray)));
		
		/*direct iteration of Map is not possible
		//In list, get() will operate on index
		//In Map, get() will operate on key
		for(int i=0;i<customerMap.size();i++)
		{
			System.out.println(customerMap.get(i));
		}*/
		
		//can be iterated after converting Map to a collection
		
		/*iterateMapUsingKeySet(customerMap);
		
		iterateMapUsingValues(customerMap);
		
		iterateMapUsingEntrySet(customerMap);*/
		
		customerMap.get(null).getCustomerName(); //will get an excp if map is null, You always pass key
		
		customerMap.containsKey(null);
		
		customerMap.remove(127);
		
		System.out.println(customerMap);
		
		//customerMap.clear(); // do a null-check before using this operation
		
		Customer customerDummyObj=new Customer("Alex", 135, 10000l, "Chennai",Arrays.asList(nomineesArray));
		
		System.out.println(customerMap.isEmpty());
		
		System.out.println(customerMap.containsValue(customerDummyObj));
	}

	private static void iterateMapUsingEntrySet(Map<Integer, Customer> customerMap) {
		//using EntrySet
		Set<Entry<Integer, Customer>> customerEntrySet=customerMap.entrySet();
		Iterator<Entry<Integer,Customer>> customerEntrySetIr=customerEntrySet.iterator();
		
		while(customerEntrySetIr.hasNext())
		{
			Entry<Integer,Customer> entry=customerEntrySetIr.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

	private static void iterateMapUsingValues(Map<Integer, Customer> customerMap) {
		//using values
		Collection<Customer> customerValues=customerMap.values();
		Iterator<Customer> customerValuesIr=customerValues.iterator();
		
		while(customerValuesIr.hasNext())
		{
			Customer customerObj=customerValuesIr.next();
			if(customerObj!=null)
			{
			//System.out.println(customerObj.getCustomerName());
			}
		}
	}

	private static void iterateMapUsingKeySet(Map<Integer, Customer> customerMap) {
		//using keyset
		Set<Integer> keySet=customerMap.keySet();
		Iterator<Integer> keySetIr=keySet.iterator();
		
		while(keySetIr.hasNext())
		{
			int key=keySetIr.next();//NPE due to autoboxing: 
			//System.out.println("key: "+key);
			
			//extracting value out of Map using get(key)
			Customer customerValueFromMap=customerMap.get(key);
			
			if(customerValueFromMap!=null)
			{
			//System.out.println("customer name in the value is: "+customerValueFromMap.getCustomerName());
			}
		}
	}

}
