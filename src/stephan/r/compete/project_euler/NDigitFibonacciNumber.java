package stephan.r.compete.project_euler;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler025
 * 
 * @author Stéphan R.
 *
 */
public class NDigitFibonacciNumber {

	public static void main(String[] args) {
		int[] queries = new int[] { 3, 4, 6, 1000 };
		int t = queries.length;
		
		for(int i = 0; i < t; i++) {			
			System.out.println((long) Math.ceil((Math.log(10) * (queries[i] - 1) + Math.log(5) / 2) / Math.log(1.6180339887498948)));
		}
	}
}
