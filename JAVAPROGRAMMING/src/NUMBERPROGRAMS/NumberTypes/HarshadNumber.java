package NUMBERPROGRAMS.NumberTypes;

import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = s.nextInt();
		int b=num;
		int sum = 0;
		while (num > 0) {
			int temp = num % 10;
			num = num / 10;
			sum += temp;
		}
		if (b % sum == 0) {
			System.out.println(b + " is a harshad number ");
		} else {
			System.out.println(b + " is not  a harshad number ");
		}
	}
}
