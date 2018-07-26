package stephan.r.practice.algorithm;

import java.util.Arrays;

public class CircularRotation {
	
	/**
	 * Rotate array to the right by k where k is the number of shift
	 * 
	 * @param arr
	 * @param length
	 * @param shift
	 */
	static void circularArrayRotation(int[] arr, int length, int shift) {
		int[] a = null;
		boolean skipRotation = (shift % length == 0) ? true : false;
		shift = (skipRotation) ? 1 : (shift > length) ? shift % length : shift;		
		
		if(!skipRotation) {
			a = new int[length];
			
			for(int i = (length - 1); i >= 0; i--) {
				a[(i + shift) % length] = arr[i];
			}
		}

		String res = String.join(" ", Arrays.toString((a != null) ? a : arr).replace(",", "").replace("[", "").replace("]", ""));
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3 };
		int k = 1;
		
		circularArrayRotation(a, a.length, k);
	}
}
