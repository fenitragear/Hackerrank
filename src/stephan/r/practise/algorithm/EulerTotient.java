package stephan.r.practise.algorithm;

public class EulerTotient {

	/**
	 * gcd(a, b) = phi(a * b) == phi(a) * phi(b)
	 * Where phi(n) is the Euler's totient function
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	static long gcd(long a, long b) {
		return phi(a * b) / (phi(a) * phi(b));
	}
	
	/**
	 * Euler's totient function
	 * 
	 * @param n
	 * @return
	 */
	static long phi(long n) {
		// Initialize result as n
        float result = n;
 
        // Consider all prime factors of n and for
        // every prime factor p, multiply result
        // with (1 - 1/p)
        for (long p = 2; p * p <= n; ++p) {
            // Check if p is a prime factor.
            if (n % p == 0) {
                // If yes, then update n and result
                while (n % p == 0) {
                	 n /= p;
                }                   
                
                result *= (1.0 - (1.0 / (float)p));
            }
        }
 
        // If n has a prime factor greater than sqrt(n)
        // (There can be at-most one such prime factor)
        if (n > 1)
            result *= (1.0 - (1.0 / (float)n));
 
        return (int)result;
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(11, 10));

	}
}
