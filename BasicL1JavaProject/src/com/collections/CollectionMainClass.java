package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating a List
		// List of String
		
		//<> --> Generic
		List<String> namesList = new ArrayList<String>();

		// adding values to a list
		namesList.add("Alex");// 0
		namesList.add("Charles");// 1
		namesList.add("Mike");// 3 raj = 2
		namesList.add("Dave");// 4
		namesList.add("Zaheer");// 5
		namesList.add(2, "Raj");// insertion not replacement
		// namesList.add(7,"Alice"); index shouldn't be out of bound
		/*
		 * //autoboxing will be taken care by Collection API namesList.add('a');
		 * namesList.add(100); namesList.add(true);
		 * 
		 * //list maintains the insertion order System.out.println(namesList);
		 * 
		 * namesList.clear();//clearing all the values present in the list
		 * 
		 * System.out.println(namesList);
		 * 
		 * namesList.add("Zameer"); namesList.add("Adam");
		 * namesList.add("Babar");
		 * 
		 * System.out.println(namesList); Object[] namesArray=new
		 * Object[namesList.size()]; namesList.toArray(namesArray);
		 * 
		 * //for each loop for(Object name:namesArray){
		 * System.out.println(name.toString()); }
		 * 
		 * System.out.println("value at a specific index: "+namesList.get(2));
		 * //namesList.set(1, "new Test");//replace the value
		 * System.out.println("after setting "+namesList);
		 * 
		 * System.out.println("Before sorting "+namesList);
		 * 
		 * Collections.sort(namesList);
		 * System.out.println("After sorting "+namesList);
		 * 
		 * Collections.reverse(namesList);
		 * System.out.println("After reversing "+namesList);
		 */

		// looping statements
		for (int i = 0; i < namesList.size(); i++) {
			//System.out.println(namesList.get(i));
		}

		//System.out.println("using for each loop");
		// for-each
		for (Object name : namesList) {
			//System.out.println(name);
		}

		// using iterator
		// Classname objectName=new ClassName();
		// InterfaceName objectName=new InterfaceName();//not possible

		// ClassThatWillReturnBicyclObj classInstanceReturningObj=new
		// ClassThatWillReturnBicyclObj();
		// objectName.getBicycle(); --> will return a Bicycle obj

		// Ivehicle (Interface) vehicleObj
		// (Object)=classInstanceReturningObj.getBicycle();
		Iterator<String> namesListItr = namesList.iterator();
		//System.out.println("using iterator: ");
		
		System.out.println("Before Dave's removal");
		System.out.println(namesList);
		// Iterator is a component to iterate over collections
		// Alex (P),Charles,Raj,Mike,Dave,Alex (P)
		while (namesListItr.hasNext()) {
			// Alex, Charles, Raj etc.... Alex
			String name = namesListItr.next();

			if (name.equals("Dave")) {
				//remove only the current element
				namesListItr.remove();
			}
		}
		System.out.println("After Dave removal");
		System.out.println(namesList);
		
		System.out.println("Iterating using list iterator forward");
		ListIterator namesListListIterator=namesList.listIterator();
		while(namesListListIterator.hasNext()){
			System.out.println("Next index: "+namesListListIterator.nextIndex()); 
			System.out.println(namesListListIterator.next());
		}
		
		System.out.println("Iterating using list iterator backward");
		ListIterator namesListListIteratorBackward=namesList.listIterator(namesList.size()-1);
		while(namesListListIteratorBackward.hasPrevious()){
			System.out.println("Next index: "+namesListListIteratorBackward.nextIndex());
			System.out.println("real value: "+namesListListIteratorBackward.previous());
		}
		
		List newList=new ArrayList();
		newList.addAll(namesList);
		System.out.println("new list: "+newList);
		
		//removal based on index
		namesList.remove(2);
		
		//removal based on the elements
		namesList.remove("Mike");
		
		System.out.println("After removal");
		System.out.println(namesList);
		
	}

}
