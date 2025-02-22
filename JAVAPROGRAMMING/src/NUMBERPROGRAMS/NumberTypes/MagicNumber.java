package NUMBERPROGRAMS.NumberTypes;

import java.util.Scanner;

public class MagicNumber {
	public static int digitSum(int num) {
		int sum = 0;
		while (num > 0) {
			int temp = num % 10;
			num = num / 10;
			sum += temp;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = s.nextInt();
		int b=num;
		while (num > 9) {				
			num=digitSum(num) ;	
		}
        if(num==1) {
     	   System.out.println(b+ " is a magic number ");
        } 
        else {
     	   System.out.println(b+" is not a magic number");
        }

	}
}
