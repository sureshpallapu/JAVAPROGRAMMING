package STRINGPROGRAMS;

public class Anagramcheck {
	public static void main(String[] args) {
		String s = "cat".replaceAll("\\s", "").toLowerCase();
		String s1 = "acmt".replaceAll("\\s", "").toLowerCase();
		int[] count = new int[256];
		if (s.length() != s1.length()) {
			System.out.println("not an anagaram");
			return;
		}
		for (int c : s.toCharArray()) {
			count[c]++;
		}
		for (int c : s1.toCharArray()) {
			count[c]--;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] == 0) {
				System.out.println("is  aanagaram");
				return;
			}
		}
		System.out.println("is not a anagaram");
	}
}
