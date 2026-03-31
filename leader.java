package Pojo;

public class leader {


/**
 * We need to print all the leaders present in the array. Element is the leader if it is greater than right side of elements.
 * For example:
 * arr[]={14, 12, 70, 115, 99, 65, 21, 90}
 * Here 115, 99 and 90 are leader elements
	
	**/
	 
	    public static void findLeaders(int[] arr) {
	        int n = arr.length;
	        int maxRight = arr[n - 1]; // Initialize the maximum element from the right

	        System.out.print("Leaders: ");

	        // Iterate from right to left
	        for (int i = n - 1; i >= 0; i--) {
	            if (arr[i] > maxRight) {
	                // Current element is greater than the maximum from the right
	                System.out.print(arr[i] + " ");
	                maxRight = arr[i]; // Update the maximum element
	            }
	        }

	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[] arr = {14, 12, 70, 115, 99, 65, 21, 90};

	        findLeaders(arr);
	    }
	}