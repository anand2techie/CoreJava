package com.account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccountPresentationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountBO accountBO=new AccountBO();
		
		Account account=new Account();
		account.setAccountNumber(12345);
		account.setAccountBalance(10000l);
		account.setAccountHolderName("Ananth");
		
		try
		{
		accountBO.withdrawAmount(account, 5000);
		System.out.println("Amount withdrawn successful!!!!");
		}
		catch(ExpiredAcccountException e)
		{
			System.out.println("Apply red color to account number and say it is expired");
		}
		catch(InsufficientFundsException e)
		{
			System.out.println("Insufficient funds.");
		}
	}

	/*	private static float readAccInfoFromConsole() {
		// Create an ISR object for reading from a console
				InputStreamReader inputStreamReader = new InputStreamReader(System.in); // char
																						// by
																						// char

				// Create a BR object for reading from an ISR object
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // line
																						// by
																						// line

				System.out.println("Enter account balance!:");
				String linesRead = "";
				float accountBalance = 0;
				try {
					while ((linesRead = bufferedReader.readLine()) != null) {
						accountBalance=new Float(linesRead);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return accountBalance;
	}
*/
}
