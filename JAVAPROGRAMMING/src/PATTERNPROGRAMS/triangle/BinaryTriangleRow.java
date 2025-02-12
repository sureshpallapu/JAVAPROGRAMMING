package PATTERNPROGRAMS.triangle;

import java.util.Scanner;

public class BinaryTriangleRow {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print(0 + " ");
				} else {
					System.out.print(1 + " ");
				}
			}
			System.out.println();
		}

	}
}
