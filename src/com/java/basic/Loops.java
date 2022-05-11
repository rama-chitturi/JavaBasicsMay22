package com.java.basic;

public class Loops {
	
	int var;

	public static void main(String[] args) {
		
		
		// Loops -  intialization; condition; incr/decr; Statement
		
		
		// operators ; + , - , var =5 ; var++ = 5 +1 =6; 7 --> 7 +1 = 8 ,
		// ++ is called increment operator
		// -- ; var =5 var--; 5 -1 = 4; 8 -1; 7 var =7
		//-- is called decrement operator
		
		// For, while , do while - inti, conditions and incr/decr
	
		
		// for(intialization;condition;incr/decr)
		// var =5; var>0; var++
//		int var;
		int var;
		
		for(var=1;var<=5;var++)
		{
			// System.out.println(var);
		}
			
		// 1<=5 ; true; 1 --> 
		//var = 2; 2<=5 ; true; 2--> 2+1
		//var=3 ; 3<=5; true; 3 --> 3 +1
		//var=4; 4<=5; true ; 4 --> 4 +1
		//var=4; 5<=5 true; 5; --> 5 +1
		//var=6; 6<=5 ; false
		
		//While loop Structure
		// intialization before loop; condition with while stat; incre/decre within while body along with statement
		
		int whilevar = 1;  
		while(whilevar<=5)
		{
			System.out.println("number:" + whilevar);
			//do some operation   
		// incr/dec variable value
			if(whilevar==4)
			break;
			whilevar++;
		}
		
		//do while - loop
		
		// Intialization before loop; condition with while stat; incre/decre within while body along with statement
		
		int doWhilevar = 1;
		
		do
		{
			System.out.println("number:" + doWhilevar);
			//do some operation
			doWhilevar++;
		}while(doWhilevar <=5);
		
		

	}

}
