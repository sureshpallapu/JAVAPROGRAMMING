package NUMBERPROGRAMS;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of digits u want");
		int n = s.nextInt();
		int a = 0;
		int b = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}

	}
}
