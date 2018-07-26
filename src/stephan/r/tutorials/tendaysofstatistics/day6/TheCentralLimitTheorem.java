package stephan.r.tutorials.tendaysofstatistics.day6;

import stephan.r.tutorials.tendaysofstatistics.day5.normal.NormalDistribution;

/**
 * @author Stéphan R.
 *
 */
public class TheCentralLimitTheorem {

	/**
	 * The Central Limit Theorem formula is close to Normal Distribution
	 * m1 = n * m
	 * sd1 = sqrt(n) * sd
	 * 
	 * @param x
	 * @param n
	 * @param m
	 * @param sd
	 * @return
	 */
	static double theCentralLimitTheorem(double x, double n, double m, double sd) {
		return NormalDistribution.normalDistribution(x, (n * m), (Math.sqrt(n) * sd));
	}
}
