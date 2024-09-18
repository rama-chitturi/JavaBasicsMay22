package ArrayProgs;

import java.util.ArrayList;
import java.util.List;
s
public class Occurrence {

	public static void main(String ar[])
	{
		String name ="javaprogram";
		char ch[]= name.toCharArray();
				
		List<Character> list = new ArrayList<Character>();
		for(int i=0; i<ch.length; i++)
		{
			int count =1;
			if(list.contains(ch[i]))
			{
				count=-1;
				continue;
			}
			else
			{
				for(int j=i+1; j<ch.length; j++)
				{
					if(ch[i]==ch[j])
						count++; 
				}
			}
			if(count>0)
				System.out.println("letter " + ch[i]+ " found for "+ count +" times");
					list.add(ch[i]); 
					
		}  
		
	}
}	      






