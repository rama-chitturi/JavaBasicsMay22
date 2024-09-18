package strings.concepts;

public class StringReverse {
	
	public static void main(String ar[])
	{
		/** String reverse using 
		 Create string variable
		 Create char array of length string
		 initialize char array index as j
		 start loop to iterate index from string length-1 to 0
		 assign string.index to char array in reverse order
		 convert char array to string, which is a reverse string
		 */
		
		
		String name = "java";
		char revname[] = new char[name.length()];
		int j=0;
		for(int i=name.length()-1; i>=0; i--)
		{			
			revname[j] = name.charAt(i);
			j++;
		}
		System.out.println("reverse of a string 'java' using str.valueOf(Char) method is: "+ name.valueOf(revname));
		
		/** String reverse using 
		 Create string variable
		 Convert string to char
		 start loop to iterate index from string length-1 to 0
		 assign string.index to char array in reverse order
		 convert char array to string, which is a reverse string
		 */
				
		String str2 = "java";
		char a[] = str2.toCharArray();
		String str3="";
		for(int i=str2.length()-1; i>=0; i--)
		{
			str3= str3+a[i];
			
		}
		System.out.println("reverse of a string 'java' from str to char[] to str is: " +str3);
		
		
		
		// String reverse using inbuilt String builder functions
		
		StringBuilder str = new StringBuilder("java");
		str = str.reverse();
		System.out.println("reverse of a string 'java' using string builder is: "+str);
		
		StringBuffer strBuffer = new StringBuffer("java");
		strBuffer = strBuffer.reverse();
		System.out.println("reverse of a string 'java' using String Buffer is: "+ strBuffer);
		
		
		
	}

}
