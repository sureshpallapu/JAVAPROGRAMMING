package PATTERNPROGRAMS.ExtraPatterns;

public class DecendingAndAscendingStarPattern {
	

		public static void main(String[] args) {
			int a = 6;
			for (int i = 1; i <= a; i++) {
				for (int j = i; j <= a; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i = 1; i <= a; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}
	}

