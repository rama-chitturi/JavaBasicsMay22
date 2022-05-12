package com.java.DataStructures;

public class JavaArraysAdv {

	public static void main(String[] args) {
		
		
		int arrvar[] =  { 1, 2, 3, 4 ,5, 6,7,8};
		//req: check if first number in arrays is equals to last number in array or not
		
		// conditions - if else
		// arrvar[0] arrvar[5]
		
		int length = arrvar.length;
//		System.out.println(length);
//		
//		if(arrvar[0]==arrvar[length-1])
//			System.out.println("both are same");
//		else 
//			System.out.println("both are not same");
		
		
		// Req2: Compare first and last values in string array
		String empNames[] = {"John", "James", "Paul", "Jamie", "John"};
		int empNameLength = empNames.length;
		
		if(empNames[0]==empNames[empNameLength-1])
			System.out.println("both are same");
		else
			System.out.println("both are not same");
		
		
		
		
	
	

	}

}
