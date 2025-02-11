package PATTERNPROGRAMS.square;

public class BinarySquareRowstart0 {
	public static void main(String[] args) {
		int n = 5;
		System.out.println("Binary Pattern:");
		for (int i = 1; i <= n; i++) {
			int num = (i % 2 == 0) ? 1 : 0;
			for (int j = 1; j <= n; j++) {
				System.out.print(num + " ");
			}
			System.out.println();

		}
	}
}
