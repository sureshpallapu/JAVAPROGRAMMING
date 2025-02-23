package NUMBERPROGRAMS.NumberTypes;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = s.nextInt();
		 
        int temp = a;  // Store the original number
        int reverse = 0; // Variable to store the reversed number

        while (a > 0) {
            int digit = a % 10;  // Extract the last digit
            reverse = reverse * 10 + digit; // Build the reversed number
            a = a / 10;  // Remove the last digit
        }

        // Check if the original number is the same as the reversed number
        if (temp == reverse) {
            System.out.println(temp + " is a palindrome.");
        } else {
            System.out.println(temp + " is not a palindrome.");
        }
	}
}
