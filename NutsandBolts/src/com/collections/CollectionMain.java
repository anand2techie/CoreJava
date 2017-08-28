package com.collections;

/**
 * 
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.sound.midi.Synthesizer;

import com.oops.Customer;

public class CollectionMain {

	static List<String> namesList = createAListOfString();

	static Set<String> customerLocationAsHashSet = createAHashSetOfString();

	static Set<String> customerLocationAsLinkeHashSet = createALinkedHashSetOfString();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * //doListOperations(); addElementsToList();
		 * 
		 * printListValues();
		 * 
		 * addElementsToSet(customerLocationAsHashSet);
		 * 
		 * System.out.println("As Hash Set");
		 * printSetValues(customerLocationAsHashSet);
		 * 
		 * System.out.println("As Linked Hash Set");
		 * printSetValues(customerLocationAsLinkeHashSet);
		 * 
		 * //doSetOperations();
		 */

		// testSetAddition();

		// learnCollectionofObjects();

		learnCollectionofObjects();
	}

	private static Set<String> createALinkedHashSetOfString() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Set<String> customerLocationSet = new LinkedHashSet<String>();
		return customerLocationSet;
	}

	private static Set<String> createAHashSetOfString() {
		// TODO Auto-generated method stub
		Set<String> customerLocationSet = new HashSet<String>();
		return customerLocationSet;
	}

	private static void doSetOperations() {
		// TODO Auto-generated method stub
		// Set dummySet=new Set(); this is not possible.

		// addElementsToSet();

		// clearSetValues(customerLocationSet);
	}

	private static void addElementsToSet(Set<String> customerLocationAsSet) {
		// adding values to the set
		customerLocationAsHashSet.add("Chennai");
		customerLocationAsHashSet.add("Bengaluru");
		customerLocationAsHashSet.add("Hyderabad");
		customerLocationAsHashSet.add("Hyderabad"); // no exception but addition
													// will be skipped
	}

	private static void printSetValues(Set<String> customerLocationAsSet) {
		System.out.println(customerLocationAsSet);
	}

	private static void clearSetValues(Set customerLocationSet) {
		System.out.println("Before clearing: " + customerLocationSet);

		customerLocationSet.clear();

		System.out.println("After clearing: " + customerLocationSet);
	}

	private static void doListOperations() {
		// creating a List
		// List namesList=new List(); //Interface doesn't have a constructor. so
		// this is not possible.

		addElementsToList();

		getSizeOfAList();

		// System.out.println(namesList.contains("ananth"));

		removeAnElementFromList();

		addELementAtSpecifiedIndex();

		addListOfElementsToAList();

		setElementInAList();

		useForLoopToIterateList();

		useForEachLoopToIterateList();

		useIteratorToIterateList();

		useListIteratorToIterateList();

		convertListToAnArray();
	}

	private static void convertListToAnArray() {
		Object[] namesArray = namesList.toArray();

		System.out.println("0th index from array: " + namesArray[0].toString());
	}

	private static void useListIteratorToIterateList() {
		// you have option to iterate from the last element

		// when u initialize list iterator you've to specify the point from
		// where u need to iterate backwards
		ListIterator<String> namesListAsListIterator = namesList.listIterator(namesList.size());

		// will check about this!!

		System.out.println("After using list iterator: ");
		while (namesListAsListIterator.hasPrevious()) {
			String name = namesListAsListIterator.previous();
			namesListAsListIterator.nextIndex();
			namesList.add("Jeeva");
			System.out.println(name);
		}
	}

	private static void useIteratorToIterateList() {

		// using Iterator - creating an Iterator
		Iterator<String> namesListItr = namesList.iterator();

		// namesListItr --> Ananth,Gokul,Alex,David,Shiva
		while (namesListItr.hasNext()) // check the condition until which this
										// loop needs to run
		{
			String name = namesListItr.next(); // extracts the value one by one
												// from the list
			// namesList.add("Jeeva");
			if (name.equals("Alex"))
				namesListItr.remove(); // remove will remove the elements that
										// is pointing the current iteration
		}

		System.out.println("List values after removing Alex: " + namesList);
	}

	private static void useForEachLoopToIterateList() {

		System.out.println("List values using for each: ");
		// using for-each/enhanced for loop
		for (String name : namesList) {
			System.out.println(name);
		}
	}

	private static void useForLoopToIterateList() {
		// using for/while/do-while
		for (int i = 0; i < namesList.size(); i++) {
			if (namesList.get(i).length() > 5) {
				System.out.println("list values which has length more than 5: " + namesList.get(i));
			}
		}
	}

	private static void setElementInAList() {
		namesList.set(1, "Alex"); // will override

		System.out.println("List values after setting Alex at 1st index: " + namesList);
	}

	private static void addListOfElementsToAList() {
		List namesListTobeAdded = new ArrayList();
		namesListTobeAdded.add("Charles");
		namesListTobeAdded.add("David");
		namesListTobeAdded.add("David");

		namesList.addAll(1, namesListTobeAdded);

		System.out.println("List values after adding another list @ 1st index: " + namesList);
	}

	private static void addELementAtSpecifiedIndex() {
		namesList.add(1, "Shiva"); // just an insertion; doesn't override. old
									// element will go 1 position down

		System.out.println("List values after adding Shiva at 1st index: " + namesList); // this
																							// will
																							// print
																							// as
																							// an
																							// Object
	}

	private static void removeAnElementFromList() {
		System.out.println("Result of removal operation: " + namesList.remove("Shiva"));

		System.out.println("List after removing Shiva: " + namesList);
	}

	private static void getSizeOfAList() {
		System.out.println("Size of the list is: " + namesList.size());
	}

	private static void addElementsToList() {
		namesList.add("Gokul"); // it will be added to 0th index namesList: 0
								// --> Gokul
		namesList.add("Ananth"); // it will be added to 1st index namesList: 0
									// --> Gokul; 1 --> Ananth etc....
		namesList.add("Ananth");

		// printListValues();
	}

	private static void printListValues() {
		System.out.println("After adding elements: " + namesList);
	}

	private static List<String> createAListOfString() {
		// SuperClass/Interface objectName=new SubClass();
		List<String> namesList = new ArrayList<String>(); // create 10 memories
															// as an array
		return namesList;
	}

	static void testSetAddition() {
		Set<Integer> testLinkedHashSet = new TreeSet<Integer>();
		testLinkedHashSet.add(100);
		testLinkedHashSet.add(10);
		testLinkedHashSet.add(1000);
		System.out.println(testLinkedHashSet);
	}

	static void learnCollectionofObjects() {
		List<Customer> customersList = new ArrayList<Customer>();

		// String customerName,int customerId,long customerAccBalance,String
		// customerAddress,List<String> nominees

		// pre-defined nominees list
		String[] nomineesArrayForCharles = { "Dinesh", "Tharun" };
		String[] nomineesArrayFoDavid = { "Jeeva", "Ram" };
		String[] nomineesArrayForArun = { "Jeeva", "Ram" };
		String[] nomineesArrayForDivya = { "Dinesh", "Tharun" };

		// individual customer objects wth diff data
		Customer charlesCustoomerObj = new Customer("Charles", 123, 10000l, "Chennai",
				Arrays.asList(nomineesArrayForCharles));
		Customer davidCustoomerObj = new Customer("David", 123, 1000l, "Chennai", Arrays.asList(nomineesArrayFoDavid));
		Customer arunCustoomerObj = new Customer("Arun", 125, 40000l, "Bengaluru", Arrays.asList(nomineesArrayForArun));
		Customer divyaCustoomerObj = new Customer("Divya", 126, 20000l, "US", Arrays.asList(nomineesArrayForDivya));

		// adding customer objects to the list
		customersList.add(charlesCustoomerObj);
		customersList.add(davidCustoomerObj);
		customersList.add(arunCustoomerObj);
		customersList.add(divyaCustoomerObj);

		// System.out.println(customersList);

		ListIterator<Customer> customersListItr = customersList.listIterator();

		// iterating the customersList
		while (customersListItr.hasNext()) {
			Customer customerObj = customersListItr.next();
			if (customerObj.isValidCustomer() == null || customerObj.isValidCustomer()) {
				// retrieving nominees list back
				List<String> nomineesListOfCurrentCustomer = customerObj.getNominees();
				int nextIndex = customersListItr.nextIndex();
				if (nomineesListOfCurrentCustomer != null && customersList != null) {
					setValidFlagForCustomers(customersList, nextIndex, nomineesListOfCurrentCustomer);
				}
				
				//setting true to validCustomer. Since we iterate only valid ones, once we're here.
				customerObj.setValidCustomer(true);
			}
		}
		
		printCustomerWithValidity(customersList);
	}

	private static void printCustomerWithValidity(List<Customer> customersList) {
		// TODO Auto-generated method stub
		for(Customer customerObj:customersList)
		{
			System.out.println(customerObj);
		}
	}

	/**
	 * Method that sets valid flag for each customers based on the nominees list getting duplicated from earlier customers
	 * @param customersList
	 * @param nextIndex
	 * @param nomineesListOfCurrentCustomer
	 */
	private static void setValidFlagForCustomers(List<Customer> customersList, int nextIndex,
			List<String> nomineesListOfCurrentCustomer) {
		Iterator<Customer> subsequentCustomerListItr = customersList.listIterator(nextIndex);
		while (subsequentCustomerListItr.hasNext()) {
			Customer subsequentCustomerObj = subsequentCustomerListItr.next();
			if (nomineesListOfCurrentCustomer.equals(subsequentCustomerObj.getNominees())) {
				subsequentCustomerObj.setValidCustomer(false);
			}
		}
	}

	static void learnSetOfObjects() {

		Set<Customer> customersSet = new LinkedHashSet<Customer>();

		// String customerName,int customerId,long customerAccBalance,String
		// customerAddress,List<String> nominees

		// pre-defined nominees list
		String[] nomineesArrayForCharles = { "Dinesh", "Tharun" };
		String[] nomineesArrayFoDavid = { "Jeeva", "Ram" };
		String[] nomineesArrayForArun = { "Gokul", "Ananth" };
		String[] nomineesArrayForDivya = { "Dinesh", "Tharun" };

		// individual customer objects wth diff data
		Customer charlesCustoomerObj = new Customer("Charles", 123, 10000l, "Chennai",
				Arrays.asList(nomineesArrayForCharles));
		Customer davidCustoomerObj = new Customer("David", 123, 1000l, "Hyderabad",
				Arrays.asList(nomineesArrayFoDavid));
		Customer arunCustoomerObj = new Customer("Arun", 125, 40000l, "Chennai", Arrays.asList(nomineesArrayForArun));
		Customer divyaCustoomerObj = new Customer("Divya", 126, 20000l, "US", Arrays.asList(nomineesArrayForDivya));

		// adding customer objects to the list
		customersSet.add(charlesCustoomerObj);
		customersSet.add(davidCustoomerObj);
		customersSet.add(arunCustoomerObj);
		customersSet.add(divyaCustoomerObj);

		// System.out.println(customersList);

		Iterator<Customer> customersSetItr = customersSet.iterator();

		// iterating the customersList
		while (customersSetItr.hasNext()) {
			Customer customerObj = customersSetItr.next();

			System.out.println(customerObj.getCustomerName());

			// retrieving nominees list back
			List<String> nomineesList = customerObj.getNominees();
		}

	}
}
