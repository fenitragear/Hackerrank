package stephan.r.tutorials.tendaysofstatistics.day6;

/**
 * https://www.hackerrank.com/challenges/s10-the-central-limit-theorem-2/problem
 * 
 * @author Stéphan R.
 *
 */
public class TheCentralLimitTheoremII {

	/**
	 * The number of tickets purchased by each student for the University X vs. University Y football game follows a distribution that 
	 * has a mean of m = 2.4 and a standard deviation of sd = 2.0
	 * A few hours before the game starts, 100 eager students line up to purchase last-minute tickets. If there are only 250 tickets left,
	 * what is the probability that all 100 students will be able to purchase tickets? 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("%.4f", TheCentralLimitTheorem.theCentralLimitTheorem(250, 100, 2.4, 2.0));
	}
}
