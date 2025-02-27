package STRINGPROGRAMS;

public class StringReverse {
	public static void main(String[] args) {
		
//		preffered method
		String s = "java";		
//		String s1 = s;		
		
		System.out.println(s);
		String rev = "";
		String rev1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		System.out.println("After Reverse a String : " + rev);

//		method 2
		for (int i = 0; i < s.length(); i++) {

			rev1 = s.charAt(i) + rev1;
		}
		System.out.println("reverse the string:" + rev1);
		
	}
}
