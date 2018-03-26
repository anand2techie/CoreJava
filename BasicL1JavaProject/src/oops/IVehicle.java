package oops;

public interface IVehicle {
	
	//can we have any constructor here?
	
	/*Interfaces cannot have constructors
	IVehicle(){
		
	}*/
	
	int someNumber=10;
	String testString="Test Value";

	//by default, all these methods are abstract methods.
	void goRide();

	void applyBrake();

	void accelerateSpeed();
	
	void switchOnLights();
	
	void testMethodWithArgs(String test1,int test2);
}
