package inheritanceMethodOverRiding;

public class ChildClass3 extends BaseClass {

	public static void main(String[] args) {
		BaseClass obj1 = new BaseClass();
		obj1.sum();
		obj1.sub();
		//obj1.mul();
		//obj1.div();

	}
	public void mul()
	{
		System.out.println("This Mul is in Child Class3");
	}
	public void div()
	{
		System.out.println("This Div is in Child Class3");
	}
}
