package advanced;



public class TestCloneable implements Cloneable{
	
	private int id;
	public TestCloneable(int id) {
		this.id=id;
	}
	
	protected Object Clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	 static public void main(String ar[]) throws CloneNotSupportedException
	{
		TestCloneable tcObj1 = new TestCloneable(1);
		TestCloneable tcObj2 = (TestCloneable) tcObj1.clone();
		System.out.println(tcObj2.id);
	}
	

}
