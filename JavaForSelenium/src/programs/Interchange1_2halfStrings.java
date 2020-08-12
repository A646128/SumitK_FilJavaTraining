package programs;

public class Interchange1_2halfStrings {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a="fighter";
		String b = "warrior";
		Interchange(a,b);
	}
	public static void Interchange (String a, String b)
	{
	int len1=a.length();
	int len2=b.length();
	String a1=a.substring(0,len1/2)+b.substring(len2/2,len2);
	String b1=b.substring(0,len2/2)+b.substring(len1/2,len1);
	System.out.println(a1 +" "+ b1);
	}

}
