package oops;

public class OverridenClass {

	public static void main(String[] args) {
		
	 System.out.println("parent class");

	}

	public static void overrideStaticMethod()
	{
		System.out.println("This is Parent class statement: method without static can be overriden");
	}
public void overrideMethod()
{
	System.out.println("This is Parent class statement: method without static can be overriden");
}
}
