package STRINGPROGRAMS;

public class LongestWordInString {
	public static void main(String[] args) {
		String s = " suresh and guna are best friends";
		String[] str = s.split("\\s+");
		String longestword = str[0];
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > longestword.length()) {

				longestword = str[i];
			}
		}
		System.out.println("  the longest word in the sentence is : " + longestword);
	}
}
