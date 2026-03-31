import java.util.HashSet;
import java.util.Set;

import javax.lang.model.element.Element;

import java.util.HashSet;
import java.util.Set;

public class SameStartingEndingLetters {
  
	 public static void main(String[] args) {
	        String[] str = new String[]{"Alpha", "Beta", "Gama", "Delta", "Alpha", "Beta", "MAM"};

	        // Find and print unique words with the same starting and ending letters
	        findUniqueWordsWithSameStartingEndingLetters(str);
	    }

	    private static void findUniqueWordsWithSameStartingEndingLetters(String[] arr) {
	        Set<String> uniqueWords = new HashSet<>();

	        for (String word : arr) {
	            if ( Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(word.charAt(word.length() - 1))) {
	                uniqueWords.add(word);
	            }
	        }

	        System.out.println(uniqueWords);
	    }
	}