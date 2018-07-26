package stephan.r.compete.project_euler;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler006
 * 
 * @author Stéphan R.
 *
 */
public class SumSquareDifference {
	
	/**
	 * Sum of the squares formula: n *(n + 1)(2n + 1) / 6
	 * Square of the sum formula: (n * (n + 1) / 2)^2
	 * 
	 * @param n
	 * @return
	 */
	static long sumSquareDifference(long n) {
		long sumOfTheSquares = (n  * ((n + 1) * ((2 * n) + 1))) / 6;
		long squareOfTheSum = (long) Math.pow((n * (n + 1)) / 2, 2);
		
		return Math.abs(squareOfTheSum - sumOfTheSquares);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for(int i = 0; i < t; i++) {
        	long start = System.currentTimeMillis();
        	
            System.out.println(sumSquareDifference(scanner.nextLong()));
    		System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
        }
		
        scanner.close();
	}
}
