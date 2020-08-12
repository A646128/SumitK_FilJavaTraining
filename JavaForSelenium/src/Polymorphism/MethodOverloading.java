package Polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(10, 20);
		obj.add(10, 20, 30);
		obj.add(20.5, 41.5);
		obj.add(21.89, 100);
		obj.add(89, 200.60);
	}
	public void add(int a, int b) //Simple method overloading depends upon below signature concepts
	{
	
		int c=a+b;
		System.out.println("TC1 is "+c);
	}
	public void add(int a, int b, int d) //No of arguments are different
	{
	
		int c=a+b+d;
		System.out.println("TC2 is "+c);
	}
	public void add(double a, double b) //Arguments data-types are different
	{
	
		double c=a+b;
		System.out.println("TC3 is "+c);
	}
	public void add(double a, int b) // Arguments types are different
	{
	
		double c=a+b;
		System.out.println("TC4 is "+c);
	}

	public void add(int a, double b) // Order of Arguments are different 
	{
	
		double c=a+b;
		System.out.println("TC5 is "+c);
	}

}
