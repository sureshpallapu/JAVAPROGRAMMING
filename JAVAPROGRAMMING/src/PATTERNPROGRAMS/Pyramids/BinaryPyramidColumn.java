package PATTERNPROGRAMS.Pyramids;

public class BinaryPyramidColumn {
	public static void main(String[] args) {
		
	
	 int rows = 5;
	   for (int i = 1; i <= rows; i++) {
	   for (int j = i; j <= rows; j++) {
	   System.out.print(" ");
	   }
	   for (int k = 1; k <= i; k++) {
	   System.out.print(k % 2 + " ");
	   }
	   for (int l = i - 1; l >= 1; l--) {
	   System.out.print(l % 2 + " ");
	   }
	   System.out.println();
	}
}

}
