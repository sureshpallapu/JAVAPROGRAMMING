package PATTERNPROGRAMS;

import java.util.Scanner;

public class PatternProgram2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int num = s.nextInt();
		s.close();

		// Upper pyramid
		for (int i = 1; i <= num; i++) {
			int n = 1;
			// Print leading spaces
			for (int l = i; l < num; l++) {
				System.out.print("  "); // Double space
			}
			// Print increasing and decreasing numbers
			int l = 2 * i - 1;
			for (int k = 1; k <= l; k++) {
				int mid = l / 2;
				if (k <= mid) {
					System.out.print(n + " ");
					n++;
				} else {
					System.out.print(n + " ");
					n--;
				} 
			}
			System.out.println();
		}

		// Lower inverted pyramid
		for (int i = num-1   ; i >= 1; i--) {
			int n = 1;

			for (int l = i; l < num; l++) {
				System.out.print("  "); // Double space
			}
			// Print increasing and decreasing numbers
			int l = 2 * i - 1;
			for (int k = 1; k <= l; k++) {
				int mid = l / 2;
				if (k <= mid) {
					System.out.print(n + " ");
					n++;
				} else {
					System.out.print(n + " ");
					n--;
				}
			}
			System.out.println();
		}
	}
}
