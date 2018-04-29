package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a Map
		Map studentMap = new HashMap();

		// add values to the Map
		studentMap.put(001, "Alex");
		studentMap.put(002, "Charles");
		studentMap.put(003, "Alex");
		studentMap.put(004, "Dave");

		studentMap.put(null, null);

		// to get method, pass the key, you'll get the value back
		String value1 = (String) studentMap.get(004);

		System.out.println(value1);

		// override the previous value for this key, it will not throw any exceptions
		studentMap.put(004, "Mike"); //putIfAbsent, it's going to put only if it's not present
		
		System.out.println(studentMap);

		/*// to get method, pass the key, you'll get the value back
		//if the key is not present, value is going to be null
		String value2 = (String) studentMap.get(005);

		System.out.println(value2);
		
		//this will remove the complete entry (key & value) but based on the key
		//if the key is not present, no removal will take place
		studentMap.remove(010);
		
		//studentMap.clear();
		
		studentMap.
		
		System.out.println(studentMap);*/
		
	}

}
