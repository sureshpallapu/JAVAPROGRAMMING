package STRINGPROGRAMS;

public class StringSentence_wordsReverse {
	
		public static void main(String[] args) {
			// reverse of words
			String s = "java is fun";
			String[] str = s.split(" ");
			String rev = "";
			for (int i = str.length - 1; i >= 0; i--) {
				rev = rev + str[i] + " ";
			}
			System.out.println(rev);
		}

	}

