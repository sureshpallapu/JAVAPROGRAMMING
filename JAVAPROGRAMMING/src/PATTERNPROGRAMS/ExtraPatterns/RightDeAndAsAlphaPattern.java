package PATTERNPROGRAMS.ExtraPatterns;

public class RightDeAndAsAlphaPattern {


		public static void main(String[] args) {
			int row =5;
			for (int i = 1; i <= row; i++) {
				char c=65;
				for (int j = 1; j < i; j++) {
					System.out.print(" ");
				}
				for (int j = i; j <=row; j++) {
					System.out.print(c++ );
				}
				System.out.println();
				
			}
			for (int i = 1; i <= row; i++) {
				char c=65;
				for (int j = 1; j <= row-i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <=i; j++) {
					System.out.print(c++ );
				}
				System.out.println();
			}
		}

	}

