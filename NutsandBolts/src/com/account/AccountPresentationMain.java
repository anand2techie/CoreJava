package com.account;

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

}
