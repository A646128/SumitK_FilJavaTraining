package programs;

public class RevStringWithChar {

	public static void main(String[] args) {
		String Input = "He is the one";
		StringBuilder Input1= new StringBuilder();
		Input1.append(Input);
		Input1=Input1.reverse();
		for (int i=0 ; i <Input1.length(); i++)
		{
			System.out.print(Input1.charAt(i));
		}

	}

}
