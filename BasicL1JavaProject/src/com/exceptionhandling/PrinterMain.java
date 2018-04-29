package com.exceptionhandling;

public class PrinterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer=new Printer();
		
		try{
			printer.printPapers(100);
			//whether this will be printed? or not? - this line will not be executed
		}catch(PaperUnAvailableException e){
			PrinterUtil.paperAvailable=100;
			System.out.println("Paper Unavailable Exception is handled");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Generic Exceptions are handled");
		}finally{
			System.out.println("closing the printer....");
		}
	}

}
