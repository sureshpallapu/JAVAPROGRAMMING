package STRINGPROGRAMS;

public class CovertInToggleCase {
	public static void main(String[] args) {
		String s = "JaVa";
		String s1 = "";
		char[] ch = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (ch[i] >= 97 && ch[i] <= 122) { // Check if the character is lower  case
				char upper = (char) (ch[i] - 32); // Convert to upper case
				s1 = s1 + upper;
			} else {
				char lower = (char) (ch[i] + 32); // Convert to lower case
				s1 = s1 + lower;
			}
		}

		System.out.println("Converted to uppercase: " + s1);
	}
}
