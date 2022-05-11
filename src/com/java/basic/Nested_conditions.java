package com.java.basic;

public class Nested_conditions {

	public static void main(String[] args) {
		
		/* if(number>0)
		 *   if(number%2==0) ; even
		 *    if(number%2!=0);  odd 
		 *   else invalid */
		int number =-1;
		//Start of req- 1 nested if
		if(number>0)
		{
			if(number%2==0)
			{
				if(number<10)
				{
				System.out.println(number +" is a even and less than 10" );
				}
				else
				{
					System.out.println(number + "is a even and greater than 10");
				}
			}
			if(number%2!=0)
			{
				System.out.println(number + "is a odd number");
			}
			
		}
		//end of req.1 nested if
		
		int number2 =7;
		
		if(number2%2==0)
		{
			System.out.println("even");
		}
		else if(number2%2!=0)
		{
			System.out.println("odd number");
			//It should print all numbers less than given number 6, 5, 4, 3, 2, 1, 0
			while(number2>=0)
			{
				if(number2<=3)
				{
				System.out.println("loop repeated for num:" + number2);
				}
				number2--;
			}
		}
		
		
		
	}

}
