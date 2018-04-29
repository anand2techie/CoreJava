package oops;

public class AreaOfShapes {
	
	//methods for finding area of different shapes
	//square, circle, rectangle, triangle etc....
	
	
	/*
	 * for square
	 * area of square = side * side
	 */
	void findArea(float side){
		System.out.println("area of square "+side*side);
	}
	
	/*
	 * for triangle
	 * area of triangle = 1/2 * base * height
	 */
	void findArea(float constant,float base,float height){
		System.out.println("area of triangle "+constant*base*height);
	}
	
	/*
	 * for circle
	 * area of circle = PI * radius *radius
	 */
	void findArea(float PI, float radius){
		System.out.println("aea of circle "+PI*radius*radius);
	}
	
	/*
	 * for rectangle
	 * area of rectangle = length * breadth
	 */
	void findArea(int length,float breadth){
		System.out.println("area of rectangle "+length*breadth);
	}

}
