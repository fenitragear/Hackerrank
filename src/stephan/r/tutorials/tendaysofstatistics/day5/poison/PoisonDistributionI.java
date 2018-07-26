package stephan.r.tutorials.tendaysofstatistics.day5.poison;

/**
 * https://www.hackerrank.com/challenges/s10-poisson-distribution-1/problem
 * 
 * @author Stéphan R.
 *
 */
public class PoisonDistributionI {

	/**
	 * A random variable, X, follows Poisson distribution with mean of 2.4. Find the probability 
	 * with which the random variable X is equal to 5
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("%.3f", PoisonDistribution.poisonDistribution(5, 2.5));
	}
}
