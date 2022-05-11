package com.java.advance;

public class MethodwithReturnTypeParameter {

	public static void main(String[] args) {
	// Add two numbers and get that value to subtract from 100
		
		int AdditionResult = addNumbers(1, 2);
		subtract(AdditionResult);
	}
	
	private static void subtract(int additionResult) {
		
		System.out.println(100-additionResult + "is the final result");
		
	}

	private static int addNumbers(int num1, int num2) {
		
		int addResult = num1 +num2;
		return addResult;
			
	}

}
