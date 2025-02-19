package PATTERNPROGRAMS.Invertedtriangless;

import java.util.Scanner;

public class InvertedBinaryRow {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt();
		int a = 0;
		for (int i = 1; i <= n; i++) {
			// Column loop
			for (int j = i; j <= n; j++) {
				System.out.print((i % 2 == 1 ? 0 : 1) + " ");
			}
			System.out.println();
		}
	}
}
