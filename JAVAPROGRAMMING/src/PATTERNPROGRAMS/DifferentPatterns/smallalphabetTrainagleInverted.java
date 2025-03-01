package PATTERNPROGRAMS.DifferentPatterns;

import java.util.Scanner;

public class smallalphabetTrainagleInverted {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number u want");
		int n;
		n=s.nextInt();
		char a='a';
		for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++) {
			System.out.print(a+" ");
			a++;
		}
		
		System.out.println();
		}
		System.out.println("enter the number u want");
		int m;
		n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			char b='a';
		for(int j=i;j<=n;j++) {
			System.out.print(b+" ");
			b++;
		}
		
		System.out.println();
		}
		System.out.println("enter the number u want");
		int o;
		o=s.nextInt();
		char c='a';
		for(int i=1;i<=o;i++) {
			
		for(int j=i;j<=n;j++) {
			System.out.print(c+" ");
		
		}
		c++;
		System.out.println();
		}
	}
}
