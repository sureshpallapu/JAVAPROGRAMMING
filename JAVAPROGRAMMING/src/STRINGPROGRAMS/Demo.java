package STRINGPROGRAMS;

public class Demo {
	public static void main(String[] args) {

		String str = "aabbbcabba";
         char c='a';
		str = str.toLowerCase();
		int target=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
					if (c==ch) {
						target++;
					}
				} 		
		System.out.println("Number of repeated chareacter "+c+": " + target);

	}
	
}