package com.test1;

public class Test1 {

	int testNumber=10;
	
	public char ch='c';
	
	//instance (or) non-static
	void xxxMethod()
	{
		//private int localNumber=100; not possible for local  variables
		yyyMethod();
	}
	
	//static: from static, you can't access any of the non-static properties
	public static void yyyMethod()
	{
		Test1 test1=new Test1();
		System.out.println(test1.testNumber);
		test1.xxxMethod();
	}
}
