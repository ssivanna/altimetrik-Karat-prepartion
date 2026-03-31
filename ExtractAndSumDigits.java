package Pojo;

public class ExtractAndSumDigits {
	
	
	    public static void main(String[] args) {
	        String inputString = "a567gh8k34y9";
	        int sum = extractAndSumDigits(inputString);
	        System.out.println("Output: " + sum);
	    }

	    private static int extractAndSumDigits(String inputString) {
	        int sum = 0;
	        StringBuilder currentNumber = new StringBuilder();

	        for (char c : inputString.toCharArray()) {
	            if (Character.isDigit(c)) {
	                // Append the digit to the current number
	                currentNumber.append(c);
	            } else {
	                // If a non-digit character is encountered, add the current number to the sum
	                if (currentNumber.length() > 0) {
	                    sum += Integer.parseInt(currentNumber.toString());
	                    // Reset the current number for the next sequence of digits
	                    currentNumber.setLength(0);
	                }
	            }
	        }

	        // Add the last number if the string ends with a digit sequence
	        if (currentNumber.length() > 0) {
	            sum += Integer.parseInt(currentNumber.toString());
	        }

	        return sum;
	    }
	}


