package strings.concepts;

public class CountStringCharacters {

	public static void main(String[] args) {
		
		String str ="Java Program";
		char ch[] = str.toCharArray();
		System.out.println("Total number of chars in 'Java Program' is: "+ch.length);
		
		//excluding spaces
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
				count++;
		}
		System.out.println("Total number of chars in 'Java Program' excluding spaces is:"+count);

	}

}
