package stephan.r.tutorials.tendaysofstatistics.day4.geometric;

/**
 * https://www.hackerrank.com/challenges/s10-geometric-distribution-1/problem
 * 
 * @author Stéphan R.
 *
 */
public class GeometricDistributionI {

	/**
	 * The probability that a machine produces a defective product is 1/3. What is the probability that the 1st defect 
	 * is found during the 5th inspection?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double p = 0.333333;
		double q = 1 - p;
		
		System.out.printf("%.3f", GeometricDistribution.geometricDistribution(5, p, q));
	}
}
