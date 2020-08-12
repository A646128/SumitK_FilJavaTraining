package Interface;

public class AdCalc implements Calc {

	public static void main(String[] args) {
		AdCalc obj= new AdCalc();
		obj.add();
		obj.sub();
		obj.mul();
		//x=20; we can not change the value of x as it is in interface and with final data type

	}
	
	public void mul()
	{
		System.out.println("Multiply");
	}

	@Override
	public void add() {
		System.out.println("Addition");
		
	}

	@Override
	public void sub() {
		System.out.println("Subtraction");
		
	}

}
