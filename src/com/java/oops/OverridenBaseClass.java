package oops;

public class OverridenBaseClass extends OverridenClass{

	public static void main(String[] args) {
	 OverridenBaseClass obj = new OverridenBaseClass();
	 obj.overrideMethod();
	overrideStaticMethod();
	
	}
	public void overrideMethod()
	{
		super.overrideStaticMethod(); // to call parent class methods
		System.out.println("This is Child class statement: method without static can be overriden");
	}
	
	public static void overrideStaticMethod()
	{
		System.out.println("This is Child class statement: method with static cannot be overriden");
	}


}


