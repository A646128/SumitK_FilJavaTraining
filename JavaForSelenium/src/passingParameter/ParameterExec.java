package passingParameter;

public class ParameterExec {

	public static void main(String[] args) {
		ParameterReturn obj = new ParameterReturn();
		int sum=ParameterReturn.sum(20, 50);
		System.out.println("Sum is "+sum);
		double minus=obj.sub(20.5, 17.5);
		System.out.println("Sub is "+minus);
		String name=obj.fullName("Sumit", "Yadav");
		System.out.println("name is "+name);
		
	}
	
}