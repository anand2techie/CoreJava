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
	public void accelerateSpeed() {
		//can I access it here? - The field Bicycle.acceleratedSpeed is not visible
		acceleratedSpeed=acceleratedSpeed+40;
		System.out.println("Speed of Remodelled Bicycle: "+acceleratedSpeed);
	}

	@Override
	public void goRide() {
		System.out.println("I can ride in both land and mountains");
	}
	
	@Override
	public void switchOnLights() {
		System.out.println("This is a multi colored light..");
	}

	@Override
	public void testMethodWithArgs(String test1, int test2) {
		// TODO Auto-generated method stub
		
	}
}
