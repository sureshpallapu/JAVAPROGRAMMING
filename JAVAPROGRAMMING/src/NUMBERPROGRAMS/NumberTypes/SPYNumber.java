package NUMBERPROGRAMS.NumberTypes;

import java.util.Scanner;

public class SPYNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = s.nextInt();
		int b=a;
		int sum = 0;
		int pro = 1;
		while (a > 0) {
			int temp = a % 10;
			a = a / 10;
			sum += temp;
			pro*=temp;
		}
		if (sum == pro) {
			System.out.println(b + " is a SPY Number");
		} else {
			System.out.println(b + " is not  a SPY Number");
		}
	}
}
