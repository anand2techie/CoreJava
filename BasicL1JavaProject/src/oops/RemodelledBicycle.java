package oops;

public class RemodelledBicycle extends Bicycle {
	
	private int ridingSpeedAtMountains;
	
	public RemodelledBicycle() {
		System.out.println("Calling Remodelled Bicycle constructor...");
	}

	//new definition
	void changeGear() {

	}

	//overriding properties
	@Override
	void accelerateSpeed() {
		//can I access it here? - The field Bicycle.acceleratedSpeed is not visible
		acceleratedSpeed=acceleratedSpeed+40;
		System.out.println("Speed of Remodelled Bicycle: "+acceleratedSpeed);
	}

	@Override
	void goRide() {
		System.out.println("I can ride in both land and mountains");
	}
	
	@Override
	void switchOnLights() {
		System.out.println("This is a multi colored light..");
	}
}
