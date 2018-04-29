package com.fullstack.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
	
	@Override
	public int[] sort(int[] numbers){
		
		System.out.println("Sort method of bubble sort algorithm");
		//bubble sort algorithm implemented here....
		return numbers;
	}

}
