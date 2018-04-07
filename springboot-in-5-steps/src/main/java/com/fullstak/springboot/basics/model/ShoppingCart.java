package com.fullstak.springboot.basics.model;

import java.util.Date;

public class ShoppingCart {
	
	private String productName;
	private String productCode;
	private int price;
	private Date addedDate;
	
	public ShoppingCart() {
		// TODO Auto-generated constructor stub
	}
	
	public ShoppingCart(String productName, String productCode, int price, Date addedDate) {
		this.productName = productName;
		this.productCode = productCode;
		this.price = price;
		this.addedDate = addedDate;
	}



	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	
	

}
