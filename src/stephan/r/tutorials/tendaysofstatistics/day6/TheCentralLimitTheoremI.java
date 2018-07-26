package stephan.r.tutorials.tendaysofstatistics.day6;

/**
 * https://www.hackerrank.com/challenges/s10-the-central-limit-theorem-1/problem
 * 
 * @author Stéphan R.
 *
 */
public class TheCentralLimitTheoremI {

	/**
	 * A large elevator can transport a maximum of 9800 pounds. Suppose a load of cargo containing 49 boxes must be transported 
	 * via the elevator. The box weight of this type of cargo follows a distribution with a mean of m = 205 pounds and a standard
	 * deviation of sd = 15 pounds. Based on this information, what is the probability that all 49 boxes can be safely loaded into the
	 * freight elevator and transported? 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("%.4f", TheCentralLimitTheorem.theCentralLimitTheorem(9800, 49, 205, 15));
	}
}
