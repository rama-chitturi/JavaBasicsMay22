package com.java.advance;

public class MethodParameters {

	public static void main(String[] args) {
		
		
		//Pass Method name as Parameter and print the method name
		printMethodName("printMethodName");
		printNumber(1);
		
			}

	private static void printNumber(int number) {
		System.out.println(number);
	}

	private static  void printMethodName(String methodName) {
		System.out.println(methodName);
		
	}




}
