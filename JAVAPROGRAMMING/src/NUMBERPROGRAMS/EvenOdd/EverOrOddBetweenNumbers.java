package NUMBERPROGRAMS.EvenOdd;

import java.util.Scanner;

public class EverOrOddBetweenNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the starting number ");
		int start = s.nextInt();
		System.out.println("enter the ending number ");
		int end = s.nextInt();
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");

			} else {
				System.out.println(i + " is odd");
			}
		}

	}

}
