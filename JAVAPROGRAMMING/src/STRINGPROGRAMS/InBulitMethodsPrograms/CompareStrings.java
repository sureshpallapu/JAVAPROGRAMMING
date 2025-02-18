package STRINGPROGRAMS.InBulitMethodsPrograms;

public class CompareStrings {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "Banana";
        String s3 = "Apple";

        // Comparing s1 and s2
        System.out.println(s1.compareTo(s2)); // Output: -1 (Apple < Banana)

        // Comparing s1 and s3
        System.out.println(s1.compareTo(s3)); // Output: 0 (Both are equal)

        // Comparing s2 and s1
        System.out.println(s2.compareTo(s1)); // Output: 1 (Banana > Apple)
    }
}
