package stephan.r.tutorials.tendaysofstatistics.day4.geometric;

/**
 * @author Stéphan R.
 *
 */
public class GeometricDistribution {

	/**
	 * Geometric Distribution formula: g(n, p) = q^(n - 1) * p
	 * 
	 * @param n The total number of trials
	 * @param p The probability of success of 1 trial
	 * @param q The probability of failure of 1 trial where q is defined by q = 1 - p
	 * 
	 * @return
	 */
	static double geometricDistribution(int n, double p, double q) {
		return Math.pow(q, (n - 1)) * p;
	}

	/**
	 * Geometric Distribution formula: g(n, p) = q^(n - 1) * p
	 * 
	 * @param r
	 * @param n The total number of trials
	 * @param p The probability of success of 1 trial
	 * @param q The probability of failure of 1 trial where q is defined by q = 1 - p
	 * 
	 * @return
	 */
	static double geometricDistribution(int r, int n, double p, double q) {
		double result = 0.0;
		
		for(int x = r; x < n; x++) {
			result += Math.pow(q, x) * p;
		}
		
		return result;
	}
}
