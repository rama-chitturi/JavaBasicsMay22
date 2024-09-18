package strings.concepts;

public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "viw";
		String str2="wvi";
		char ch3[] = null;
		
		boolean status = false;
		
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		if(ch1.length==ch2.length)
		for(int i=0;i<ch1.length;i++)
		{
			status=false;
			for(int j=0;j<ch2.length;j++)
			{
				if(ch1[i]==ch2[j])
				{
					status = true;
				}
			}
		}
		
		if(status)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not a anagram");
		}

	}

}
