package com.java.oops;

public class OopsDemo {

// OOPS - Object oriented Programming
	// Inheritance, Abstraction, Polymorphism, encapsulation 
	// Object, Class
	//Class - is a structure contains class variables and class methods
	// Class structure - Class Name First letter should starts with upperCase
	/** class  ClassName {
	 * 
	 * // variables int classvar =10;
	 * 
	 *  //Methods  public void methodName()
	 *  {
	 *  
	 *  }
	 * 
	 * }
	 */
	 // Object - instance of class
	// ClassName  objectName; 
	// objectName = new className();
	
//	objectName.classvar;
//	objectName.methodName();
	// sysout(objectName.classvar); 10
	
	
////////// REq: create a variable in class scope and print it in main method  ///////
	
	 int classnumvar=5;
	 
	 public void methodDisplay()
	 {
		 System.out.println(classnumvar);
	 }
	
	public static void main(String ar[])
	{
		OopsDemo obj; // declaration of object
		obj= new OopsDemo(); //initialization of object
	
	//	System.out.println(obj.classnumvar);
		
		obj.methodDisplay();
	
	}
	
	
	
	
}
