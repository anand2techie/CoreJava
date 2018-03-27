package com.exceptionhandling;

public class PrinterUtil {

	static int paperAvailable=18;
	
	void checkThePaperAvailability(int paperNeeded) throws PaperUnAvailableException{
		if(paperNeeded<=paperAvailable){
			System.out.println("Good to go!");
		}else{
			throw new PaperUnAvailableException(paperNeeded-paperAvailable);
		}
	}
	
	void checkTheCartridgeLevel(){
		
	}
	
	void checkTheAccess(){
		
	}
	
	
}
