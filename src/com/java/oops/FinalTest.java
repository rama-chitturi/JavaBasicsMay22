package oops;

public class FinalTest {
	
	final int id;
	
	
	public FinalTest()
	{
		this.id = 0;
		
	}
	static final int DOJ;
	static
	{
		DOJ=24;
	}
	
	final int i=3;
	public static void main(String ar[])
	{
		FinalTest ftObj = new FinalTest();
		System.out.println(ftObj.i);
	}
	
}
