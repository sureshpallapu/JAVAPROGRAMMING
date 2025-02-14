package PATTERNPROGRAMS.DifferentPatterns;

import java.util.Scanner;

public class DiamondFor11_power {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt(); // Number of rows
		// Upper part
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			int num = 1;
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print(num);
				if (j < i) {
					num++;
				} else {
					num--;
				}
			}
			System.out.println();
		}
		// Lower part
		for (int i = n - 1; i >= 1; i--) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			int num = 1;
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print(num);
				if (j < i) {
					num++;
				} else {
					num--;
				}
			}
			System.out.println();
		}
	}
}
