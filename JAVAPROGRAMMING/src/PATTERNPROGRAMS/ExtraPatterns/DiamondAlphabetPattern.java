package PATTERNPROGRAMS.ExtraPatterns;

public class DiamondAlphabetPattern {
	
	    public static void main(String[] args) {
	        int n = 7; // Number of rows for the diamond
	        // Upper half
	        for (int i = 1; i <= n; i++) {
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            char ch = 'A';
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print(ch);
	                if (j < i) {
	                    ch++;
	                } else {
	                    ch--;
	                }
	            }
	            System.out.println();
	        }
	        // Lower half
	        for (int i = n - 1; i >= 1; i--) {
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            char ch = 'A';
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print(ch);
	                if (j < i) {
	                    ch++;
	                } else {
	                    ch--;
	                }
	            }
	            System.out.println();
	        }
	    }
	}


