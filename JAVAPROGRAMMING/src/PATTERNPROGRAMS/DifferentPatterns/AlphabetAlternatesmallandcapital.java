package PATTERNPROGRAMS.DifferentPatterns;

import java.util.Scanner;

public class AlphabetAlternatesmallandcapital {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			char a = 'A';
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print(Character.toLowerCase(a) + " ");
				} else {
					System.out.print(a + " ");
				}
				a++;
			}
			System.out.println();
		}
	}
}
