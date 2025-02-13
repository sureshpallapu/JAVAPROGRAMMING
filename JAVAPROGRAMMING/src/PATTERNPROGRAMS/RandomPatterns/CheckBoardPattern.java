package PATTERNPROGRAMS.RandomPatterns;

import java.util.Scanner;

public class CheckBoardPattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt();
		 for (int i = 0; i < n; i++) {
		 for (int j = 0; j < n; j++) {
		 if ((i + j) % 2 == 0)
		 System.out.print("* ");
		 else
		 System.out.print(" ");
		 }
		 System.out.println();
}
	}
	
}
