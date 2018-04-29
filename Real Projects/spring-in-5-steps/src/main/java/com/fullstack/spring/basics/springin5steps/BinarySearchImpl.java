package com.fullstack.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * implementation of different binary search algorithms.
 * 
 */

@Component
public class BinarySearchImpl {
	
	@Autowired //this will pick automatically from the applicationContext. QuickSortAlgorithm
	SortAlgorithm algorithm;
	
	//xxxx
	
	//yyyy
	
	public BinarySearchImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("default constructor....");
	}
	
	
	public BinarySearchImpl(SortAlgorithm algorithm) {
		// TODO Auto-generated constructor stub
		System.out.println("parameterized constructor....");
		this.algorithm=algorithm;
	}

	// numbers --> 10,7,1,2,3,4,5 ; searchFor --> 5
	void binarySearch(int[] numbers, int searchFor) {

		// sort the array, without sorting binary search will not work.
		// bubble sort, quick sort, merge sort, heap sort
		
		numbers = algorithm.sort(numbers);

		// search for the element
		System.out.println("yes, the value is present.");
	}
}
