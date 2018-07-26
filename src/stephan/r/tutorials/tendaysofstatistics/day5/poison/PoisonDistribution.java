package stephan.r.tutorials.tendaysofstatistics.day5.poison;

/**
 * @author Stéphan R.
 *
 */
public class PoisonDistribution {

	private static final double E = 2.71828;
	
	/**
	 * n! = f(n) = 1! x 2! x ... x (n - 1)!
	 * 
	 * @param n
	 * @return
	 */
	static Long factorial(int n) {	   
		return (n != 0) ? n * factorial(n-1) : 1;
	}
	
	/**
	 * Poison distribution formula: ((lambda^k) * (e^-lambda)) / k!
	 * Where constant e = 2.71828
	 * 
	 * @param k is the actual number of successes that occur in a specified region.
	 * @param lambda The average number of successes that occurs in a specified region
	 * 
	 * @return
	 */
	static double poisonDistribution(int k, double lambda) {
		return (Math.pow(lambda, k) * Math.pow(E, (lambda * -1))) / factorial(k);
	}
	
	/**
	 * Poison distribution formula: ((lambda^k) * (e^-lambda)) / k!
	 * Where constant e = 2.71828
	 * 
	 * @param n occurence
	 * @param k is the actual number of successes that occur in a specified region.
	 * @param lambda lambda The average number of successes that occurs in a specified region
	 * 
	 * @return
	 */
	static double poisonDistribution(int n, int k, double lambda) {
		double result = 0.0;
		
		for(int r = n; r < k; r++) {
			result += (Math.pow(lambda, r) * Math.pow(E, (lambda * -1))) / factorial(r);
		}
		
		return result;
	}
	
	/**
	 * Special case formula:
	 * X = E[X]
	 * X^2 = E[X^2] = lambda + lambda^2
	 * E[X] = sqrt(X^2)
	 * 
	 * @param lambda lambda The average number of successes that occurs in a specified region
	 * 
	 * @return
	 */
	static double poisonDistribution(double lambda) {
		return Math.sqrt(lambda + Math.pow(lambda, 2));
	}
}
