package stephan.r.tutorials.tendaysofstatistics.day5.normal;

/**
 * https://www.hackerrank.com/challenges/s10-normal-distribution-1/problem
 * 
 * @author Stéphan R.
 *
 */
public class NormalDistributionI {

	/**
	 * In a certain plant, the time taken to assemble a car is a random variable, X, having a normal distribution with a mean of 20
	 * hours and a standard deviation of 2 hours. What is the probability that a car can be assembled at this plant in:
	 * 		1/ Less than 19.5 hours?
	 * 		2/ Between 20 and 22 hours?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {		
		// 1/ Less than 19.5 hours
		System.out.printf("%.3f%n", NormalDistribution.normalDistribution(19.5, 20, 2));
		
		// 2/ Between 20 and 22 hours
		System.out.printf("%.3f", NormalDistribution.normalDistribution(22, 20, 2) - NormalDistribution.normalDistribution(20, 20, 2));
	}
}
