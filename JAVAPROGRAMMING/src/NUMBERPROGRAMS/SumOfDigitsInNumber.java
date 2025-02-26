package NUMBERPROGRAMS;

import java.util.Scanner;

public class SumOfDigitsInNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = s.nextInt();
		int sum = 0;
		while (a > 0) {
			int temp = a % 10;
			a = a / 10;
			sum += temp;
		}
		System.out.println(" Sum of digits of a number  : " + sum);
	}
}
