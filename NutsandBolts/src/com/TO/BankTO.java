package com.TO;

public class BankTO {

	private int bankId;
	private String bankName;
	private String bankAddress1;
	private String bankAddress2;
	private String bankAddress3;
	
	public BankTO()
	{
		
	}
	
	
	public BankTO(String bankName,String bankAddress1,String bankAddress2,String bankAddress3)
	{
		this.bankName=bankName;
		this.bankAddress1=bankAddress1;
		this.bankAddress2=bankAddress2;
		this.bankAddress3=bankAddress3;
	}
	
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAddress1() {
		return bankAddress1;
	}
	public void setBankAddress1(String bankAddress1) {
		this.bankAddress1 = bankAddress1;
	}
	public String getBankAddress2() {
		return bankAddress2;
	}
	public void setBankAddress2(String bankAddress2) {
		this.bankAddress2 = bankAddress2;
	}
	public String getBankAddress3() {
		return bankAddress3;
	}
	public void setBankAddress3(String bankAddress3) {
		this.bankAddress3 = bankAddress3;
	}
	
	
}
