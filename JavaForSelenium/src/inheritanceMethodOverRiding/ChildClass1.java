package inheritanceMethodOverRiding;

public class ChildClass1 extends BaseClass {

	public static void main(String[] args) {
		ChildClass1 obj1 = new ChildClass1();
		obj1.sum();
		obj1.sub();
		obj1.mul();
		obj1.div();

	}
	public void mul()
	{
		System.out.println("This Mul is in Child Class1");
	}
	public void div()
	{
		System.out.println("This Div is in Child Class1");
	}
}
