package stephan.r.tutorials.tendaysofstatistics.day1;

/**
 * https://www.hackerrank.com/challenges/s10-standard-deviation/problem
 * 
 * @author Stéphan R.
 *
 */
public class StandardDeviation {

	public static void main(String[] args) {
		int n = 5;
        String xStr = "10 40 30 50 20";
        double mean = 0.0;
        double squareDistance = 0.0;
        
        for(int i = 0; i < n; i++) {
            mean += Double.parseDouble(xStr.split(" ")[i]);
        }
        
        for(int j = 0; j < n; j++) {
            squareDistance += (Math.pow((Double.parseDouble(xStr.split(" ")[j]) - (mean/n)), 2));
        }
        
        System.out.println(String.format("%.1f", Math.sqrt(squareDistance/n)));
	}
}
