package strings.concepts;

import java.util.Scanner;

public class InsertStringToAnother {
	public static void main(String[] args) {
	    
	        
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter first name: ");
	   String str = sc.nextLine();
	    System.out.println("Enter last name: ");
	    String str2 = sc.nextLine();
	   
	   str = str.concat(" "+str2);
	   System.out.println("Full name is : "+ str);

}
}
