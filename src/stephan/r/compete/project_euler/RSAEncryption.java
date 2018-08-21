package stephan.r.compete.project_euler;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler182
 * TODO
 * 
 * @author Stéphan R.
 *
 */
public class RSAEncryption {
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	static long gcd(long a, long b) {
		if (a < 0 || b < 0)
			throw new IllegalArgumentException("Negative number");
		
		while (b != 0) {
			long z = a % b;
			a = b;
			b = z;
		}
		
		return a;
	}
	
	/**
	 * For integer e, 1 < e < phi, such that gcd(e, phi) == 1
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	static Boolean isCoprime(long a, long b) {
		if(((a|b) & 1) == 0)
			return false;
		
		return gcd(a, b) == 1;
	}
	
	/**
	 * e and phi must be coprime
	 * Unconcealed message is at the minimum => (1 + gcd((e - 1), (p - 1)) * (1 + gcd((e - 1), (q - 1)))
	 * 
	 * @param p
	 * @param q
	 * 
	 * @return
	 */
	static long sumOfAllValueE(long p, long q) {
		long phi = (p - 1) * (q - 1);
		long sumValueOfE = 0;
		
		for(int e = 3; e < phi; e += 4) {
			if(isCoprime(e, phi)) {
				if((gcd((e -1), (p - 1)) + 1) * (gcd((e - 1), (q - 1)) + 1) == 9) {
					sumValueOfE += e;
				}
			}
		}
						
		return (long) (sumValueOfE % (Math.pow(10, 9) + 7));
	}
	
	public static void main(String[] args) {		
		long start = System.currentTimeMillis();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(sumOfAllValueE(scanner.nextInt(), scanner.nextInt()));
		
		scanner.close();

		System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
	}
}
