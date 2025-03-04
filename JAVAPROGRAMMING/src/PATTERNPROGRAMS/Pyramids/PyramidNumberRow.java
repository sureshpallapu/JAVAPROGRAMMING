package PATTERNPROGRAMS.Pyramids;

import java.util.Scanner;

public class PyramidNumberRow {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int k = i; k <= n; k++) {// de
				System.out.print(" ");
			}
			for (int l = 1; l <= i; l++) {// in
				System.out.print(i + " ");

			}
			for (int j = 1; j < i; j++) {// in
				System.out.print(i + " ");

			}
			System.out.println();

		}

	}
}
