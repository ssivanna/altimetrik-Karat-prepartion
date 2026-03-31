
public class CountOccurrences {
	
	public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int targetNumber = 1;

        // Count occurrences of targetNumber in the array
        int count = countOccurrences(a, targetNumber);

        System.out.println("The number " + targetNumber + " is repeated " + count + " times.");
    }

    // Function to count occurrences of a specific number in an array
    static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int element : array) {
            if (element == target) {
                count++;
            }
        }
        return count;
    }

}
