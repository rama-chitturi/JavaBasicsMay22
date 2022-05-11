package com.java.advance;

public class MethodsDemo2 {

	public static void main(String[] args) {
		//Method call for - without return type and method call within body
		doAddition(0,1);
		doAddition(1, 2);
		doAddition(2, 3);
		doAddition(3, 4);
		
		/* four diff structure
		 * 1. Method with return type
		 * 2. Method without return type
		 * 3. Method with arguments/parameters
		 * 4. Method without parameters*/
	}
	public static void printAddResult(int result)
	{
		System.out.println("Addition of two numbers:" +result);
	}
	
	//without return type and method call within body
	public static void doAddition(int numA, int numB)
	{
		int M2result;
		M2result = numA + numB;
		printAddResult(M2result);
		
	}


}
