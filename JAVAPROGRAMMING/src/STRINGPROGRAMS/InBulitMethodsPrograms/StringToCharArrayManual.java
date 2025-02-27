package STRINGPROGRAMS.InBulitMethodsPrograms;

public class StringToCharArrayManual {
    public static void main(String[] args) {
        String str = "World";
        char[] charArray = new char[str.length()];

        // Copy characters one by one
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }

        // Printing the character array
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
}
