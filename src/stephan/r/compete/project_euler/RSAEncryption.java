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
	
	static long trialDivision(long n) {
		while(n % 2 == 0) {
			n /= 2;
		}

		if(n == 1)
			return 2;
		
		long f = 3;

		while((f * f) <= n) {
			if(n % f == 0) {
				n /= f;
			} else {
				f += 2;
			}
		}

		return (n > 2) ? n : f;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	static long binary(long a, long b) {
		int shift;
		
		if(a == 0) {
			return b;
		}
		
		if(b == 0) {
			return a;
		}
		
		for(shift = 0; ((a | b) & 1) == 0; ++shift) {
			a >>= 1;
			b >>= 1;
		}
		
		while((a & 1) == 0) {
			a >>= 1;
		}
		
		do {
			while((b & 1) == 0) {
				b >>= 1;
			}
			
			if(a > b) {
				a ^= b;
				b ^= a;
				a ^= b;
			}
			
			b = b - a;
		} while(b != 0);
		
		return a << shift;
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
		
		return binary(a, b) == 1;
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
	static long numberOfUnconcealedMessage(long p, long q) {
		long pLargestPrimeFactor = trialDivision(p);
		long qLargestPrimeFactor = trialDivision(q);
		long phi = p * q;
		long sumValueOfE = 0;
		
		for(long e = 11; e < phi; e += 12) {
			if(e % pLargestPrimeFactor > 1 && e % qLargestPrimeFactor > 1) {
				if(isCoprime(e, phi)) {
					long E = (e - 1);
					
					if(binary(E, p) == 2 && binary(E, q) == 2) {
						sumValueOfE += e;
					}
				}	
			}
		}
						
		return sumValueOfE;
	}
	
	public static void main(String[] args) {		
		long start = System.currentTimeMillis();		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(numberOfUnconcealedMessage((scanner.nextInt() - 1), (scanner.nextInt() - 1)));
		System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
		
		scanner.close();
	}
}
