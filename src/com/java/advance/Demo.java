package advanced;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo {

	public static void main(String[] args) {
		String data = "hello";
        char arr[] = data.toCharArray();
        
        LinkedHashSet<Character> hsObj = new LinkedHashSet<Character>();
        
        for(int i=0;i<arr.length;i++)
        {
        	hsObj.add(data.charAt(i));
        //	System.out.println(data.charAt(i));
        	
        }
        data = hsObj.toString();
        System.out.println(data);
     Iterator<Character> ch = hsObj.iterator();
        while(ch.hasNext())
               System.out.print(ch.next());
     
             
	}

}
