package com.fullstack.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //--> this will always return QuickSortAlgorithm's object
public class QuickSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sort(int[] numbers){
		
		//quick sort algorithm is implemented here.....
		System.out.println("Sort method of quick sort algorithm");
		return numbers;
	}
}
