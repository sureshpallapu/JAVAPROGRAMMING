package STRINGPROGRAMS;

public class StringSentenceReverse {
	

		public static void main(String[] args) {
			//avaj si nuf
			String s = "java is fun";
			String[] str = s.split(" ");
			String rev = "";
			for (int i=s.length()-1;i>=0;i--) {
				rev=rev+s.charAt(i); 
				
			}
//			for (int i = str.length - 1; i >= 0; i--) {
//				rev = rev + str[i] + " ";
//			}
			System.out.println(rev);
		}

	}
