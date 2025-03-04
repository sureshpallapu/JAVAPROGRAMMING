package STRINGPROGRAMS;

public class RearrangeWords {
public static void main(String[] args) {
	 String str="ram and raja are studying btech";
	String[] words = str.split("\\s+");
     String result = "";
     
     for (String word : words) {
    	 int length=word.length();
    	 int middle =length/2;
    	 result+=" "+word.replace(word.charAt(middle),word.charAt(0));
     }
     System.out.println(result);
     }
}
