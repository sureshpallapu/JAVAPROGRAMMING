package STRINGPROGRAMS;

public class StringExampleAllMethods {

	public static void main(String[] args) {

		// 1. Creating Strings
		String str1 = "Hello World";
		String str2 = new String("Java Programming");

		// 2. String Length
		System.out.println("Length of str1: " + str1.length()); // Output: 11

		// 3. Concatenation
		String str3 = str1.concat(" - " + str2);
		System.out.println("Concatenated String: " + str3); // Output: Hello World - Java Programming

		// 4. Comparing Strings
		System.out.println("str1 equals str2: " + str1.equals(str2)); // Output: false
		System.out.println("str1 == str2: " + (str1 == str2)); // Output: false
		System.out.println("str1 compareTo str2: " + str1.compareTo(str2)); // Output: -1

		// 5. Changing Case
		System.out.println("Uppercase str1: " + str1.toUpperCase()); // Output: HELLO WORLD
		System.out.println("Lowercase str2: " + str2.toLowerCase()); // Output: java programming

		// 6. Substring
		System.out.println("Substring of str1 (from index 6): " + str1.substring(6)); // Output: World
		System.out.println("Substring of str2 (from index 5 to 15): " + str2.substring(5, 15)); // Output: Programming

		// 7. Character at a Specific Index
		System.out.println("Character at index 6 in str1: " + str1.charAt(6)); // Output: W

		// 8. Finding Index of a Character
		System.out.println("Index of 'o' in str1: " + str1.indexOf('o')); // Output: 4
		System.out.println("Index of 'Java' in str2: " + str2.indexOf("Java")); // Output: 0

		// 9. Checking if String Contains Substring
		System.out.println("str2 contains 'Java': " + str2.contains("Java")); // Output: true

		// 10. Replacing Characters
		String str4 = str2.replace("Java", "Python");
		System.out.println("Replaced String: " + str4); // Output: Python Programming

		// 11. Removing Whitespace
		String str5 = "  Hello Java  ";
		System.out.println("Trimmed str5: " + str5.trim()); // Output: Hello Java

		// 12. Splitting a String into an Array
		String str6 = "apple,banana,grape";
		String[] fruits = str6.split(",");
		System.out.println("Fruits:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		// Output:
		// apple
		// banana
		// grape

		// 13. String Formatting
		String formattedString = String.format("Hello %s, welcome to %s.", "Alice", "Java");
		System.out.println("Formatted String: " + formattedString); // Output: Hello Alice, welcome to Java.

		// 14. String Conversion (from Integer)
		int number = 123;
		String numStr = String.valueOf(number);
		System.out.println("Converted Integer to String: " + numStr); // Output: 123

		// 15. String Conversion (from Char Array)
		char[] charArray = { 'J', 'a', 'v', 'a' };
		String charArrayToStr = new String(charArray);
		System.out.println("Char Array to String: " + charArrayToStr); // Output: Java

		// 16. String startsWith() and endsWith()
		System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello")); // Output: true
		System.out.println("str2 ends with 'Programming': " + str2.endsWith("Programming")); // Output: true

		// 17. String isEmpty()
		String str7 = "";
		System.out.println("str7 is empty: " + str7.isEmpty()); // Output: true

		// 18. String matches() (Pattern Matching)
		String str8 = "2025";
		System.out.println("str8 matches numeric pattern: " + str8.matches("\\d+")); // Output: true

		// 19. String valueOf() (with boolean)
		boolean flag = true;
		System.out.println("Boolean to String: " + String.valueOf(flag)); // Output: true

		// 20. StringBuilder reverse()
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("Reversed string: " + sb.reverse()); // Output: avaJ

		// 21. String contains() with Case Sensitivity
		System.out.println("str1 contains 'hello' (case-sensitive): " + str1.contains("hello")); // Output: false
		System.out.println("str1 contains 'Hello' (case-sensitive): " + str1.contains("Hello")); // Output: true

		// 22. String replaceAll() (using Regular Expressions)
		String str9 = "The rain in Spain stays mainly in the plain.";
		System.out.println("Replace all 'in' with 'on': " + str9.replaceAll("in", "on")); // Output: The raon on Spaon
																							// stays maonly on the
																							// plaon.

		// 23. String replaceFirst() (only first occurrence)
		System.out.println("Replace first 'in' with 'on': " + str9.replaceFirst("in", "on")); // Output: The raon in
																								// Spain stays mainly in
																								// the plain.

		// 24. String lastIndexOf() (find last occurrence of character)
		System.out.println("Last index of 'i' in str9: " + str9.lastIndexOf('i')); // Output: 34

	}

}
