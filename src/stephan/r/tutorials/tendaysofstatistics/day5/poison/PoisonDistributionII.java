package stephan.r.tutorials.tendaysofstatistics.day5.poison;

/**
 * https://www.hackerrank.com/challenges/s10-poisson-distribution-2/problem
 * 
 * @author Stéphan R.
 *
 */
public class PoisonDistributionII {

	/**
	 * The manager of a industrial plant is planning to buy a machine of either type A or type B. 
	 * For each day�s operation:
	 * 		1/ the number of repairs, X, that machine A needs is a Poisson random variable with mean 0.88. The daily cost of operating 
	 * 		   A is Ca = 160 + 40X^2
	 * 		2/ The number of repairs, Y, that machine B needs is a Poisson random variable with mean 1.55. The daily cost of operating
	 * 		   B is Cb = 128 + 40Y^2
	 * Assume that the repairs take a negligible amount of time and the machines are maintained nightly to ensure that they operate
	 * like new at the start of each day. Find and print the expected daily cost for each machine.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Daily cost on machine A formula: Ca = 160 + 40X^2
		System.out.printf("%.3f%n", 160 + (40 * Math.pow(PoisonDistribution.poisonDistribution(0.88), 2)));
		
		// Daily cost on machine B formula: Cb = 128 + 40Y^2
		System.out.printf("%.3f", 128 + (40 * Math.pow(PoisonDistribution.poisonDistribution(1.55), 2)));
	}
}
