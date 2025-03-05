package PATTERNPROGRAMS;

import java.util.Scanner;

public class numdemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int l = 1; l < i; l++) {// de
				System.out.print(" ");
			}
			int l=(2*n)-(2*i-1);
			for (int k = 1; k <= l; k++) {// in
				if(k==1||k==l||i==1)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}

			System.out.println();

		}
	

	} 
}
