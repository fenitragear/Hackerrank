package stephan.r.practice.algorithm;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/linkedin-practice-array-left-rotation/problem
 * 
 * @author St�phan R.
 *
 */
public class LeftRotateTheArray {
	
	/**
	 * Rotate array to the left by x where x is the number of shift
	 *
	 * @param arr
	 * @param length
	 * @param shift
	 */
	static void rotate(int[] arr, int length, int shift) {
		boolean skipRotation = (shift % length == 0) ? true : false;
		shift = (skipRotation) ? 1 : (length - (shift % length));

		// When shift modulo by the length of the array is equal to 
        // zero then no rotation is needed
		if(!skipRotation) {
			for(int r = 0; r < shift; r++) {
				for(int i = 0; i < length; i++) {
					// Avoid the last xor operation
					if(i != length - 1) {
						arr[i] = arr[i] ^ arr[length - 1];
						arr[length - 1] = arr[i] ^ arr[length - 1];
						arr[i] = arr[i] ^ arr[length - 1];
					}
				}
			}
		}

		System.out.println(String.join(" ", Arrays.toString(arr).replace(",", "").replace("[", "").replace("]", "")));
	}

	public static void main(String[] args) {
		rotate(new int[] { 1, 2, 3, 4, 5 }, 5, 4);
	}
}
