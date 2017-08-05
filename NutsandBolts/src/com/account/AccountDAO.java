package com.account;

import java.util.Arrays;

public class AccountDAO {

	int validAccountNumbers[] = { 12345, 12346, 12347 };

	void checkAccountExists(Account account) throws ExpiredAcccountException {
		Arrays.sort(validAccountNumbers);
		if (Arrays.binarySearch(validAccountNumbers, account.getAccountNumber()) >= 0) {
			checkIfAccountExpired(account.getAccountNumber());
		}
		else
		{
			try {
				throw new IncorrectAccountNumberException();
			} catch (IncorrectAccountNumberException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void checkIfAccountExpired(int accountNumber) throws ExpiredAcccountException
	{
		if(accountNumber==12345)
		{
			throw new ExpiredAcccountException();
		}
	}
}
