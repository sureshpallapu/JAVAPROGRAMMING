package PATTERNPROGRAMS.ExtraPatterns;

public class AssendeingAndDescendingNumberPattern {
	
	    public static void main(String[] args) {
	        int n = 7; // Number of rows
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	        for (int i = n - 1; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }
	}


