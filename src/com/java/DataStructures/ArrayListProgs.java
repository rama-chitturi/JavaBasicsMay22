package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgs {

	public static void main(String[] args) {
		
// 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
		ArrayList<String> list = new ArrayList<String>();
		list.add("Green");
		list.add("Blue");
		list.add("Cyan");
		System.out.println(list);
	
		
		
//2.Write a Java program to iterate through all elements in an array list.
		for(String it:list)
		{
			System.out.println(it);
		}
		
//3. Write a Java program to insert an element into the array list at the first position.
		list.add(0,"Grey");
		System.out.println(list);
		
//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
		System.out.println(list.get(0));

// 5. Write a Java program to update an array element by the given element.		
		list.set(0, "Amber");
		System.out.println(list);
// 6. Write a Java program to remove the third element from an array list.
		list.remove(2);
		System.out.println(list);
// 7. Write a Java program to search for an element in an array list.
		if(list.contains("Amber"))
		{
			System.out.println("Amber is found");
		}
		else
			System.out.println("Amber is not found");
// 8. Write a Java program to sort a given array list.
		Collections.sort(list);
		System.out.println(list);
//9. Write a Java program to copy one array list into another.
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("4");
		list2.add("10");
		list2.add("23");
		list2.add("24");
		list.addAll(list2);
		System.out.println(list);
//10. Write a Java program to shuffle elements in an array list.
		Collections.shuffle(list2);
		System.out.println(list2);
//11. Write a Java program to reverse elements in an array list.
		Collections.reverse(list2);
		System.out.println(list2);
		
//12. Write a Java program to extract a portion of an array list.
		System.out.println("sublist"+list.subList(2, 3));
		
// 13. Write a Java program to compare two array lists.
		
		if(list.contains(list2))
		{
			System.out.println("list compred");
		}
// 14. Write a Java program that swaps two elements in an array list.
		System.out.println("Before swap : " + list);
		String temp = list.get(0);
		list.set(0, list.get(1));
		list.set(1, temp);
		System.out.println("After swap: "+list);
		// or //
		Collections.swap(list, 2, 3);
		System.out.println("After swap: "+list);
// 15. Write a Java program to join two array lists.
		ArrayList<String> newList = new ArrayList<String>();
		newList.addAll(list);
		newList.addAll(list2);
		
		System.out.println(newList);
// 16. Write a Java program to clone an array list to another array list.
		ArrayList<String> newList2 = (ArrayList<String>)list.clone();
		System.out.println(newList2);
// 17. Write a Java program to empty an array list.
		newList2.clear();
		System.out.println(newList2);
//18. Write a Java program to test whether an array list is empty or not.
		if(newList2.size()>0)
		{
			System.out.println("list is not empty");
		}
		else
			System.out.println("list is empty");
		// or
		
		if(newList2.isEmpty())
		{
			System.out.println("list is empty");
		}
		else
			System.out.println("list is not empty");
		
// 19. Write a Java program for trimming the capacity of an array list.
		newList.trimToSize();
		System.out.println(newList);
//20. Write a Java program to increase an array list size.
		newList.ensureCapacity(10);
		System.out.println(newList.size());
// 21 . Write a Java program to replace the second element of an ArrayList with the specified element.
		newList.set(1, "changed");
		System.out.println(newList);
//22. Write a Java program to print all the elements of an ArrayList using the elements' position.
		for(int i=0;i<newList.size(); i++)
		{
			System.out.println(newList.get(i));
		}
//23. Difference between clear and remove
		
		list.remove(0); //remove particular index value or list
		list.removeAll(newList);
		list.clear(); //empty entire list
	
		
	}

}
