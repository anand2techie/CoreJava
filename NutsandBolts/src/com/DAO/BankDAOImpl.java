package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.TO.BankTO;

public class BankDAOImpl implements BankDAO{

	@Override
	public void addBank(BankTO bankTO) {
		// TODO Auto-generated method stub
		
		//JDBC API
		try {
			//step 1: register with the JDBC driver
			Class.forName("driverName");
			
			//step 2: create a connection out of DriverManager
			Connection connection=DriverManager.getConnection("db_url", "db_username", "db_password");
			
			//step 3: write a query - insert into Bank(bank_id,bank_name,bank_address1) values(1,'HDFC Bank','Chennai');
			String query="insert into Bank(bank_id,bank_name,bank_address1) values(";
			query=query+getBankId()+",'"+bankTO.getBankName()+",'"+bankTO.getBankAddress1()+"');";
			
			//step 4: create a statement
			Statement statement=connection.createStatement();
			
			//step 5: execute the query
			statement.executeQuery(query);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	int getBankId()
	{
		return 2;
	}

}
