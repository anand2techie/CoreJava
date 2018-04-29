package com.fullstack.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
	
	public int[] sort(int[] numbers){
		//quick sort logic
		System.out.println("Quick Sort Algorithm");
		return numbers;
	}

}
