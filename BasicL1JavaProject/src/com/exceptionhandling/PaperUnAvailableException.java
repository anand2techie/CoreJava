package com.exceptionhandling;

//checked? on unchecked?
//user-defined exception
public class PaperUnAvailableException extends Exception {

	public PaperUnAvailableException(int paperShortage) {
		System.out.println("Paper unavailable exception thrown due to shortage of " + paperShortage + " papers.");
	}
}
