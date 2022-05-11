package com.java.advance;

public class ReverseOfNumber {

	public static void main(String[] args) {
	
		//Req: reverse of a number for 1234, 56789, 012345
		reverseNumber(01234);
		reverseNumber(56789);
		reverseNumber(012345); // when a number starts with zero, it takes as a Octal
	
	}
	public static void reverseNumber(int number)
	{
		int  quotient, remainder, reverseNum=0;
		
		while(number!=0)
		{
	
		quotient = number/10;
			
		remainder = number%10;
		reverseNum = remainder + reverseNum*10;
		number = quotient;
		}
		System.out.println(reverseNum);
	}
	
	
	

}
