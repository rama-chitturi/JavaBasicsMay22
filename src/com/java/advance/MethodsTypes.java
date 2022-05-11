package com.java.advance;

public class MethodsTypes {

	static
	{
		System.out.println("static block");
	}
	  static public void main(String[] var) {
		// Method Type
		// 1. Pre-defined - println();
		//2. User-defined
		
		//Pre-defined
		System.out.println("main method");
		printMethod();

	}
	private static void printMethod() {
		System.out.println("print method");
		
	}

}
