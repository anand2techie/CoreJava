package com.java.level1;//package statementimport javax.naming.CommunicationException;

import com.POJO.Post;

public class MyFirstJavaProgram {
	
	
	
	int globalNumber=100;

	// starting point of execution. other methods needs to be called explicitly
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my first Java Program, hurrayy!!!!!");
		// findPrimeOrNot(5); one cannot call a non-static method from a static
		// block

		// Object? - Instance of a class
		// classname obj=new constructorname();
		MyFirstJavaProgram obj = new MyFirstJavaProgram();

		// object used as a reference to call the method
		//obj.findPrimeOrNot(10);
		
		//methods have to be called else it will not execute.
		obj.sampleMethod();
	}

	// find whether a number is prime or not
	void findPrimeOrNot(int number) {
		System.out.println(number);

		//System.out.println("remainders are:");
		int countOfRemainderZero = 0;
		
		//for loop
		for (int i = 1; i <= number; i++) {
			int remainder = number % i;
			//System.out.println(remainder);

			if (remainder == 0) {
				countOfRemainderZero++;
			}
		}

		//can I access remainder variable here?
		//System.out.println(remainder);
		
		//if-else statement
		//outside the for loop
		if (countOfRemainderZero == 2) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
		
		System.out.println(globalNumber);
	}
	
	void sampleMethod(){
		System.out.println(globalNumber);
		//can we access countOfRemainderZero here?
		//System.out.println(countOfRemainderZero);
		
		//global variables - can be accessed only inside a class. You need an object of that class
		//create object for Post class
		
		//Is this allowed? - should not be allowed.
		//Post.postOf="HackerSocial";
		//Post.postType="Hacked Post";
		
		
		//static variables are not to be accessed using instances. am accessing directly.
		System.out.println(Post.postOf);
		System.out.println(Post.postType);
		
		//instance 1
		Post post=new Post();
		post.setPostedBy("Alex");
		post.setLikesCount(100);
		post.setCanShare(false);
		
		//instance 2
		Post post2=new Post();
		post2.setPostedBy("Charles");
		post2.setLikesCount(200);
		post2.setCanShare(true);
		
		//instance 3
		Post post3=new Post("Daniel",300,false);
		
		System.out.println(post3.getPostedBy(true));
		System.out.println(post3.getLikesCount());
		System.out.println(post3.getCanShare());
		
		//System.out.println(post.postedBy);--> accessing this way is not recommendable
		//System.out.println(post.postedBy);
		System.out.println(post.getPostedBy(true));//Alex
		System.out.println(post.getLikesCount());//100
		System.out.println(post.getCanShare());//false
		
		System.out.println(post2.getPostedBy(true));//Charles
		System.out.println(post2.getLikesCount());//200
		System.out.println(post2.getCanShare());//true
		
	}
}
