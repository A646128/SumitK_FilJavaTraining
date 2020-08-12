package passingParameter;

public class ParameterReturn {

	public static int sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}

	public double sub(double a , double b)
	{
		double d;
		d=a-b;
		return d;
	}
	public String fullName(String First, String Last)
	{
		String fullname;
		fullname = First+" "+Last;
		return fullname;
	}
}
