package NUMBERPROGRAMS.EvenOdd;

import java.util.Scanner;

public class EvenorOdd2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int i = s.nextInt();
		if (i % 2 == 0) {
			System.out.println(i + " is even number ");
		} else {
			System.out.println(i + " is odd number ");
		}
		// method 2

		String r = (i % 2 == 0) ? i+"  is even number " : i+  " is odd number ";
		System.out.println(r);
		
		// method 3
		String[] res= {"is even number "," is  odd number"};
		System.out.println(i+" "+res[i%2]);
	}
}