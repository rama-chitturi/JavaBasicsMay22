package basics;

import java.lang.reflect.Array;

public class DataTypes {
	
	public static void main(String ar[])
	{
		/** Primitive Data types **/
		System.out.println("Primitive data types \n \n ");
		// Boolean
		boolean b = false;
		System.out.println("Default Boolean value: "+ b);
		b=true;
		System.out.println("Changed Boolean value: "+ b);
		
		//Numeric - Character
		char c = 0;
		System.out.println("Default char value: "+ c);
		c='A';
		System.out.println("Changed char value: "+ c);
		
		//Numeric - Integral --Integers --Int
		int i = 0;
		System.out.println("Default int value:"+ i);
		i=10;
		System.out.println("changed int value:"+ i);
		
		//Numeric - Integral -- Integers --Short
				short s = 0;
				System.out.println("Default int value:"+ s);
				s=10;
				System.out.println("changed  int value:"+ s);
				//Numeric - Integral --Integers --Long
				long l = 0;
				System.out.println("Default Long value:"+ l);
				l=10000;
				System.out.println("changed Long value:"+ l);
				//Numeric - Integral --Integers --Byte
				byte by = 0;
				System.out.println("Default byte value:"+ by);
				by=102;
				System.out.println("changed byte value:"+ by);	
				
		//Numeric --Integral --floating-point--Float
				float fp = 0;
				System.out.println("Default byte value:"+ fp);
				fp=102;
				System.out.println("changed byte value:"+ fp);	
				
				//Numeric --Integral --floating-point -- Double
				double db = 0;
				System.out.println("Default byte value:"+ db);
				db=1000.000;
				System.out.println("changed byte value:"+ db);	
				
		/*** non- primitive data types ***/
				System.out.println(" \n \n Non-Primitive data types");
				String str = null;
				System.out.println("Default value of string: "+ str);
				str="rama";
				System.out.println("changed string value:"+ str);
				
				int a[] = new int[10];
				System.out.println("Default value of Array: "+ a[0]);
				a[0]=2;
				System.out.println("Changed value of Array: "+ a[0]);
				
				System.out.println("Classes, Interfaces are also non-primitive data types");

	}
	
}
