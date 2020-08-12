package programs;

public class Fibonacci {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int fibnum=15;
		int []fib=new int[fibnum];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<fibnum;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
		}
		for(int i=0;i<fibnum;i++)
		{
		System.out.print(fib[i]+" ");
		}
	}

}
