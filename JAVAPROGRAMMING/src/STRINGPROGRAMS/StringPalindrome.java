package STRINGPROGRAMS;

public class StringPalindrome {
	public static void main(String[] args) {

		String s = "madam";
		String s1 = s;
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		if (s.equalsIgnoreCase(rev)) {
			System.out.println(s1 + " is a palindrome ");
		} else {
			System.out.println(s1 + " is not a palindrome ");
		}
		
//		
		System.out.println(s.hashCode());
		System.out.println(s.getClass());
		
	}
}
