package collections;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPro

{
	public static void main(String[] args) {
		
		Set<String> hsObj = new HashSet<>();
		
	//	1. Write a Java program to append the specified element to the end of a hash set.
		hsObj.add("d");
		hsObj.add("a");
		hsObj.add("c");
		System.out.println("after adding ele:"+ hsObj);
		
	// 2. Write a Java program to iterate through all elements in a hash set.
		for(String s:hsObj)
		{
			System.out.println(s);
			
		}
		//using Iterator
		Iterator<String> itObj = hsObj.iterator();
		while(itObj.hasNext())
		{
			System.out.println(itObj.next());
			
		}
	//	3. Write a Java program to get the number of elements in a hash set.
		System.out.println("hash set size is: "+hsObj.size());
		
	//	4. Write a Java program to empty an hash set.
		Set<Integer> hsObj2 = new HashSet<Integer>();
		hsObj2.add(1);
		hsObj2.add(3);
		hsObj2.add(3);
		System.out.println("Before clear: "+hsObj2);
		hsObj2.clear();
		System.out.println("After clear "+hsObj2);
	//	5. Write a Java program to test if a hash set is empty or not.	
		if(hsObj2.isEmpty())
		{
			System.out.println("Object is empty");
		}
		else
		{
			System.out.println("Object is not empty");
		}
	//6. Write a Java program to clone a hash set to another hash set.
		HashSet<Integer> chObj = new HashSet<Integer>();
		chObj.add(1);
		chObj.add(null);
		chObj.add(null);
		HashSet<Integer> chObj2 = new HashSet<Integer>();
		chObj2 = (HashSet)chObj.clone();
		System.out.println("Cloning object"+chObj2);

	}

}
