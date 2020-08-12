package programs;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 1st num");
		int a = in.nextInt();
		System.out.println("Enter the 2nd num");
		int b = in.nextInt();
		System.out.println("before swapping a="+a+" and b= "+b);
		int x = a;
		a = b;
		b = x; 
		System.out.println("After swapping a="+a+" and b= "+b);
	
	}

}
