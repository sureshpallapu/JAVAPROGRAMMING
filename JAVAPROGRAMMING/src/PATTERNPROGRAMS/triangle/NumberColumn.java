package PATTERNPROGRAMS.triangle;

import java.util.Scanner;

public class NumberColumn {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			int a = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				a++;
			}  
			System.out.println();
		}
	}

}
