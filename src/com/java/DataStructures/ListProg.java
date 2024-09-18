package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class ListProg {
	
	@Test
	public void listconcept1()
	{
		List<String> listObj = new ArrayList<String>();
		
		//add elements
		listObj.add("1");
		listObj.add("rama");
		
		//add at particulat index
		listObj.add(0, "started");
		
		//addAll elements of one list to another
		List<String> listObj2 = new ArrayList<String>();
		listObj2.add("chitturi");
		listObj2.add("lakshmi");
		
		listObj.addAll(listObj2);
		////addAll elements of one list to another at specified index
		listObj.addAll(0, listObj2);
		
		//checking if list contains an element
		if(listObj.contains("1"))
		{
			System.out.println("lsit contains 1");
			Iterator<String> itObj = listObj.iterator();
			while(itObj.hasNext())
			{
				System.out.println(itObj.next());
				
			}
		}
		//checking if list contains an whole list
				if(listObj.containsAll(listObj2))
				{
					System.out.println("lsit contains all");
					Iterator<String> itObj = listObj.iterator();
					while(itObj.hasNext())
					{
						System.out.println(itObj.next());
						
					}
		}
	//checking if both lists are same
		if(listObj.equals(listObj2))
		{
			System.out.println("Both lists are same");
		}
		else
		{
			System.out.println("Both lists are not same");
		}
		System.out.println("zeroth index element"+listObj.get(0));
		System.out.println("hashcode of listObj"+listObj.hashCode());
		System.out.println("get index of rama"+listObj.indexOf("rama"));
		System.out.println(""+listObj.set(0, "initiated"));
		System.out.println("get index 0 elements"+listObj.get(0));
		System.out.println("size of listObj"+listObj.size());
		System.out.println("remove 0th ele"+listObj.remove(0));
		System.out.println("get index 0 elements"+listObj.get(0));
		
		System.out.println("lastIndex"+listObj.lastIndexOf("rama"));
//		Iterator<String> itObj = listObj.iterator();
//		while(itObj.hasNext())
//		{
//			System.out.println(itObj.next());
//			
//		}
		
	}

}
