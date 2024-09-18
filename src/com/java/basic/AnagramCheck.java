package ArrayProgs;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		String str = "VAN";
		String str2= "NAV";
		
		
		char ch1[] = str.toCharArray();
		char ch2[] = str2.toCharArray();
		Boolean result = false;

		if(ch1.length==ch2.length)
		{
			System.out.println("same lengths");
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			int i=0;
			while(i<ch1.length-1)
			{
				
				if(ch1[i]!=ch2[i])
				{
					result= false;
				}
				else
				{
					result=	 true;
					i++;
				}
			}

			if(result)
				System.out.println("Given strings "+Arrays.toString(ch1)+" "+Arrays.toString(ch2)+" are  anagram words");
			
			else
				System.out.println("Given strings "+Arrays.toString(ch1)+" "+Arrays.toString(ch2)+" are not anagram words");
		}
	else
	{
		System.out.println("Given strings "+Arrays.toString(ch1)+" "+Arrays.toString(ch2)+" are not anagram words");
	}
		

}

}


