package NUMBERPROGRAMS;

import java.util.Scanner;

public class FactorialOfNumber {
	public static int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = s.nextInt();
		int sum = 0;
		while (num > 0) {
			int mod = num % 10;
			sum = sum + fact(mod);
			num /= 10;
		}
		System.out.println(" factorial of a number "+sum);
	}
	
}
