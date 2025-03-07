package PATTERNPROGRAMS;

import java.util.Scanner;

public class exaam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int num;
		num = s.nextInt();
		for (int i = 1; i <= num; i++) {
			int n = 1;
			for (int l = i; l < num; l++) {// de
				System.out.print(" "+" ");
			}
			int l = 2 * i - 1;
			for (int k = 1; k <= l; k++) {// in
				int mid = l / 2;
				if (k <= mid) {
					System.out.print(n+ " ");
					n++;
				} else {

					System.out.print(n+ " ");
					n--;
				}
			}

			System.out.println();

		}
		for (int i = 1; i <= num; i++) {
			int n = 1;
			for (int l = 2; l <i; l++) {// de
				System.out.print(" "+" ");
			}
			int l = 2 * i - 1;
			for (int k = i; k <= l; k++) {// in
				int mid = l / 2;
				if (k <= mid) {
					System.out.print(n+ " ");
					n++;
				} else {

					System.out.print(n+ " ");
					n--;
				}
			}

			System.out.println();

		}

	}
}
