package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.POJO.Post;

public class CollectionMainClassForSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Post> postsSet=new LinkedHashSet<Post>();
		postsSet.add(new Post("Alex",100,true));
		postsSet.add(new Post("Dave",200,true));
		postsSet.add(new Post("Chris",75,false));
		postsSet.add(new Post("Alex",75,false));//this shouldn't be inserted
		//how it can identify the duplicate elements?
		System.out.println(postsSet);
		
		/*Set<String> namesSet=new TreeSet<String>();
		namesSet.add("Alex");
		namesSet.add("Alex");//will not throw any exceptions just this will be skipped
		namesSet.add("Yash");
		namesSet.add("Dave");
		namesSet.add("Mike");
		
		System.out.println(namesSet);
		*/
		/*//we don't have methods to manipulate based on the index
		for(int i=0;i<namesSet.size();i++){
			System.out.println(namesSet.get(i));
		}
		
		for(String name:namesSet){
			System.out.println(name);
		}*/
		
		//Set doesnn't have listIterator()
		
	}

}
