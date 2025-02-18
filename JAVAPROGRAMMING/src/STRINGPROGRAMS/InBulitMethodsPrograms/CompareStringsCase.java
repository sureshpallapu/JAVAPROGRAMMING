package STRINGPROGRAMS.InBulitMethodsPrograms;

import java.util.Comparator;

public class CompareStringsCase {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "Applf";

        System.out.println(s1.compareTo(s2)); // Output: 32 (because 'a' > 'A' in ASCII)
        
    }
}
