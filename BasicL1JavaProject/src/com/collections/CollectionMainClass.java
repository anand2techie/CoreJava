package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a List
		//List of String
		List namesList=new ArrayList();
		System.out.println("Changed....");
		
		//adding values to a list
		namesList.add("Alex");//0
		namesList.add("Charles");//1
		namesList.add("Mike");//3 raj = 2
		namesList.add("Dave");//4
		namesList.add("Alex");//5
		namesList.add(2, "Raj");//insertion not replacement
		//namesList.add(7,"Alice"); index shouldn't be out of bound
		
		//autoboxing will be taken care by Collection API
		namesList.add('a');
		namesList.add(100);
		namesList.add(true);
		
		//list maintains the insertion order
		System.out.println(namesList);
		
		namesList.clear();//clearing all the values present in the list
		
		System.out.println(namesList);
		
		namesList.add("Zameer");
		namesList.add("Adam");
		namesList.add("Babar");
		
		System.out.println(namesList);
		Object[] namesArray=new Object[namesList.size()];
		namesList.toArray(namesArray);
		
		//for each loop
		for(Object name:namesArray){
			System.out.println(name.toString());
		}
		
		/*System.out.println("value at a specific index: "+namesList.get(2));
		//namesList.set(1, "new Test");//replace the value
		System.out.println("after setting "+namesList);
		*/
		System.out.println("Before sorting "+namesList);
		
		Collections.sort(namesList);
		System.out.println("After sorting "+namesList);
		
		Collections.reverse(namesList);
		System.out.println("After reversing "+namesList);
		
		//namesList.
		
	}

}
