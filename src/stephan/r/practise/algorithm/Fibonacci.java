package stephan.r.practise.algorithm;

public class Fibonacci {

	static void fibonacci(int n) {
		int[] memoization = new int[n + 1];
		memoization[0] = 1;
		memoization[1] = 1;
		
		System.out.println("F1 = 1");
		System.out.println("F2 = 1");
		
		for(int i = 2; i < n; i++) {
			memoization[i] = memoization[i - 2] + memoization[i -1];
			System.out.println("F" + (i + 1) + " = " + memoization[i]);
		}		
	}
	
	public static void main(String[] args) {
		fibonacci(100);
	}
}
