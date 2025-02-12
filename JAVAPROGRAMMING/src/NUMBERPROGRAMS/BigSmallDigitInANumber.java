package NUMBERPROGRAMS;

import java.util.Scanner;

public class BigSmallDigitInANumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = s.nextInt();
		int small=9,big=0;
		int temp;
		while (num>0) {
			temp = num % 10;  
			num /= 10;
			if(temp< small) {
				System.out.println(temp+" is a big digit");
				
			}
			if(temp>big) {
				System.out.println(temp+" is a small digit");
				break;
			}
			
			
		}
			
	}
}

