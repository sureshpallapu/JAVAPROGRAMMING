package PATTERNPROGRAMS.triangle;

import java.util.Scanner;

public class BinaryTriangle {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt();
		int a = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a + " ");
				if (a == 0) {
					a++;
				} else {
					a--;

				}
			}
			System.out.println();
		}

	}

}
