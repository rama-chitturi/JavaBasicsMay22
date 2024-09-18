package advanced;


sealed class promocode permits staff,staffFamily {

	public void promocode(String userType)
	{
		System.out.println(userType+" promocode applied");
	}

}
final class staff extends promocode
{
//this class cant be inherited due to final modifier
}
non-sealed class staffFamily extends promocode
{
//this class can be inherited due to non-sealed modifier
}

//sealed class retiredStaff extends promocode
//{
	//this way of sub class cant be created with keyword sealed
//}




// class customers extends promocode
//{
//// this is not possible as customers is not permitted
//}

// class customers extends staff
//{
////this is not possible as staff is final
//}

// class customers extends staffFamily
//{
////this is possible as staffFamily is non-sealed
//}



public class SealedClassDemo
{
	public static void main(String ar[])
	{
		staff sc = new staff();
		sc.promocode("staff");
		staffFamily scf= new staffFamily();
		scf.promocode("staffFamily");
//		customers cs = new customers();
//		cs.promocode("customers");
		
		
	}
	}


