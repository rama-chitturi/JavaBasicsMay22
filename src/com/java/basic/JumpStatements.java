package com.java.basic;

public class JumpStatements {

	public static void main(String[] args) {

		// only need 10 appl
		int application = 1 ;
//		while(application<=100)
//		{
//			if(application <=10)
//			{
//				System.out.println("send an email you are selected for first round");
//				if(application==10)
//					break;
//			}
//		
//			else
//			{
//				System.out.println("Do nothing");
//			}
//		
//			application++;
//		}
		
		for(application=1; application<=10; application ++)
		{
			if(application <=10)
			{
				if(application==7)
				{
					continue;
				}
				System.out.println("send an email you ( " +application +" ) are selected for second round");
				
			}
		
			
		}

	}

}
