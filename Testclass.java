import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Testclass {

	public static void main(String args[])
	{ 
		String str="Hello world";
		//String[] str2 =str.split(" ");
		
	       
	        int[] charCount = new int[128];

	        // Counting characters in the string (case insensitive)
	        for (int i = 0; i < str.length(); i++) {
	            char c = Character.toLowerCase(str.charAt(i));
	            charCount[c]++;
	        }

	        // Printing character counts
	        for (int i = 0; i < charCount.length; i++) {
	            if (charCount[i] > 0) {
	                System.out.println("Character: " + (char) i + ", Count: " + charCount[i]);
	            }
	        }
	    }
}



