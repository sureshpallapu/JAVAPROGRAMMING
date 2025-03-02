package PATTERNPROGRAMS.ExtraPatterns;

public class RightAsAndDeNumberPattern {
	

		public static void main(String[] args) {
			int input=5;
			for (int i = 1; i <= input; i++) {
				int a=1;
				for (int j = 1; j <= input - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(a++ );
				}System.out.println();
			}
			for(int i=1;i<=input;i++) {
				int a=1;
				for(int j=1;j<=i;j++) {
					System.out.print(" ");
				}for(int j=1;j<=input-i;j++) {
					System.out.print(a++ );
				}
				System.out.println();
			}

		

	}
}
