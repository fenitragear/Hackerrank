package stephan.r.tutorials.tendaysofstatistics.day7;

/**
 * https://www.hackerrank.com/challenges/s10-pearson-correlation-coefficient/problem
 * 
 * @author Stéphan R.
 *
 */
public class PearsonCorrelationCoefficient {
	
	/**
	 * @param t
	 * @param mean
	 * @param n
	 * 
	 * @return
	 */
	static double standardDeviation(double[] t, double mean, int n) {
		double squareDistance = 0.0;
		
		for(int j = 0; j < t.length; j++) {
            squareDistance += (Math.pow((t[j] - mean), 2));
        }
        
        return Math.sqrt(squareDistance / n);
	}
	
	/**
	 * Pearson Correlation Coefficient formula:
	 * sum {(Xi - meanX) * (Yi - meanY)} / n * sdX * sdY
	 * 
	 * @param x
	 * @param y
	 * 
	 * @return
	 */
	static double pearsonCorrelationCoefficient(double[] x, double[] y) {
		double meanX = 0.0;
		double meanY = 0.0;
		int n = x.length;
		
		for(int i = 0; i < n; i++) {
			meanX += x[i];
			meanY += y[i];
		}
		
		meanX /= n;
		meanY /= n;
		
		double sdX = standardDeviation(x, meanX, n);
		double sdY = standardDeviation(y, meanY, n);
		double covariance = 0.0;
		
		for(int i = 0; i < n; i++) {
			covariance += (x[i] - meanX) * (y[i] - meanY);
		}
				
		return covariance / (n * sdX * sdY);
	}

	/**
	 * Given two n-element data sets, X and Y, calculate the value of the Pearson correlation coefficient.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("%.3f", pearsonCorrelationCoefficient(
				new double[] { 10, 9.8, 8, 7.8, 7.7, 7, 6, 5, 4, 2 },
				new double[] { 200, 44, 32, 24, 22, 17, 15, 12, 8, 4 }
			));
	}
}
