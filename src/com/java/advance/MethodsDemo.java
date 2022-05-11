package com.java.advance;

public class MethodsDemo {

	public static void main(String[] args) {
		/** Methods - block of code 
		 * Method call and Method body
		 * purpose- reusable code
		 * Method or Function/
		/* Method syntax
		 * 1. Method definition/body:
		 * 
		 *  AccessSpecifier returnTYpe MethodName(Method Parameters)
		 *  {
		 *  // Method body, logic
		 *  }
		 *  2. Method call or function call
		 *  
		 *  MethodName(Parameters);
		 *  
		 *   */
		
		//Access specifiers/modifiers,
		//1. public - access level - to everywhere,
		//2. Private- acces level - to within class
		// 3.Protected - access level within/out of package but child class
		//4. default - nothing specifies, within package 
	
		//Requirement - add different numbers sum 0+1; 1+2; 2+3; 3+4
		
//			int numX=0, numy=1, result1;
//			result1 = numX + numy;
//			
//			int num3=0, num4=1, result2;
//			result2 = num3+num4;
			
			System.out.println("out Of Method");
			
			int methodResult = methodAddNumbers(1,2); //Method call
			System.out.println(methodResult);
			printResult();
			
			
			
		
	}//end of main
	
	//Method declaration/body for adding two numbers
	public static int methodAddNumbers(int num1, int num2)
	{
		System.out.println("Method body");
		int result;
		
		result = num1 + num2;
		
		return result;
		
	}
	
		 
	public static void printResult()
	{
		System.out.println("Print some result: Nothing to print");
	}
	
	
}//end of class
