package STRINGPROGRAMS;

public class RemoveDuplicatesInString {
	public static void main(String[] args) {
		String s = "Programming";
		String s1 = s.toLowerCase();
		String result = "";
		boolean[] seen = new boolean[256]; // ASCII character set
		for (char c : s1.toCharArray()) {
			if (!seen[c]) {
				result += c;
				seen[c] = true;
			}
		}
		System.out.println(result);
	}
}
