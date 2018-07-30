package stephan.r.compete.project_euler;

import java.math.BigDecimal;
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
		long factorial = factorial(n);
		long sum = 0;
		
		for(int j = 0; j < Math.log10(factorial); j++) {		
			double a = 1 / Math.pow(10, j);
			double b = Math.pow(10, j + 1);
			double c = Math.pow(10, j);
			
			sum += a * ((factorial % b) - (factorial % c));
		}
				
		return sum;
	}
	
	/**
	 * Sieve Of Eratosthenes
	 * 
	 * Compute r:
	 * 		for each prime number denoted by x
	 * 			val1 = the number that x can divide between 1 and n
	 * 				while val1 is greater than 1
	 * 					find the number that x can divide between 1 and val1
	 *  
	 * Factorial Prime Factorization formula:
	 * 		n! = product(s_i^r_i) = 2^r_1 * 3^r_2 * 5^r_3 * ... * p
	 * 
	 * Where:
	 * 		p denote the largest prime
	 * 		r denote the power of each prime number
	 * 
	 * @param n
	 * 
	 * @return tab[s][r] - where s is the prime factorization and r the power
	 */
	static long factorial(int n) {
		long factorial = 1;
		boolean[] tab = new boolean[n + 1];
		
		for(int i = 2; i < Math.sqrt(tab.length); i++) {
			if(!tab[i]) {
				for(int j = (i * i); j < tab.length; j += i) {
					tab[j] = true;
				}
			}
		}
		
		for(int i = 2; i < tab.length; i++) {
			if(!tab[i]) {
				int r = n;
				int power = 0;
				
				while(r > 1) {
					int count = 0;
					
					for(int x = i; x <= r; x += i) {
						count++;
					}
					
					r = count++;
					power += r;
				}		
				
				factorial *= Math.pow(i, power);
			}
		}
		
		return factorial;
	}
	
	/**
	 * n! means n × (n − 1) × ... × 3 × 2 × 1
	 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800, 
	 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
	 * 
	 * Find the sum of the digits in the number 100!
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		System.out.println(sum(10));
		System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
	}
}
