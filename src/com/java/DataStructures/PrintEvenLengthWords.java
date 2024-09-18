package strings.concepts;

public class PrintEvenLengthWords {
	
	public static void main(String ar[]) 
	{
		String str = "This is to print even length word";
		String splitArray[] = str.split(" ");
		int i=0;
		while((splitArray.length)>i)
		{
			if(splitArray[i].length()%2==0)
			{
				System.out.println("words are: "+splitArray[i]);
			}
			i++;
			
		}
	}

}
