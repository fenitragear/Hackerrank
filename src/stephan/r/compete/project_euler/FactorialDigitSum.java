package stephan.r.compete.project_euler;

import java.math.BigInteger;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler020
 * 
 * @author Stéphan R.
 *
 */
public class FactorialDigitSum {
	/**
	 * Digit sum formula:
	 * 		For n = 0 ... log10(n)
	 * 			1/b^n * (x mod b^(n + 1) - x mod b^n)
	 * 
	 * Where
	 * 		x is the number to calculate the digit
	 * 		b is the base
	 *  
	 * @param n
	 * @return
	 */
	static long sum(int n) {
		BigInteger factorial = factorial(n);
		BigInteger sum = BigInteger.valueOf(0);
		
		for(int j = 0; j < Math.log10(factorial.longValue()); j++) {
			double bPowered = Math.pow(10, j);
			
			sum = sum.add(
						BigInteger.valueOf((long) (1 / bPowered)).multiply(
								factorial.mod(
										BigInteger.valueOf((long) Math.pow(10, j + 1))
								).subtract(
										factorial.mod(
												BigInteger.valueOf((long) bPowered)
										)
									)
								)
					);
		}
		
		System.out.println(String.format("factorial of %d! = %d", n, factorial));
		
		return sum.longValue();
	}
	
	/**
	 * Factorial Prime Factorization formula:
	 * 		n! = product(s_i^r_i) = 2^r_1 * 3^r_2 * 5^r_3 * ... * p
	 * 
	 * Where:
	 * 		p denote the largest prime
	 * 		r denote the power of each prime number
	 * 
	 * @param n
	 * @return
	 */
	static BigInteger factorial(int n) {
		int[][] primeFactorizations = getPrimeFactorization(n);
		BigInteger factorial = BigInteger.valueOf(1);
		
		for(int i = 0; i < primeFactorizations.length; i++) {
			int s = primeFactorizations[i][0];
			int r = primeFactorizations[i][1];
			
			factorial = factorial.multiply(
						BigInteger.valueOf((long) Math.pow(s, r))
					);
		}
		
		return factorial;
	}	
	public static void main(String[] args) {
		//for(int j = 0; j < Math.log10(factorial); j++) {
			//sum += (1 / Math.pow(10, j)) * ((factorial % Math.pow(10, j + 1)) - (factorial % Math.pow(10, j)));
		//}
	}
}
