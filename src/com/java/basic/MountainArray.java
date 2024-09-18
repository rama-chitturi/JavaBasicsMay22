package ArrayProgs;

public class MountainArray {

	public static void main(String[] args) {
		
		
		int arr[] = {0,1,4,3,1,0};
		int mountainPathUpValue = 0, mountainPathDownValue = 0,mountainViewValue;
		System.out.println("mountain top view: "+arr.length/2);
		
		for(int i=0;i<arr.length/2;i++)
		{
			if(arr[i]<=arr[i+1])
			{
				mountainPathUpValue = 1;
			}
			else
			{
				mountainPathUpValue= 0;
				break;
			}
		}
		for(int i=(arr.length/2);i<arr.length-1;i++)
		{
			if(arr[i]>=arr[i+1])
			{
				mountainPathDownValue = 1;
			}
			else
			{
				mountainPathDownValue = 0;
				break;
			}
		}
		mountainViewValue=mountainPathUpValue+mountainPathDownValue;
		if(mountainViewValue==2)
			System.out.println("given array is mountainArray");
		else
			System.out.println("given array is not mountainArray");
	}

}
