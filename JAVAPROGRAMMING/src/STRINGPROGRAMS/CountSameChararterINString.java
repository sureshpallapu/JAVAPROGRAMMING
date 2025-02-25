package STRINGPROGRAMS;

public class CountSameChararterINString {

	public static void main(String[] args) {

		String str = "aabbbcabba";
		char c = 'a';
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// Check if the character is an alphabet
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				} else {
					c++;
				}
			}
		}

	}
}
 