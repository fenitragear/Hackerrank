package stephan.r.practise.algorithm;

public class SeriesLoop {
	
	/**
	 * @param result
	 */
	static void read(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	/**
	 * Compute using Dynamic Programming (Top Down approach)
	 * (a + Math.pow(2, 0) * b), (a + Math.pow(2, 0) * b + Math.pow(2, 1) * b), ..., (a + Math.pow(2, 0) * b + Math.pow(2, 1) * b + ...+ Math.pow(2, n - 1) * b)
	 * 
	 * @param a
	 * @param b
	 * @param n
	 */
	static void series(int a, int b, int n) {
		int[] memoization = new int[n];
		memoization[0] = (int) (a + (Math.pow(2, 0) * b));
				
		for(int i = 1; i < n; i++) {
			memoization[i] = (int) (memoization[i - 1] + (Math.pow(2, i) * b));			
		}
		
		read(memoization);
	}
	
	public static void main(String[] args) {
		series(0, 2, 10);
		System.out.println("");
		series(5, 3, 5);
	}
}
