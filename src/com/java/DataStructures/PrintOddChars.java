package strings.concepts;

public class PrintOddChars {

	public static void main(String[] args) {
		
		String str="Program to remove white space and print odd numbers";
		String str2[] = str.split(" ");
		for(int i=0;i<str2.length;i++)
		{
			System.out.println("for word:"+str2[i]+" odd characters are");
			int j=0;
			while(j<str2[i].length())
			{
				System.out.println(str2[i].charAt(j));
				j+=2;
			}
			
		}

	}

}
