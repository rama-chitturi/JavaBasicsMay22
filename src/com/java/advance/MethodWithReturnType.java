package com.java.advance;

public class MethodWithReturnType {

	public static void main(String[] args) {
		
		// Without passing parameters Get some value in return
		// Call pie fucntion and get pie value
		
		float Result = pieValue();
		System.out.println("Value returning from Method body"+Result);
		
	
		
	}//End of main

	

	private static float pieValue() {

		float pieResult = 22/7;
		System.out.println("within method body"+ pieResult);
		return pieResult;
		
	}

}
