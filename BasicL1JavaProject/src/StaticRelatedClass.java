import com.POJO.Post;

public /*static - class can't be a static*/ class StaticRelatedClass {
	
	/*Constructor can't be static
	 * static StaticRelatedClass(){
		
	}*/
	
	//class variables
	static String globalStaticVariable="Test Global";
	
	//instance variable
	String globalInstanceVariable = "Test Instance";
	
	//you can make an object static at the global level
	static Post post1=new Post();
	
	void nonStaticMethod(){
		
		//I can access static properties
		System.out.println(globalStaticVariable);
		staticMethod();
		
		System.out.println(globalInstanceVariable);
	}
	
	static void staticMethod(){
		System.out.println(globalStaticVariable);
		
		//not possible System.out.println(globalInstanceVariable);
		//nonStaticMethod();
		
		//how do I access instance properties? - you need to have an object
		StaticRelatedClass class1=new StaticRelatedClass();
		System.out.println(class1.globalInstanceVariable);
		class1.nonStaticMethod();
	}

}
