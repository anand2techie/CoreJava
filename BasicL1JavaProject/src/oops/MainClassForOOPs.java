package oops;

public class MainClassForOOPs {
	
	public static void main(String[] args) {
		MainClassForOOPs classForOOPs=new MainClassForOOPs();
		classForOOPs.practiceOOPS();
	}

	void practiceOOPS() {

		// object for Bicycle
		//Cannot instantiate the type Bicycle - Bicycle is an abstract class
		//Bicycle bicycle = new Bicycle();//1 bicycle cons - right
		
		//bicycle.accelerateSpeed();//40
		//can I access changeGear() using bicycle method? - parent class can never access a child properties
		//bicycle.changeGear(); - The method changeGear() is undefined for the type Bicycle

		// object for RemodelledBicycle

		// same class as a reference
		RemodelledBicycle remodelledBicycle = new RemodelledBicycle();//2 What is Remod cons
																		// the
																		// reference
																		// here?

		remodelledBicycle.accelerateSpeed();//60
		
		//child class reusing parent class' properties
		
		remodelledBicycle.applyBrake();
		// Reference objectName=new ConstructorName();
		// Reference - same class or the super class
		// constructor - same class or the sub class

		// super class as a reference
		Bicycle bicycle2 = new RemodelledBicycle();//3 = 1 Remod cons...
		bicycle2.accelerateSpeed();//if there is any such definitions, it will consider only that
		//bicycle2.changeGear(); even if the reference is a parent class, You can't call a child properties

		// RemodelledBicycle bicycle3=new Bicycle(); need to type cast to the
		// reference
		//RemodelledBicycle bicycle3 = (RemodelledBicycle) new Bicycle(); ClassCastException

	}

}
