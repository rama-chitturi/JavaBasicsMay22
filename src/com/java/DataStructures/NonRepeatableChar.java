package strings.concepts;

public class NonRepeatableChar {

	public static void main(String[] args) {
		
		   String str= "rama";
	       char ch[] = str.toCharArray();
	       char storech = 0;
	       int length=str.length();
	       int i=0, count=0;
	       while(i<length)
	       {
	           for(int j=0;j<str.length();j++)
	           {
	               if(ch[i]==ch[j])
	               {            	  
	                   count++;
 	               }
	           }
	           System.out.println("first non-repeated occurrence is: "+ count);
	           if(count==1)
	           {
	        	   storech=ch[i];
	               break;
	           }
	           else
	           {
	        	   count=0;
	        	   i++;
	           }
	           
	       }
	       System.out.println("final first non-repeated occurrence is: "+ storech);
		        
		    }
	

}
