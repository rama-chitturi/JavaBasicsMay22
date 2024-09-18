package advanced;

public class Interview_StringRev {

	public static void main(String[] args) {

		String str = "rak bank";
		// first 3 letters 
		
		String splitArray[] = str.split(" ");
		System.out.println("before reverse: " +splitArray[0]);
		
		StringBuffer result = new StringBuffer(splitArray[0]);
		String Finalresult = result.reverse().toString();
		System.out.println("after reverse: "+ Finalresult);
		
	
		System.out.println("full string post reverse: "+ Finalresult +" " +(splitArray[1]));
		
		//employee table , 3 columns, multiple rows

	}

}
