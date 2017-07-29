package com.Inheritance;

public class RemodelledBicycle extends Bicycle {

	public RemodelledBicycle() {
		// TODO Auto-generated constructor stub
		speed=40;
		brand="NSA";
		withGear=true;
	}
	
	@Override
	void ridingAtRoad() {
		// TODO Auto-generated method stub
		System.out.println("I'll ride @ "+speed+" km/hr");
	}
	
	void ridingAtMountains()
	{
		System.out.println("Yay! I'm riding @ Mountains");
	}
}
