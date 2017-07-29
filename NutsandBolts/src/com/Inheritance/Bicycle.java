package com.Inheritance;

public class Bicycle {

	int speed;
	String brand;
	boolean withGear;
	int noOfWheels;
	
	public Bicycle() {
		// TODO Auto-generated constructor stub
		speed=20;
		brand="Atlas";
		withGear=false;
		noOfWheels=2;
	}
	
	void ridingAtRoad()
	{
		System.out.println("I'll ride @ "+speed+" km/hr");
	}
	
	void xxxMethod()
	{
		
	}
	
	//abstract void ridingAtMountains();
}
