package stephan.r.tutorials.tendaysofstatistics.day4.binomial;

/**
 * https://www.hackerrank.com/challenges/s10-binomial-distribution-1/problem
 * 
 * @author Stéphan R.
 *
 */
public class BinomialDistributionI {
	
	public static final double BOY_RATIO = 1.09;
    public static final double GIRL_RATIO = 1;
    	
	/**
	 * The ratio of boys to girls for babies born in Russia is 1.09 : 1 If there is 1 child born per birth, what proportion of Russian 
	 * families with exactly 6 children will have at least 3 boys?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double p = (BOY_RATIO) / (BOY_RATIO + GIRL_RATIO);
	    double q = 1 - p;
	    
	    System.out.println(String.format("%.3f", BinomialDistribution.binomialDistribution(3, 6, p, q)));
	}
}
