package Test;

import java.util.Arrays;

public class Test2 {

	public static void main(String args[]) {
		int a[] = { 1, 2, 4, 5, 0, 0, 5 };

		int count = 0;
		int[] array = new int[a.length];
		for (int number : a) {
			if (number != 0) {

				array[count] = number;

				count++;

			}

		}
		System.out.println(Arrays.toString(array));

	}

}
