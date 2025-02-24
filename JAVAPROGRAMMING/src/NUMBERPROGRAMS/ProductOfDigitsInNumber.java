package NUMBERPROGRAMS;

import java.util.Scanner;

public class ProductOfDigitsInNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = s.nextInt();
		int pro = 1;
		while (a > 0) {
			int temp = a % 10;
			a = a / 10;
			pro *= temp;
		}
		System.out.println(" product of digits of a number  : " + pro);
	}
}