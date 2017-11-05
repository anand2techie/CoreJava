package com.Array;

import java.util.Arrays;
import java.util.List;

public class ArraysClassOverview {

	void learnArraysClass(String[] incomingArray)
	{
		List<String> incomingArrayList=Arrays.asList(incomingArray); //will convert array to list directly
		
		//For binary search --> without sorting, u will get incorrect o/p
		
		Arrays.sort(incomingArray);
		int searchOutput=Arrays.binarySearch(incomingArray,"Swathi");
		
		String[] copiedArray=Arrays.copyOfRange(incomingArray, 0,5); //last index - exclusive
		printCustomerNames(copiedArray);
		//System.out.println(searchOutput);
		
		System.out.println(Arrays.toString(incomingArray)); //comma separated single String value
		System.out.println(Arrays.equals(incomingArray, copiedArray));
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
