package com.exceptionhandling;

public class ExceptionHadling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//no memory will be initialized/assigned
		String testStr=null;
		
		//null check - unchecked exceptions/runtime exceptions
		if(testStr!=null && testStr.equals("Raj")){//program fails here due to NPE. program will stop here.
			System.out.println("Yes, equal...");
		}else{
			System.out.println("Not equal...");
		}
		
		
	}

}
