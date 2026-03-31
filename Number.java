package Pojo;

import java.util.Arrays;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	        int[] numbers = {6, 9, 3, 2, 7};

	        System.out.println("Original Array: " + java.util.Arrays.toString(numbers));

	        int[] evenNumbers = new int[numbers.length];
	        int[] oddNumbers = new int[numbers.length];

	        int evenIndex = 0;
	        int oddIndex = 0;

	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] % 2 == 0) {
	                evenNumbers[evenIndex++] = numbers[i];
	            } else {
	                oddNumbers[oddIndex++] = numbers[i];
	            }
	        }

	        // Trim the arrays to remove unused elements
	        evenNumbers = java.util.Arrays.copyOf(evenNumbers, evenIndex);
	        oddNumbers = java.util.Arrays.copyOf(oddNumbers, oddIndex);

	        System.out.print( Arrays.toString(evenNumbers));
	        System.out.print( Arrays.toString(oddNumbers));
	    }
	}
	
	

