package com.java.advance;

import java.util.Scanner;

public class GettingUserInput {

	public static void main(String[] args) {
		
		System.out.println("Enter a week day number: ");
		Scanner scObj = new Scanner(System.in);
		int weekDayNum = scObj.nextInt();
		
		
		System.out.println("Enter your name: ");
		Scanner scObj2 = new Scanner(System.in);
		String nameValue = scObj2.nextLine();
		
		System.out.println("Entered weekday number: " + weekDayNum);
		System.out.println("Entered name: " + nameValue);
	}

}
