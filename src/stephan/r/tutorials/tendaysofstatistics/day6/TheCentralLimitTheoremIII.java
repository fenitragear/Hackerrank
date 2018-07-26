package stephan.r.tutorials.tendaysofstatistics.day6;

/**
 * https://www.hackerrank.com/challenges/s10-the-central-limit-theorem-3/problem
 * 
 * @author Stéphan R.
 *
 */
public class TheCentralLimitTheoremIII {

	/**
	 * You have a sample of 100 values from a population with mean m = 500 and with standard deviation sd = 80. Compute the 
	 * interval that covers the middle 95% of the distribution of the sample mean; in other words, compute A and B such that 
	 * P(A < x < B) = 0.95. Use the value of z = 1.96. Note that z is the z-score.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double mean   = 500;
        double std    = 80;
        int    n      = 100;
        double zScore = 1.96; // equivalent to 95% confidence interval
        
        // Formula for confidence interval +/-
        double marginOfError = zScore * std / Math.sqrt(n);

        System.out.format("%.2f%n", mean - marginOfError);
        System.out.format("%.2f%n", mean + marginOfError);
	}
}
