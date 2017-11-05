package com.BO;

import com.DAO.BankDAO;
import com.DAO.BankDAOImpl;
import com.TO.BankTO;

public class BankBOImpl implements BankBO{

	@Override
	public void addBank(BankTO bankTO) {
		// TODO Auto-generated method stub
		BankDAO bankDAO=new BankDAOImpl();
		bankDAO.addBank(bankTO);
	}

}
