package oops;

public class AreaOfShapesMain {

	private static final float PI = 22/7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfShapes areaOfShapes=new AreaOfShapes();
		
		//float values should be suffix'ed with f
		areaOfShapes.findArea(10.5f);//square
		
		areaOfShapes.findArea(PI, 11.5f);//circle
		
		areaOfShapes.findArea(20, 10.5f);//rectangle
		
		areaOfShapes.findArea(0.5f, 10.5f, 10.5f);//triangle
		
	}

}
