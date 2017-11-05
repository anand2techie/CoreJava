package com.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.oops.AccountType;
import com.oops.BankAccount;
import com.oops.Customer;

public class SerializationMain {
	
	static File file=new File("F:\\Gokul session\\Serialization files\\serializedFile.ser");

	public static void main(String[] args) {
		
		//doSerialize();
		
		doDeSerialize();
	}

	private static void doDeSerialize() {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream;
		ObjectInputStream objectInputStream=null;
		try {
			fileInputStream = new FileInputStream(file);
			objectInputStream=new ObjectInputStream(fileInputStream);
			Customer customerObj=(Customer) objectInputStream.readObject();
			System.out.println(customerObj.getCustomerName());
			System.out.println(customerObj.getCustomerAddress());
			System.out.println(customerObj.getCustomerAccBalance());
			System.out.println(customerObj.getNominees());
			System.out.println(customerObj.getBankAccount().getAccountBranch());
			System.out.println(customerObj.getBankAccount().getBank());
			System.out.println(customerObj.getBankAccount().getAccountId());
			System.out.println(customerObj.getBankAccount().getBankKey());
			System.out.println(customerObj.getNominees());
			System.out.println(customerObj.getAccountTypes());
			System.out.println("DeSer successful");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				objectInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void doSerialize() {
		//1. Create a FileOutputStream by specifying to which file you wanna write the Object
		ObjectOutputStream objectOutputStream=null;
		try {
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			objectOutputStream=new ObjectOutputStream(fileOutputStream);
			
			List<String> nomineesList=new ArrayList<String>();
			nomineesList.add("Dave");
			nomineesList.add("Angus");
			//construct customer object
			Customer customerObj=new Customer("Arav", 1234, 34000l, "Hyderabad", nomineesList);
			
			BankAccount bankAccount=new BankAccount();
			bankAccount.setBank("HDFC Bank");
			bankAccount.setAccountBranch("T.nagar");
			bankAccount.setAccountId(12345);
			bankAccount.setBankKey("Qwerty@12");
			customerObj.setBankAccount(bankAccount);
			
			List<AccountType> accountTypes=new ArrayList<AccountType>();
			accountTypes.add(new AccountType('S',"Savings Account"));
			accountTypes.add(new AccountType('C',"Current Account"));
			accountTypes.add(new AccountType('L',"Loan Account"));
			accountTypes.add(new AccountType('R',"Recurring Account"));
			
			customerObj.setAccountTypes(accountTypes);
			
			//write customer Object
			objectOutputStream.writeObject(customerObj);//customerObj will be written to serializedFile.ser
			
			System.out.println("Ser successful");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				objectOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
