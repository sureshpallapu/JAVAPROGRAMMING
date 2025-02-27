package STRINGPROGRAMS.InBulitMethodsPrograms;

public class StringToCharArray {
    public static void main(String[] args) {
        String str = "Hello";
        char[] charArray = str.toCharArray();
        
        // Printing the character array
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
}
