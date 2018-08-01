package stephan.r.compete.project_euler;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler016
 * 
 * @author Stéphan R.
 *
 */
public class PowerDigitSum {

	private static BigInteger[] powers = new BigInteger[10001];
	
	/**
	 * 
	 */
	static void power() {
		for(int i = 0; i < 10001; i++) {
			powers[i] = BigInteger.valueOf(2).pow(i);
		}
	}
	
	public static void main(String[] args) {
		power();
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
				
		for(int i = 0; i < t; i++) {
			int p = scanner.nextInt();
			long start = System.currentTimeMillis();
			
			BigInteger m = powers[p];
			BigInteger sum = BigInteger.ZERO;
			
			while(m.compareTo(BigInteger.ZERO) > 0) {				
				BigInteger n = m.mod(BigInteger.TEN);
	            sum = sum.add(n);
	            m = m.divide(BigInteger.TEN);
	        }
			
			System.out.println(sum);
			System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
		}
		
		scanner.close();
	}
}
