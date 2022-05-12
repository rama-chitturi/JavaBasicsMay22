package com.java.DataStructures;

public class JavaArrays {
	
	int arravr[] = {1,2};

	public static void main(String[] args) {
		
		// Req: To store 10 integer numbers in single variable
		//      To print 10 integer numbers using the same variable
		
		int arrvar[] =  { 1, 2, 3, 4 ,5, 6, 7, 8, 9, 10};// declaration and initialize of array
		
		
		//To print fist five numbers in an array
				//			System.out.println("number at 0 index"+ arrvar[0]);
				//			System.out.println("number at 1 index"+ arrvar[1]);
				//			System.out.println("number at 2 index"+ arrvar[2]);
				//			System.out.println("number at 3 index"+ arrvar[3]);
				//			System.out.println("number at 4 index"+ arrvar[4]);
			
		// Req2: To store address details in one variable
		// d.no; street, dist, state, country 
		
		String emp1address[] = {"7-8", "Whitefield", "Gunjur", "Bangalore", "Karnataka", "India"};
				//			System.out.println(emp1address[0]);
				//			System.out.println(emp1address[1]);
				//			System.out.println(emp1address[2]);
				//			System.out.println(emp1address[3]);
				//			System.out.println(emp1address[4]);
				//			System.out.println(emp1address[5]);
		
		
		// Array with using loops
		
		System.out.println("array length: "+ arrvar.length);
		
		for(int varIndex=0; varIndex< arrvar.length; varIndex++)
		{
			System.out.println(arrvar[varIndex]);
		}
		
		// To print emp address
		for(int empIndex=0; empIndex< emp1address.length; empIndex++)
		{
			System.out.println(emp1address[empIndex]);
		}
		
	
		
		
		
		
	}

}
