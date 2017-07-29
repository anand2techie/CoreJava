package com.Inheritance;

public class BicycleMain {

	
	public static void main(String[] args)
	{
		
		System.out.println("Properties of Bicycle:");
		Bicycle bicycle=new Bicycle();
		//20,Atlas,false,2
		System.out.println(bicycle.brand);
		System.out.println(bicycle.speed);
		System.out.println(bicycle.withGear);
		System.out.println(bicycle.noOfWheels);
		bicycle.ridingAtRoad();
		//bicycle.ridingAtMountains(); You can't use child class' properties when parent class is the reference
		
		System.out.println("Properties of RemodelledBicycle:");
		
		//same class as a Reference
		RemodelledBicycle remodelledBicycle=new RemodelledBicycle();
		//40,NSA,true,????
		System.out.println(remodelledBicycle.brand); //override
		System.out.println(remodelledBicycle.speed); //override
		System.out.println(remodelledBicycle.withGear); //override
		System.out.println(remodelledBicycle.noOfWheels); //re-usability
		remodelledBicycle.ridingAtRoad();
		remodelledBicycle.ridingAtMountains();
		remodelledBicycle.xxxMethod(); //possible - You can use parent class' properties when child class is the reference
		
		System.out.println("Properties of RemodelledBicycle with parent class as a reference:");
		
		//parent class as a Reference
		Bicycle importedBicycleWithParentRef=new ImportedBicycle();
		Bicycle remodelledBicycleWithParentRef=new RemodelledBicycle();
		//40,NSA,true,????
				System.out.println(remodelledBicycleWithParentRef.brand); //override
				System.out.println(remodelledBicycleWithParentRef.speed); //override
				System.out.println(remodelledBicycleWithParentRef.withGear); //override
				System.out.println(remodelledBicycleWithParentRef.noOfWheels); //re-usability
				remodelledBicycleWithParentRef.ridingAtRoad();
				//remodelledBicycleWithParentRef.ridingAtMountains();All the child class' prop will be hidden
				remodelledBicycleWithParentRef.xxxMethod(); //possible - You can use parent class' properties when child class is the reference	
				
	//RemodelledBicycle bicycleWIthChildRef=new Bicycle(); not possible
				
	Bike bikeObj=new Bike();

	RemodelledBicycle bikeObjWithRemodBicAsRef=new Bike();

	Bicycle bikeObjWithBicycleAsRef=new Bike();
	}
}
