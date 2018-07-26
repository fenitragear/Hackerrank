package stephan.r.tutorials.tendaysofstatistics.day0;

/**
 * https://www.hackerrank.com/challenges/s10-weighted-mean/problem
 * 
 * @author Stéphan R.
 *
 */
public class WeigthedMean {

	public static void main(String[] args) {
		int n = 10;
	    String xStr = "10 40 30 50 20 10 40 30 50 20";
	    String wStr = "1 2 3 4 5 6 7 8 9 10";
	    double sumXW = 0.0;
	    double sumW = 0.0;
	    
	    for(int i = 0; i < n; i++) {
	        sumXW += (Double.parseDouble(xStr.split(" ")[i]) *  Double.parseDouble(wStr.split(" ")[i]));
	        sumW += Double.parseDouble(wStr.split(" ")[i]);
	    }
	    
	    System.out.println(String.format("%.1f", (double)(sumXW/sumW)));
	}
}
