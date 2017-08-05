package com.account;

public class AccountBO {

	
	void withdrawAmount(Account account,int amountToBeWithdrawn) throws ExpiredAcccountException
	{
		
		AccountDAO accountDAO=new AccountDAO();
		accountDAO.checkAccountExists(account);//if exception occurs here, below lines will not be executed
		if(account.getAccountBalance()<amountToBeWithdrawn)
		{
			throw new InsufficientFundsException();
		}
		else
		{
			account.setAccountBalance(account.getAccountBalance()-amountToBeWithdrawn);
			System.out.println("Amount has been withdrawn. This is your new balance: "+account.getAccountBalance());
		}
	}
	
}
