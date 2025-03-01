package NUMBERPROGRAMS;

import java.util.Scanner;

public class squarenumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = s.nextInt();
		int square = 0;
		
		for (int i = 1; i <=a; i++) {
		 square+=a;
		}
		System.out.println("square of a number is :"+square);
	}
}
