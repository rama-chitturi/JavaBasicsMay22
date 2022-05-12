package com.java.oops;

public class ClassConcept {
	
	// variables
	// DataType variableName;  -- declaration
	// variblaeName = value --- initialization
	
	int varname;
	
	String name = "Demo";
	
	//method body 
	//structure
	// Access_specifier keyword(dependency) returnType methodName(Parameters)
	// {
	//    operation to perform
	// }
	
	public void classdemoMethod()
	{
		System.out.println("This is a class method");
	}
	
	public static void main(String var[])
	{
		// To utilize Class variables and methods, need to create object
		// className objectName; //declaration
		// To invoke class var or method, need to initialize Object
		// objectName = new className();
		//Declare and initialize at one line
		// clasName objectName = new 
		
		ClassConcept classConObj  = new ClassConcept();
		
		//To invoke class var and method using object
		//objectName.ClassVarible;
		//objectName.classMEthods();
		
		System.out.println(classConObj.name);
		System.out.println(classConObj.varname);
		classConObj.classdemoMethod();
		
	}
	
	
}
