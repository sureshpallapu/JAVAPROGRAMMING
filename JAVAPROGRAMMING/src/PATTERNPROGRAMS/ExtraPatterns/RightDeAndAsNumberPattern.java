package PATTERNPROGRAMS.ExtraPatterns;

public class RightDeAndAsNumberPattern {
	
		public static void main(String[] args) {
			int row =5;
			for (int i = 1; i <= row; i++) {
				int k=1;
				for (int j = 1; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = i; j <=row; j++) {
					System.out.print(k++);
				}
				System.out.println();
				
			}
			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= row-i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}

		
	}
}
