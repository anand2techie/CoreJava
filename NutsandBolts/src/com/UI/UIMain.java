package com.UI;

import com.BO.BankBO;
import com.BO.BankBOImpl;
import com.TO.BankTO;

public class UIMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTO bankTO=new BankTO("HDFC Bank","Chennai",null,null);
		
		BankBO bankBO=new BankBOImpl();
		bankBO.addBank(bankTO);
	}

}
