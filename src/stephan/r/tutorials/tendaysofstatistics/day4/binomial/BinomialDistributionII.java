package stephan.r.tutorials.tendaysofstatistics.day4.binomial;

/**
 * https://www.hackerrank.com/challenges/s10-binomial-distribution-2/problem
 * 
 * @author Stéphan R.
 *
 */
public class BinomialDistributionII {
    	
	/**
	 * A manufacturer of metal pistons finds that, on average, 12% of the pistons they manufacture are rejected because they are 
	 * incorrectly sized. What is the probability that a batch of 10 pistons will contain:
	 * 		1- No more than 2 rejects?
	 * 		2- At least 2 rejects?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double p = 0.12;
		double q = 1 - p;
					    
		// 1- No more than 2 rejects?
	    System.out.format("%.3f%n", BinomialDistribution.binomialDistribution(0, 2, p, q, 10));
	    
	    // 2- At least 2 rejects? 			    
 	    System.out.format("%.3f", BinomialDistribution.binomialDistribution(2, 10, p, q));
	}
}
