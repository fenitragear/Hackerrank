package stephan.r.tutorials.tendaysofstatistics.day7;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/s10-spearman-rank-correlation-coefficient/problem
 * 
 * @author Stéphan R.
 *
 */
public class SpearmansRankCorrelationCoefficient {
	
	/**
	 * @param t
	 * @return
	 */
	static double[] rank(double[] t, int n) {
		double[] temp = Arrays.copyOf(t, 10);
		double[] rank = new double[n];
		Arrays.sort(temp);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(temp[i] == t[j]) {
					rank[j] = i;
				}
			}
		}
				
		return rank;
	}
	
	/**
	 * Spearman's Rank Correlation Coefficient
	 * If both table contains duplicate value use pearson correlation coefficient on rankX and rankY 
	 * Special case formula: 1 -  ((6 * sum di^2) / n * (n^2 - 1))
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	static double spearmansRankCorrelationCoefficient(double[] x, double[] y) {
		int n = x.length;
		double d = 0.0;
		x = rank(x, n);
		y = rank(y, n);		
		
		for(int i = 0; i < n; i++) {
			d += Math.pow((x[i] + 1) - (y[i] + 1), 2);
		}
		
		return (d > 0) ? 1 - ((6 * d) / (n * (Math.pow(n, 2) - 1))) 
				: PearsonCorrelationCoefficient.pearsonCorrelationCoefficient(x, y);
	}

	/**
	 * Given two n-element data sets, X and Y, calculate the value of Spearman's rank correlation coefficient.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("%.3f", spearmansRankCorrelationCoefficient(
				new double[] { 10, 9.8, 8, 7.8, 7.7, 1.7, 6, 5, 1.4, 2 },
				new double[] { 200, 44, 32, 24, 22, 17, 15, 12, 8, 4 }
			));
	}
}
