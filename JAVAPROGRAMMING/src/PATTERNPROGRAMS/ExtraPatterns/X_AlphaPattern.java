package PATTERNPROGRAMS.ExtraPatterns;

public class X_AlphaPattern {
	

		public static void main(String[] args) {
			int n = 5; 
	        for (int i = n; i >= 1; i--) {
	        	char a=65;
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print(a++ + " ");
	            }
	            System.out.println();
	        }
	        for (int i = 2; i <= n; i++) {
	        	char a=65;
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print(a++ + " ");
	            }
	            System.out.println();
	        }


		

	}
}
