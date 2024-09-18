package ArrayProgs;

public class RotateArray {

	public static void main(String[] args) {

		int arr2[] = {1,2, 3, 4,5};
		int[] arr = new int[arr2.length];
		int valuetorotate, nextvalue;
		// to print as {5,1,2,3,4}
		
		for(int i=0; i<arr.length; i++)
		{
			if(i==arr.length-1)
			{
				arr[0]=arr2[arr.length-1];
			}
			else
			{
			valuetorotate = arr2[i]; // 1 stores
//			nextvalue = arr[i+1];// 2 stores in temp
			arr[i+1]=valuetorotate;// 1 stores in 2 position
//			valuetorotate= nextvalue; // 1 stores in 2 position
			}
		
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		
		/**
		 * store value 2 in temp
		 * assign 1 to 2 position
		 * 
		 */
		

	}

}
