package com.POJO;

/*
 * 
 * Post is something that you see in social networking site
 * This class is an Encapsulated class
 */
public class Post {
	
	//default constructor
	public Post() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside default constructor...");
		new Post("default user",0,false);
	}
	
	//parameterized constructor
	public Post(String postedBy,int likesCount,boolean canShare) {
		// TODO Auto-generated constructor stub
		System.out.println("Inside parameterized constructor...");
		this.postedBy=postedBy;
		this.likesCount=likesCount;
		this.canShare=canShare;
	}

	// variables --> global
	private String postedBy;
	
	//do we need getters and setters for static properties?
	public final static String postType="Academic";
	public final static String postOf="AcadSocial";
	
	
	private int likesCount;
	private boolean canShare;

	// public getters and setters methods
	public String getPostedBy(boolean canAccess) {
		if (canAccess) {
			return postedBy;
		} else {
			return null;
		}
	}
							//local - method arguments are also local variables
	public void setPostedBy(String postedBy) {
		//global variable = local variable
		this.postedBy = postedBy;
	}

	public int getLikesCount() {
		return likesCount;
	}

	public void setLikesCount(int likesCount) {
		this.likesCount = likesCount;
	}

	public boolean getCanShare() {
		return canShare;
	}

	public void setCanShare(boolean canShare) {
		this.canShare = canShare;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return postedBy;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Post post=(Post) obj;
		return postedBy.equals(post.getPostedBy(true));
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return postedBy.hashCode();//unique reference of each object
	}
}
