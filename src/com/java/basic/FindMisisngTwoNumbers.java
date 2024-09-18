package ArrayProgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMisisngTwoNumbers {

	public static void main(String[] args) {
		Integer arr[] = {1, 2, 3, 5, 6, 10, 8};
		
		System.out.println("Before addding missing num:");
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
		findMissingNum(arr);
		

	}

	public static void findMissingNum(Integer[] arr) {
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr));
		Collections.sort(list1);
		
		Integer firstnum= list1.get(0);
		Integer nNum = list1.get(list1.size()-1);
		System.out.println("\nfirstnum: "+firstnum+" lastnum: "+nNum);
		for(Integer i=firstnum; i<nNum;i++)
		{
			if(!list1.contains(i))
			{
				list1.add(i);
				System.out.println(i+" is missing");
			}
		}
	Collections.sort(list1);
	System.out.println(list1);
		
		
	}

}
