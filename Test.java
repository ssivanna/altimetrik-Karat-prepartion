/**
 * 
 */
package Test;

import java.util.Arrays;

/**
 * 
 */
public class Test {

	public static void main(String args[]) {
		int a[] = new int[] { 1, 0, 4, 6 };
		int b[] = new int[a.length];
  //System.out.println(Arrays.toString(b));
		for (int i = 0; i < a.length;i++) {
			if (a[i] != 0) {
				b[i] = a[i];
			
				//i++;

			}
			System.out.println(b[i]);

		}
		//System.out.println(Arrays.toString(b));
		

	}
}
