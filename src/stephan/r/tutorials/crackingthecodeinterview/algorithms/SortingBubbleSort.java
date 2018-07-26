package stephan.r.tutorials.crackingthecodeinterview.algorithms;

/**
 * https://www.hackerrank.com/challenges/ctci-bubble-sort/problem
 * 
 * @author Stéphan R.
 *
 */
public class SortingBubbleSort {
	
	private static int[] result = null;

	/**
	 * @param a
	 * @return
	 */
	static int bubbleSort(int[] a, int length) {
		int countSwap = 0;
		
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				// Swap adjacent elements if they are in decreasing order
				if((j + 1) < length) {
					if(a[j] > a[j + 1]) {
						// Swap two elements using xor
						a[j] ^= a[j + 1];
						a[j + 1] ^= a[j];
						a[j] ^= a[j + 1];
						
						countSwap++;
					}
				}				
			}
		}
		
		result = a;
		
		return countSwap;
	}
	
	/**
	 * @param a
	 */
	static void countSwaps(int[] a) {
		int length = a.length;
		int count = bubbleSort(a, length);
		
		System.out.println("Array is sorted in " + count + " swaps.");
		System.out.println("First Element: " + result[0]);
		System.out.println("Last Element: " + result[length - 1]);		
    }
	
	/**
	 * Test cases
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		countSwaps(new int[] { 6, 4, 1 });
		countSwaps(new int[] { 1, 2, 3 });
		countSwaps(new int[] { 3, 2, 1 });
	}
}
