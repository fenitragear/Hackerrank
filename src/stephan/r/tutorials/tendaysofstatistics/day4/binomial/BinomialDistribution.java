package stephan.r.tutorials.tendaysofstatistics.day4.binomial;

/**
 * @author Stéphan R.
 *
 */
public class BinomialDistribution {

	/**
	 * n! = n x (n - 1) x (n - 2) x ... x 3 x 2 x 1
	 * 
	 * @param n
	 * @return
	 */
	static Long factorial(int n) {	   
		return (n != 0) ? n * factorial(n-1) : 1;
	}
	
	/**
	 * Combination formula: n! / x!(n - x)!
	 * 
	 * @param r
	 * @return
	 */
	static Long combination(int r, int n) {
		return (factorial(n) / (factorial(r) * factorial(n - r))); 
	}
	
	/**
	 * Binomial Distribution formula: (n! / x!(n - x)!) * p^x * q^(n - x)
	 * 
	 * @param x The number of successes
	 * @param n The total number of trials
	 * @param p The probability of success of 1 trial
	 * @param q The probability of failure of 1 trial where q is defined by q = 1 - p
	 * 
	 * @return
	 */
	static double binomialDistribution(int x, int n, double p, double q, int... fn) {
		double probability = 0.0;
	    
	    // x is the number of success    
	    for(int r = n; r >= x; r--) {
	    	probability +=  combination(r, (fn.length > 0) ? fn[0] : n) * Math.pow(p, r) * Math.pow(q, ((fn.length > 0) ? fn[0] - r : n - r)); 
	    }
	    
	    return probability;
	}
}
