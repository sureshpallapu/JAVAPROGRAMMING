package NUMBERPROGRAMS.Swapping;

import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first number ");
		int a = s.nextInt();
		System.out.println("a= " + a);
		System.out.println("enter the second number ");
		int b = s.nextInt();
		System.out.println("b= " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("after Swapping using temp variable ");
		System.out.println(" a= " + a);
		System.out.println("b= " + b);

		// mathod 2

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after Swapping without using temp variable by + and - ");
		System.out.println(" a= " + a);
		System.out.println("b= " + b);
		
		//method 3
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("after Swapping without using temp variable by * and /");
		System.out.println(" a= " + a);
		System.out.println("b= " + b);
		
		
		
	}
}
