package PATTERNPROGRAMS.InvertedPyramids;

import java.util.Scanner;

public class invertedPYramid {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt();
//		upper pyramid
		for (int i = 1; i <= n; i++) {
			int k = 1;
			for (int j = 1; j <= i; j++) {// in
				System.out.print(" ");
			}
			for (int m  = i; m <= n; m++) {// de
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
//      lower pyramid 
		for (int i = 2; i <= n; i++) {
			int a = 1;
			for (int k = i; k <= n; k++) {// de
				System.out.print(" ");
			}
			for (int l = 1; l <= i; l++) {// in
				System.out.print(a++ + " ");

			}

			System.out.println();

		}

	}
}
