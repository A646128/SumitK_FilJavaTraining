package programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = in.nextInt();
		for (int i=num-1; i>0; i--)
		{
			num=num*i;
		}
		System.out.println(num);
	}

}
