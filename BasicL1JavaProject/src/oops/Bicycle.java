package oops;

public abstract class Bicycle implements IVehicle{

	protected String color;
	protected int noOfWheels;
	protected boolean withGear;
	
	//protected - only the child class can access this variable.
	protected int acceleratedSpeed=20;
	protected String manufacturer;
	
	public Bicycle() {
		System.out.println("Calling Bicycle constructor...");
	}

	public void goRide() {
		System.out.println("I can ride only in Land");
	}

	public void applyBrake() {
		System.out.println("I can apply front and back brake");
	}

	public abstract void accelerateSpeed();
	
	public void switchOnLights(){
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
