package PATTERNPROGRAMS.Pyramids;

public class BinaryPyramidRow {
	public static void main(String[] args) {
		 int rows = 5;
		 for (int i = 1; i <= rows; i++) {
		 for (int j = i; j <= rows; j++) {
		 System.out.print(" ");
		 
		}
		 int value = (i % 2 == 0) ? 0 : 1;
		 for (int k = 1; k <= i; k++) {
		 System.out.print(value + " ");
		 
		}
		 for (int l = i 
		- 1; l >= 1; l--) {
		 System.out.print(value + " ");
		 
		}
		 System.out.println();
		 }
	}
	
}
