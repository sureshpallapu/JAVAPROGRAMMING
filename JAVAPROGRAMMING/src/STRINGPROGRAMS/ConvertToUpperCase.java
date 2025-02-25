package STRINGPROGRAMS;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        String s = "JaVa";
        String s1 = "";
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] >= 97 && ch[i] <= 122) { // Check if the character is lowercase
                char upper = (char) (ch[i] - 32); // Convert to uppercase
                s1 = s1 + upper;
            } else {
                s1 = s1 + ch[i]; // Keep the character as is
            }
        }
        
        System.out.println("Converted to uppercase: " + s1);
    }
}

