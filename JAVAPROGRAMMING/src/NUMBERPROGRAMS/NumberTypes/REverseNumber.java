package NUMBERPROGRAMS.NumberTypes;

import java.util.Scanner;

public class REverseNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = s.nextInt();
		int rev = 0;
		while (a > 0) {
			int temp = a % 10;  
			a = a / 10;
			rev = rev * 10 + temp;
		}
		System.out.println(" number reverse : " + rev);
	}
}
