package ArrayProgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BhargavProg {
	
	public static void main(String ar[])
	{
	Integer a[] = {1, 6, 3, 4};
	Integer b[] = {3,1, 11, 7, 9};
	List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
	List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(b));	
//	List<Integer> list  = Arrays.asList(a);
//	List<Integer> list2  = Arrays.asList(b);
	list.addAll(list2);
	Collections.sort(list);
	System.out.println(list);
	
	
	
    
	
	
	
	
		
//	int Clength = a.length +b.length;
//	int c[] = new int[Clength];
//	
//	for (int i=0;i<a.length;i++)
//		c[i]=a[i];
//	
//	int j=0;
//	for (int i=0;i<b.length;i++)
//	{
//		c[c]=b[j];
//		j++;
//	}
//	
////	Arrays.sort(c);
//	for(int i=0;i<Clength;i++)
//	System.out.println(c[i]);
	

	
	

		
	}

}
