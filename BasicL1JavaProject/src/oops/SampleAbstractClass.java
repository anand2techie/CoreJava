package oops;

public abstract class SampleAbstractClass {
	
	
	/* Method with definition
	 * void someMethod(){
		//write some code here....
	}*/
	
	//you cannot apply abstraction other than methods
	SampleAbstractClass(){
		
	}
	
	int abstractVariable=10;
	
	//method without definition, only declaration
	abstract void someAbstractMethod();
	
	void someNonAbstractMethod(){
		
	}
	
	//cannot make a main method abstract --> public abstract static void main(String[] args);
}
