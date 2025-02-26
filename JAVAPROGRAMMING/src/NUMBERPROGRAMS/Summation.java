package NUMBERPROGRAMS;


import java.util.Scanner;

public class Summation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the starting number ");
		int start = s.nextInt();
		System.out.println("enter the ending number ");
		int end = s.nextInt();
		double sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
}
