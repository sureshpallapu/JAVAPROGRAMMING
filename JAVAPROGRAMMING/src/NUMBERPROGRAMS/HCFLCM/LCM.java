package NUMBERPROGRAMS.HCFLCM;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = s.nextInt();
		int b = s.nextInt();
		int tem = a * b;
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;

		}
		System.out.println(" hcf  : " + a);

		int lcm = tem / a;
		System.out.println(" lcm  :" + lcm);

		
	}
}
