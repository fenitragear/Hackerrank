package stephan.r.tutorials.tendaysofstatistics.day8;

/**
 * https://www.hackerrank.com/challenges/s10-least-square-regression-line/problem
 * 
 * @author Stéphan R.
 *
 */
public class LeastSquareRegressionLine {

	/**
	 * Least Square Regression Line formula:
	 * Y = a + bX
	 * 
	 * Finding value of b: b = ((N * (sum xi * yi)) - (sum xi)(sum yi)) / ((n * (sum xi^2)) - ((sum xi)^2))
	 * Finding value of a: a = y - bx where y is the mean of Y and x is the mean of X
	 * 
	 * @param x
	 * @param y
	 * @param n
	 * @param X
	 * @return
	 */
	static double prediction(double[] x, double[] y, int n, double X) {
		double sumX = 0.0;		
		double sumY = 0.0;
		double sumSquareX = 0.0;
		double sumXY = 0.0;
		
		for(int i = 0; i < n; i++) {
			sumX += x[i];
			sumY += y[i];
			
			sumSquareX += Math.pow(x[i], 2);
			sumXY += (x[i] * y[i]);
		}
		
		double meanX = sumX / n;
		double meanY = sumY / n;
		double b = ((n * sumXY) - (sumX * sumY)) / ((n * sumSquareX) - Math.pow(sumX, 2));
		double a = meanY - (b * meanX);
		
		return a + (b * X);
	}
	
	/**
	 * A group of five students enrolls in Statistics immediately after taking a Math aptitude test. 
	 * Each student's Math aptitude test score, x, and Statistics course grade, y, can be expressed as 
	 * the following list of (x, y) points:
	 * 		1/ (95, 85)
	 * 		2/ (85, 95)
	 * 		3/ (80, 70)
	 * 		4/ (70, 65)
	 * 		5/ (60, 70)
	 * If a student scored an 80 on the Math aptitude test, what grade would we expect them to achieve in Statistics?
	 * Determine the equation of the best-fit line using the least squares method, then compute and print the value of y
	 * when x = 80.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("%.3f", prediction(
				new double[] { 95, 85, 80, 70, 60 },
				new double[] { 85, 95, 70, 65, 70 },
				5, 80
			));
	}
}
