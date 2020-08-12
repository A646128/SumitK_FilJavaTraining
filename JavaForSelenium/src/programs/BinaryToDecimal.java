package programs;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Binary Number:");
		int n=s.nextInt();
		int decimal=0;
		int p =0;
		while(n!=0)
		{
			decimal+=((n%10)*Math.pow(2, p));
			n=n/10;
			p++;
		}
		System.out.println("Decimal No is:" + decimal);
	}

}
