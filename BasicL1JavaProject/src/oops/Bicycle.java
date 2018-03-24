package oops;

public class Bicycle {

	protected String color;
	protected int noOfWheels;
	protected boolean withGear;
	
	//protected - only the child class can access this variable.
	protected int acceleratedSpeed=20;
	protected String manufacturer;
	
	public Bicycle() {
		System.out.println("Calling Bicycle constructor...");
	}

	void goRide() {
		System.out.println("I can ride only in Land");
	}

	void applyBrake() {
		System.out.println("I can apply front and back brake");
	}

	void accelerateSpeed() {
		acceleratedSpeed=acceleratedSpeed+20;
		System.out.println("Speed of Bicycle: "+acceleratedSpeed);
	}
	
	void switchOnLights(){
		System.out.println("This is a single colored light..");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public boolean isWithGear() {
		return withGear;
	}

	public void setWithGear(boolean withGear) {
		this.withGear = withGear;
	}

	public int getAcceleratedSpeed() {
		return acceleratedSpeed;
	}

	public void setAcceleratedSpeed(int acceleratedSpeed) {
		this.acceleratedSpeed = acceleratedSpeed;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
}
