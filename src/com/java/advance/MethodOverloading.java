package com.java.advance;

public class MethodOverloading {

	public static void main(String[] args) {
		
		//Req adding two numbers int, double
		//Can give same method name but different parameter or method structure
		
		addNumbers(1, 2);
		addNumbers(1.1,1.2);
		

	}

	private static void addNumbers(double d, double e) {
		
		System.out.println(d+e);
	}

	private static void addNumbers(int i, int j) {
		
		System.out.println(i+j);
	}
	

}
