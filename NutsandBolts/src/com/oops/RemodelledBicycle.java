package com.oops;

public class RemodelledBicycle extends Bicycle {

	public RemodelledBicycle() {
		// TODO Auto-generated constructor stub
		super(40,"NSA",false); //this is also possible
		System.out.println("Inside Remodelled Bicycle constructor");
		speed=40;
		brand="NSA";
		withGear=true;
	}
	
	public RemodelledBicycle(int speed,String brand,boolean withGear) {
		// TODO Auto-generated constructor stub
		super(speed,brand,withGear); // super keyword can always be the first line
		System.out.println("Inside 3 param Remodelled Bicycle constructor");
		this.speed=speed;
		this.brand=brand;
		this.withGear=withGear;
	}
	
	@Override
	void ridingAtRoad() {
		//super(); not possible here.
		// TODO Auto-generated method stub
		System.out.println("I'll ride @ "+speed+" km/hr");
	}
	
	void ridingAtMountains()
	{
		System.out.println("Yay! I'm riding @ Mountains with RemodelledBicycle");
	}
}
