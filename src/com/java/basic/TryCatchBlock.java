package basics;

public class TryCatchBlock {

	public static void main(String[] args) {
	
		try {
			if(0<1)
			System.out.println("0<1");
			if(0>1)
			System.out.println("0>1");
			if(0==1)
			System.out.println("0=1");
			else if(1<2)
			{
				System.out.println("1<2");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
