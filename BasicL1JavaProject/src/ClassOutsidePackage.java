import com.POJO.Post;

public class ClassOutsidePackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static String localVariable="Test Local"; can't use static for local variables
		StaticRelatedClass.staticMethod();
		StaticRelatedClass class1=new StaticRelatedClass();
		class1.nonStaticMethod();
		
		//using an object, Can I access a static property? - not recommendable
		class1.staticMethod();//should be accessed in a static way 
	}
}
