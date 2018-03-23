package com.java.level1;

import com.POJO.Post;

public class ArrayHandling {

	public static void main(String[] args) {
		//creating an array
		int[] numbersArray=new int[10];
		
		//adding values to an array
		numbersArray[0]=100;
		numbersArray[1]=101;
		numbersArray[2]=102;
		numbersArray[3]=103;
		numbersArray[4]=100;
		
		System.out.println(numbersArray);//reference of the array
		
		//iterating and printing the values index-by-index
		for(int i=0;i<numbersArray.length;i++){
			System.out.println(numbersArray[i]);
		}
		
		
		//array of Post - Object array/reference array/user-defined array
		Post[] postsArray=new Post[4];
		postsArray[0]=new Post("Dave", 100, false);
		postsArray[1]=new Post("Alex", 12, true);
		postsArray[2]=new Post("Ram", 67, false);
		postsArray[3]=new Post("Fabien", 80, true);
			//0,1,2,3
		for(int i=0;i<postsArray.length;i++){
			System.out.println(postsArray[i].getPostedBy(true));
			System.out.println(postsArray[i].getLikesCount());
			System.out.println(postsArray[i].getCanShare());
			System.out.println("--ending printing one post--");
		}
		
	}

}
