package com.exceptionhandling;

public class Printer {

	void printPapers(int noOfPapersToBePrinted) throws PaperUnAvailableException {
		PrinterUtil printerUtil = new PrinterUtil();
		printerUtil.checkThePaperAvailability(noOfPapersToBePrinted);
		/*try {
			printerUtil.checkThePaperAvailability(noOfPapersToBePrinted);
		} catch (Exception e) {
			PrinterUtil.paperAvailable=100;
			System.out.println("Exception is handled.");
		}*/
	}

	void scanACopy() {

	}

	void printColoredPapers() {

	}

	void loadPapersIntoThePrinter() {

	}
}
