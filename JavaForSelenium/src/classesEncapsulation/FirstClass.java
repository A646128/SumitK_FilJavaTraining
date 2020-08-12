package classesEncapsulation;

public class FirstClass {
	int x = 20;  //State of the object in Class
	int y =30;
	public static void main(String[] args) {
		
		FirstClass obj1=new FirstClass();
		obj1.sum();
		System.out.println("value of x is "+obj1.x);
		System.out.println("value of x is "+obj1.y);

	}
	public void sum()   //Method for defining the behavior of the object in class
	{
		int a=50, b=40, c;
		c=a+b;
		System.out.println("Sum is "+c);
	}
}
