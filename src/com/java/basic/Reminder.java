package com.java.basic;

public class Reminder {

	public static void main(String[] args) {
		 // '/' '%'
		
		int var1, var2, ResultQ, ResultR;
		var1=10; var2= 5;
		ResultQ = var1/var2;
		ResultR = var1%var2;
//	System.out.println("Quotient value is: "+ResultQ+" Remainder value is: "+ ResultR);
	
// reverse of  a number	123 --- 321
	// 
	int number=123, Remainder, quotient, Remainder2, quotient2, Remainder3, quotient3;
	quotient = number/10;
	Remainder = number%10;
	
//	System.out.println("next number to get from:" + quotient);
	System.out.println("reverse number1:" + Remainder);
	
	// Not a valid, coded for explanation
	number = quotient;
	quotient2 = number/10;
	Remainder2 = number%10;
	int reverse = 0;
	reverse = Remainder + reverse*10;
//	System.out.println("next number to get from:" + quotient2);
	System.out.println("reverse number2:" + Remainder2);
	
	number = quotient2;
	quotient3 = number/10;
	Remainder3 = number%10;
//	System.out.println("next number to get from:" + quotient3);
	System.out.println("reverse number2:" + Remainder3);
	
	int reverse = 0;
	reverse = Remainder + reverse*10; //3 // 30+2 // 320 +1
	

	}

}
