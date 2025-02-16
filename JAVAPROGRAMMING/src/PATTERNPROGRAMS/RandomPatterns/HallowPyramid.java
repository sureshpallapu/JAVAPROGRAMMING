package PATTERNPROGRAMS.RandomPatterns;

import java.util.Scanner;

public class HallowPyramid {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt();
	
	for (int i = 1; i <= n; i++) {
		 for (int j = n - i; j > 0; j--)
		 System.out.print(" ");
		 for (int j = 1; j <= 2 * i - 1; j++) {
		 if (j == 1 || j == 2 * i - 1 || i == n)
		 System.out.print("*");
		 else
		 System.out.print(" ");
		 }
		 System.out.println();
}
}
	
}