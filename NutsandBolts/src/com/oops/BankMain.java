package com.oops;

public class BankMain {
	
	public static void main(String[] args) {
		BankAccount bankAccount=new BankAccount();
		bankAccount.setAccountId(1234);
		bankAccount.setAccountBalance(20000);
		bankAccount.setAccountBranch("Chennai");
		bankAccount.setAccountType('S');
		
		//bankAccount.accountId=1234; acccountId is private. so, can't!
		BankMain bankMain=new BankMain();
		//bankMain.printAccountDetails(bankAccount);
		
		//HdfcBank hdfcBank=new HdfcBank(); Cannot instantiate the type HdfcBank (Interface)
		HdfcBank hdfcBank=new HdfcDigitalBank();
		hdfcBank.xxxMethod();
		hdfcBank.xxxMethod2();
		
		HdfcDigitalBank hdfcDigitalBank=new HdfcDigitalBank();
		hdfcDigitalBank.xxxMethod3();
		
		DigitalBank hdfcDigitalBankWithDigBankRef=new HdfcDigitalBank();
		hdfcDigitalBankWithDigBankRef.digitalMethod1();
	}
	
	void printAccountDetails(BankAccount bankAccount)
	{
		System.out.println(bankAccount.getAccountId());
		System.out.println(bankAccount.getAccountBalance());
		System.out.println(bankAccount.getAccountBranch());
		System.out.println(bankAccount.getAccountType());
	}

}
