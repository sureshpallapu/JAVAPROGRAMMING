package NUMBERPROGRAMS.EvenOdd;

import java.util.Scanner;

public class CountingTotalEvenAndOddNumbers {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the starting number ");
		int start = s.nextInt();
		System.out.println("enter the ending number ");
		int end = s.nextInt();
		int toteven = 0;
		int totodd = 0;
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
				toteven++;
			} else {
				System.out.println(i + " is odd");
				totodd++;
			}
		}
		System.out.println("Total even numbers between the range is " + toteven);
		System.out.println("Total odd numbers between the range is " + totodd);

	}
}
