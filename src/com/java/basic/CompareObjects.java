package basics;

public class CompareObjects {
	
	public CompareObjects(int value) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String ar[])
	{
		
		CompareObjects obj1 = new CompareObjects(123);
		CompareObjects obj2 = new CompareObjects(123);
		
		if(obj1.equals(obj2))
			System.out.println("objects are equal");
		else
			System.out.println("objects are not equal");
		if(obj1==obj2)
			System.out.println("objects are equal");
		else
			System.out.println("objects are not equal");
		if(obj1.hashCode()==obj2.hashCode())
			System.out.println("objects are equal");
		else
			System.out.println("objects are not equal");
		
		if(obj1.equals(obj2))
			System.out.println("objects are equal");
		else
			System.out.println("objects are not equal");
		 
	}

}
