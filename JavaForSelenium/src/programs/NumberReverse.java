package programs;

public class NumberReverse {

	public int reverse(int num)
	{
		int reverse = 0;
		while(num!=0)
		{
			reverse = (reverse*10) + (num%10);
			num=num/10;
		}
		return reverse;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		NumberReverse nr = new NumberReverse();
		System.out.println(nr.reverse(1784567));

	}

}
