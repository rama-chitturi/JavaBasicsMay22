package strings.concepts;

public class Palindrome {
	public static void main(String[] args) {
	 String str ="raar";
	    char ch[] = str.toCharArray();
	    String revstr = "";
	    
	    
	   for(int i=str.length()-1; i>=0; i--)
	   {
	       revstr=revstr+ch[i];
	   }
	   System.out.println(revstr);
	   if(str.equalsIgnoreCase(revstr))
	   {
	       System.out.println("Given String "+str+" is a palindrome");
	   }
	  else
	  {
	      System.out.println("Given String "+str+" is not a palindrome");
	  }

	        
	    }

}
