package NUMBERPROGRAMS.NumberTypes;

import java.util.Scanner;

/*Strong number:
 *
	sum of digits is equals to the product of the number 
*/
public class StrongNumber {
	public static int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = s.nextInt();
		int sum = 0;
		int temp = num;
		while (num > 0) {
			int mod = num % 10;
			sum = sum + fact(mod);
			num /= 10;
		}
		if (temp == sum) {
			System.out.println(temp + " is a strong number");
		} else {
			System.out.println(temp + " is not a strong number");
		}
	}
}
