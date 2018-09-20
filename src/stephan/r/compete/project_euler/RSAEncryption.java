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
	
	static long trialDivision2(long n) {		
		while((n & 1) == 0) {
			n /= 2;
		}

		if(n == 1) {
			return 2;
		}			
		
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
	
	static long getRemainder(long num, long divisor) {
        return num - divisor * (num / divisor);
    }
	
	static long gcd(long a, long b) {
	    while (a != 0) {
	    	if(b != 0) {
	    		if (a >= b) {
		        	a = getRemainder(a, b);
		        } else {
		        	b = getRemainder(b, a);
		        }
	    	} else {
	    		break;
	    	}	        
	    }
	    
	    return a + b;
	}
		
	/**
	 * e and phi must be coprime
	 * Unconcealed message is at the minimum => (1 + gcd((e - 1), (p - 1)) * (1 + gcd((e - 1), (q - 1))) == 9
	 * 
	 * @param p -> p - 1
	 * @param q -> q - 1
	 * 
	 * @return
	 */
	static long numberOfUnconcealedMessage(long p, long q) {
		long pLargestPrimeFactor = trialDivision2(p);
		long qLargestPrimeFactor = trialDivision2(q);		
		long phi = p * q;
		long sumValueOfE = 0;
		
		for(int e = 1; e < phi; e += 2) {
			if(getRemainder(e, 12) == 11) {
				if(getRemainder(e, pLargestPrimeFactor) <= 1 || getRemainder(e, qLargestPrimeFactor) <= 1) {
					continue;
				} else {
					if(gcd(e, phi) == 1) {
						if(gcd((e - 1), phi) == 2) {
							sumValueOfE += e;
						}
					}
				}
			}
		}
	
		return sumValueOfE;
	}
	
	public static void main(String[] args) {		
		long start = System.currentTimeMillis();		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(numberOfUnconcealedMessage((scanner.nextLong() - 1), (scanner.nextLong() - 1)));
		System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
		
		scanner.close();
	}
}
