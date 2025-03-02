package PATTERNPROGRAMS.ExtraPatterns;

public class RightAsAndDeAlphaPattern {
	

		public static void main(String[] args) {
			int input=5;
			for (int i = 1; i <= input; i++) {
				char c=65;
				for (int j = 1; j <= input - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(c++ );
				}System.out.println();
			}
			for(int i=1;i<=input;i++) {
				char c=65;
				for(int j=1;j<=i;j++) {
					System.out.print(" ");
				}for(int j=1;j<=input-i;j++) {
					System.out.print(c++ );
				}
				System.out.println();
		

	}
	}
}
