package basics;

public class Variables {
	
	int InstanceVariable =10;
	static float StaticVariable =10;
	
	
	public void method()
	{
		String localVariable = "localVariable";
		System.out.println("localVarible: "+localVariable);
		
	}
	
	public static void main(String a[])
	{
		new Variables().method();
		System.out.println("staticVariable: "+new Variables().StaticVariable);
		System.out.println("InstanceVarible: "+ new Variables().InstanceVariable);
	}

}
