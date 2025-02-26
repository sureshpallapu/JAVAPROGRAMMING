package STRINGPROGRAMS;

public class VowelConsonantCounter {
	public static void main(String[] args) {
		String str = "Java Programming";
		  
		str = str.toLowerCase();
		int vowels = 0, consonants = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			// Check if the character is an alphabet
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("Number of Vowels: " + vowels);
		System.out.println("Number of Consonants: " + consonants);
	}

}
