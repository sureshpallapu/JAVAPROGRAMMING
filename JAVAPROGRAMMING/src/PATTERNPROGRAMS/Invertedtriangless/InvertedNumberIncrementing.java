package PATTERNPROGRAMS.Invertedtriangless;

import java.util.Scanner;

public class InvertedNumberIncrementing {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt();
		int a = 1;
		for (int i = 1; i <= n; i++) {
			for (int k = i; k <= n; k++) {
				System.out.print(a + "   ");
				a++;
			}
			System.out.println();
		}
	}

}
