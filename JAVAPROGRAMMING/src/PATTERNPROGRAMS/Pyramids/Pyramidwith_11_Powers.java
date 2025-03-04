package PATTERNPROGRAMS.Pyramids;

import java.util.Scanner;

public class Pyramidwith_11_Powers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt();
	   for (int i = 1; i <= n; i++) {
		for (int k = i; k <= n; k++) {//de
			System.out.print(" ");
		}
			for (int l = 1; l <= i; l++) {//in
				System.out.print(l+" ");
			}
			for (int j = i-1; j >= 1; j--) {//in
				System.out.print(j+" ");
			}		
			System.out.println();

		}

	}
}
