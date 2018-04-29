package com.fullstack.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
	
	public int[] sort(int[] numbers){
		//bubble sort logic
		System.out.println("Bubble Sort Algorithm");
		return numbers;
	}

}
