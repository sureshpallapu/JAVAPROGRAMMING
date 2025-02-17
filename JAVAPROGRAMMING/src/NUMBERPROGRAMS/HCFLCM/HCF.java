package NUMBERPROGRAMS.HCFLCM;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = s.nextInt();
		int b = s.nextInt();

		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		System.out.println(" hcf  : " + a);

		// method 2-- reffered method

		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;

		}
		System.out.println(" hcf  : " + a);
	}
}
