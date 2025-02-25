package STRINGPROGRAMS;

public class CharacterFrequencyCount {
	public static void main(String[] args) {
		String s="aaabbc";
		System.out.println(s);
		int[] frequency = new int[256]; // ASCII character set
		// Count frequency of each character
        for (char c : s.toCharArray()) {
            frequency[c]++;
        }
     // Print character frequencies
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] >  0) {
                System.out.print((char) i + "" + frequency[i]);
            }
        }
	
	
	
	
	}
}
