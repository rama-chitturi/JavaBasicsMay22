package strings.concepts;

public class StringMutable {

	public static void main(String[] args) {

String s1 ="tada";
String s2 ="tada";
String s5 ="tada";
String s3 = new String("Hello");
String s4 = new String("Hello");

if(s1==(s2))
{
//	s1=s1+s2;
	s1 = s1.concat(s2);

System.out.println(s1 +" "+ s2 +" " + s3);
}
else
{
	System.out.println("heehhs");
}
	}

}
