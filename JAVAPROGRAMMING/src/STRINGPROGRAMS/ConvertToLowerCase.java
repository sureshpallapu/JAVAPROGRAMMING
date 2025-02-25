package STRINGPROGRAMS;

public class ConvertToLowerCase {
//	print each character in string 
	public static void main(String[] args) {
		String s = "JaVa";
		String s1 = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {

			if (ch[i] >= 65 && ch[i] <= 90) {
				char lower = (char) (ch[i] + 32);
				s1 = s1 + lower;
			} else {
				s1 = s1 + ch[i];
			}

		}
		System.out.println("coverting to lower case : " + s1);
//		

	}
}
