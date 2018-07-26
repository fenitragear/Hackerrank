package stephan.r.practise.algorithm;

/**
 * https://www.hackerrank.com/challenges/absolute-permutation/problem
 * 
 * @author stephan
 *
 */
public class AbsolutePermutation {
	
	/**
	 * @param n
	 * @param k
	 * @return
	 */
	static int[] absolutePermutation(int n, int k) {
		// Init table
		int[] pos = new int[n];
		int sumAbsoluteDifference = k;
		k = (k > n) ? k % n : k;		
		
		// Fill the pos[i] table and permute position by k
		for(int i = n; i >= 1; i--) {
			int p = ((i - 1) + k) % n;
			pos[p] = i;
			sumAbsoluteDifference ^= Math.abs(pos[p] - (p + 1));
		}
		
		return (sumAbsoluteDifference == k) ? pos : new int[] { -1 };
    }

	public static void main(String[] args) {
		int[][] queries = new int[][] {
			{ 10, 0 }, 
			{ 10, 1 }, 
			{ 7, 0 }, 
			{ 10, 9 },
			{ 9, 0 },
			{ 10, 3 },
			{ 8, 2 },
			{ 8, 0 },
			{ 7, 0 },
			{ 10, 1 }
		};

		for(int q = 0; q < queries.length; q++) {
			int[] result = absolutePermutation(queries[q][0], queries[q][1]);
			
			for(int i = 0; i < result.length; i++) {
				System.out.print(result[i]);
				
				if(i < result.length) {
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}
	}
}
