package PATTERNPROGRAMS.square;

public class BinnarySquarePattern {
	public static void main(String[] args) {
		 int n = 5; 
		 int num = 0; 
		System.out.println("Binary Pattern:");
		 for (int i = 1; i <= n; i++) { 
		 for (int j = 1; j <= n; j++) { 
		 System.out.print(num + " "); 
		 num = 1- num; 
		 
		}
		 System.out.println(); 
		 
		}

	}
}
