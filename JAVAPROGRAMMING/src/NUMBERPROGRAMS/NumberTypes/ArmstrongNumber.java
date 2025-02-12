package NUMBERPROGRAMS.NumberTypes;

import java.util.Scanner;

public class ArmstrongNumber {

	public static int countdigits(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;

		}
		return count;

	}

	public static int power(int base, int exponent) {
		int prod = 1;
		for (int i = 0; i < exponent; i++) {
			prod = prod * base;
		}
		return prod;
	}

	public static boolean isArmstrong(int num) {
		int exponent = countdigits(num);
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int mod = num % 10;
			sum = sum + power(mod, exponent);
			
			num = num / 10;
		}
		if (temp == sum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a number");
           int number=sc.nextInt();
           boolean result=isArmstrong(number);
           if(result) {
        	   System.out.println(number+ "is Armstrong");
           }
           else {
        	   System.out.println(number+"not ArmStrong");
           }

	}
}
