package ArrayProgs;

import java.util.HashSet;
import java.util.Set;

public class Test 
{
	
	public static void String(ar[])
	{
	
	   String str="test";
       String str2=" automation test";
       String str3 = str.concat(str2);
       System.out.println("after merging "+ str3);
       String str4[] = str3.split(" ");
    Set<String> setObj = new HashSet<String>();
    
       int count=0;
       for(int i=0;i<str4.length;i++)
       {  
           setObj.add(str4[i]);
       }
       for(String s: setObj)
       System.out.println(s);
   }

}
