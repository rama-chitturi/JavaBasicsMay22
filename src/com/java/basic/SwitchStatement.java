package com.java.basic;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		//useful in doing operations when having multiple options
		// switch - keyword
		// break, default
		//Syntax: 
		/** switch(expression/condition) {
		 *  case value1:
		 *       //code to perform for value1 
		 *   break;
		 *   case value2: 
		 *       //code to perform for value2 
		 *   break;
		 *   .....
		 *   
		 *   case valuen:
		 *   	// code to perfrom for value n
		 *   break;
		 *   }
		 *   */
		System.out.println("Enter a week day number: ");
		Scanner scObj = new Scanner(System.in);
		int weekDayNum = scObj.nextInt();
		
		switch(weekDayNum) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("No weekday found");
		
		}
	
		
		
		

	}

}
