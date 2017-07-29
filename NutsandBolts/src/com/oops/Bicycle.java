package com.oops;

public class Bicycle {

	protected int speed;
	protected String brand;
	protected boolean withGear;
	protected int noOfWheels;
	
	//It's useless of having constructor in abstract class but with an exception.
	public Bicycle() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside default Bicycle constructor");
		speed=20;
		brand="Atlas";
		withGear=false;
		noOfWheels=2;
	}
	
	//It's useless of having constructor in abstract class but with an exception.
		public Bicycle(int speed,String brand,boolean withGear) {
			// TODO Auto-generated constructor stub
			System.out.println("Inside 3 param Bicycle constructor");
			this.speed=speed;
			this.brand=brand;
			this.withGear=withGear;
			noOfWheels=2;
		}
	
	void ridingAtRoad()
	{
		System.out.println("I'll ride @ "+speed+" km/hr");
	}
	
	void xxxMethod()
	{
		
	}
	
}
