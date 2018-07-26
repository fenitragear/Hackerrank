package stephan.r.tutorials.tendaysofstatistics.day5.normal;

/**
 * https://www.hackerrank.com/challenges/s10-normal-distribution-2/problem
 * 
 * @author Stéphan R.
 *
 */
public class NormalDistributionII {

	/**
	 * The final grades for a Physics exam taken by a large group of students have a mean of m = 70 and a standard deviation of
	 * sd = 10. If we can approximate the distribution of these grades by a normal distribution, what percentage of the students:
	 * 		1/ Scored higher than 80 (i.e., have a grade > 80)?
	 * 		2/ Passed the test (i.e., have a grade >= 60)?
	 * 		3/ Failed the test (i.e., have a grade < 60)?
	 * 
	 * Multiply by 100 to get the right answer
	 * Subtracting from 100 gives you the upper part
	 * 
	 * @param args
	 */
	public static void main(String[] args) {		
		// 1/ Scored higher than 80 (i.e., have a grade > 80)?
		System.out.printf("%.2f%n", (1 - NormalDistribution.normalDistribution(80, 70, 10)) * 100);
		
		// 2/ Passed the test (i.e., have a grade >= 60)?
		System.out.printf("%.2f%n", (1 - NormalDistribution.normalDistribution(60, 70, 10)) * 100);
		
		// 3/ Failed the test (i.e., have a grade < 60)?
		System.out.printf("%.2f", (NormalDistribution.normalDistribution(60, 70, 10)) * 100);
	}
}
