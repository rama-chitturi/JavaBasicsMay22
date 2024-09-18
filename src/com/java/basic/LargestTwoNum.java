package ArrayProgs;

import java.util.Arrays;

public class LargestTwoNum {

	public static void main(String[] args) {
		
		int a[] = {1,4,3,67,90,100,400,6};
		Arrays.sort(a);
		System.out.println("largest two numbers are:"+ a[a.length-1]+" "+a[a.length-2]);
	}

}
