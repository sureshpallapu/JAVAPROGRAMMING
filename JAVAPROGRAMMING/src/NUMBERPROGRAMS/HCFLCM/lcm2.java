package NUMBERPROGRAMS.HCFLCM;

import java.util.Scanner;

public class lcm2 {
	public static void main(String[] args) {

		// method 2
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = s.nextInt();
		int b = s.nextInt();

		int max = a > b ? a : b;
		int lcmm = max;
		while (true) {
			if (lcmm % a == 0 && lcmm % b == 0) {
				break;
			}
			lcmm += max;

		}
		System.out.println(" lem of second method : " + lcmm);
	}
}
