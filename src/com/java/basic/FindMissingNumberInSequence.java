package ArrayProgs;

public class FindMissingNumberInSequence {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 6};
		int missingNum =findMissingNum(arr);
		System.out.println("missing number in given array is: "+ missingNum);
		
	}
	public static int findMissingNum(int arr[])
	{
		int missingNum, nNumbersSum, arraySum=0;
		int n = arr.length+1;
		nNumbersSum = (n*(n+1))/2;
		for(int i=0;i<arr.length;i++)
		{
			arraySum +=arr[i];
		}
		missingNum = nNumbersSum-arraySum;
		return missingNum;
	
	}

}
