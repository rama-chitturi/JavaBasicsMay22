package strings.concepts;

public class Occurrence {
	
	public static void main(String ar[])
	{
		String str = "hello";
		int count;
		char[] ch = new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			count=1;
			ch[i]=str.charAt(i);
			for(int j=0;j<i;j++)
			{
				if(ch[j]==ch[i])
				{
					count++;
				}
			}
			System.out.println("letter "+ch[i]+" in "+str+" found for "+count+" times");
			
		}
		
	}

}
