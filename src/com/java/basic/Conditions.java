package com.java.basic;

public class Conditions {

	public static void main(String[] args) {
		
		
		// class hour 1 ; Manual Testing session
		//class hour 2 ; Java session
		
		// integers  -2, -1, 0, 1, 2
		//if a number > 0; then it is positive num
		// if a number <0 ; then it is negative num
		//  or else number = 0' its just neutral or zero
		
		// if else
		//boolean = true ; false; 1 or 0
		
		int number = -1;
		
		if(number > 0) // 1>0 // -1>0 if(true) if(false)
		{
			System.out.println("It is a positive num");
		}
		else if(number <0) // if(-1<0) ; if(true); 
		{
			System.out.println("It is a negative num");
		}
		else
		{
			System.out.println("It is a zero");
		}
		
		//  var hour = 1 ; Manual Testing session
		// var hour = 2 ; Java session
		
		int hour = 2; 
				
		if(hour == 1)
		{
		
		System.out.println("It is manual Testing session");
		}
		
		else if(hour == 2)
		{
		System.out.println("It is Java session");
		}
		
		// two addons
		
		if(hour == 1)
	
			System.out.println("It is manual Testing session");
			System.out.println("It is manual Testing session ongoing");
		

	}

}
