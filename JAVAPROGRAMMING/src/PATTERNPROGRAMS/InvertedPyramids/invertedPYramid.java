package PATTERNPROGRAMS.InvertedPyramids;

import java.util.Scanner;

public class invertedPYramid {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int l = 1; l <= i; l++) {//in
				System.out.print(" ");
			}
			for (int m = i; m <= n; m++) {//de
				System.out.print("*");
			}
			for (int k = i; k < n; k++) {//de
				System.out.print("*");
			}
			
			
			System.out.println();

		}

	}
}
