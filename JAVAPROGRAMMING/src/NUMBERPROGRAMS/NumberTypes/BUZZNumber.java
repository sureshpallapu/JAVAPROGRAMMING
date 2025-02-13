package NUMBERPROGRAMS.NumberTypes;

import java.util.Scanner;

public class BUZZNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = s.nextInt(); 
		if (num % 10 == 0 || num % 7 ==0 ) {
			System.out.println(num + " is a buzznumber");
		} else {
			System.out.println(num + " is not a buzznumber");
		}
	}
}
