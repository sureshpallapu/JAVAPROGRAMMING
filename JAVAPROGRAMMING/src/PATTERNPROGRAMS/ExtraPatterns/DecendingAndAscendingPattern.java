package PATTERNPROGRAMS.ExtraPatterns;

public class DecendingAndAscendingPattern {
	
	    public static void main(String[] args) {
	        int n = 7; // Number of rows
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n - i + 1; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	        for (int i = 2; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }
	}

