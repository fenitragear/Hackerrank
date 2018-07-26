package stephan.r.tutorials.tendaysofstatistics.day5.normal;

/**
 * @author Stéphan R.
 *
 */
public class NormalDistribution {
	
	/**
	 * Error function
	 * Horner's method
	 * 
	 * @param z
	 * @return
	 */
	static double erf(double z) {
        double t = 1.0 / (1.0 + 0.5 * Math.abs(z));
        double ans = 1 - t * Math.exp( -z * z   -   1.26551223 +
                                            t * ( 1.00002368 +
                                            t * ( 0.37409196 + 
                                            t * ( 0.09678418 + 
                                            t * (-0.18628806 + 
                                            t * ( 0.27886807 + 
                                            t * (-1.13520398 + 
                                            t * ( 1.48851587 + 
                                            t * (-0.82215223 + 
                                            t * ( 0.17087277))))))))));
        
        return (z >= 0) ? ans : -ans;
	}
	
	/**
	 * Normal Deviation formula cumulative probability
	 * 1/2(1 + erf((x - m)/sd * sqrt(2)))
	 * 
	 * @param x
	 * @param m is the mean (or expectation) of the distribution. It is also equal to median and mode of the distribution
	 * @param sd is the standard deviation. 
	 * 
	 * @return
	 */
	public static double normalDistribution(double x, double m, double sd) {			
		return 0.5 * (1 + erf((x - m) / (sd * Math.sqrt(2))));
	}
}
