package PATTERNPROGRAMS.Pyramids;

import java.util.Scanner;

public class PyramidAlphabets {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt();
		char a='A';
	   for (int i = 1; i <= n; i++) {
		for (int k = i; k <= n; k++) {//de
			System.out.print(" ");
		}
			for (int l = 1; l <= i; l++) {//in
				System.out.print((char)('A'+l-1)+" ");
				
			}
			for (int j = i-1; j >= 1; j--) {//in
				System.out.print((char)('A'+j-1)+" ");
				
			}		
			System.out.println();

		}

	}

}
