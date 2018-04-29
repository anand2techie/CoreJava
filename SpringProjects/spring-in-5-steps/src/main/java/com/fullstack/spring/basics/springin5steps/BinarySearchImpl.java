package com.fullstack.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//binarySearchImpl
@Component("customizedBeanNameForBinarySearchImpl")
public class BinarySearchImpl {
	
	@Autowired
	SortAlgorithm sortAlgorithm;
	
	/*									//BubbleSortAlgorithm
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// implementing sorting logic
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgorithm.sort(numbers);

		// search the array

		return 3;
	}

}
