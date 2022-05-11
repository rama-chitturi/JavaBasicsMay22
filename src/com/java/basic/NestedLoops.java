package com.java.basic;

public class NestedLoops {

	public static void main(String[] args) {
		
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=1;j<=i;j++) //i=1; j=1,J=2,3,4,5
//			{
//			System.out.print(j +" ");
//			}
//		System.out.println();
//		}

		int numrow=1, numcolumn;
	while(numrow<=10)
	{
		numcolumn=1;
		while(numcolumn<=numrow)
		{
			System.out.print("* ");
			numcolumn++;
		}
		System.out.println();
		numrow++;
	}
		
	
	
	}
}


	
