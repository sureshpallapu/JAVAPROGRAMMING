package PATTERNPROGRAMS.triangle;

import java.util.Scanner;

public class BinaryTriangleColumn {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt();
		int a = 0;
		for (int i = 1; i <= n; i++) {
		 // Column loop
		 for (int j = 1; j <= i; j++) {
		 System.out.print((j % 2 == 1 ? 0 : 1) + " ");
		 }
		 System.out.println(); 
		 }
}
}
