package STRINGPROGRAMS;

public class charAtex {
   
	public static void main(String[] args) {
    // print each character in string 
		String s = "java";
		int l = 0;
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		// method 2
		char[] c=s.toCharArray();
		for (char d : c) {
			System.out.println(d);
			l++;
		}
		System.out.println("length of the string : "+l);
	}

}
