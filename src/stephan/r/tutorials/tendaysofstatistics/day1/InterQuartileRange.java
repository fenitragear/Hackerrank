package stephan.r.tutorials.tendaysofstatistics.day1;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/s10-interquartile-range/problem
 * 
 * @author Stéphan R.
 *
 */
public class InterQuartileRange {
	
	/**
	 * @param x
	 * @param n
	 * @return
	 */
	static double[] quartiles(int[] x, int n) {
		Arrays.sort(x);
		
        int mid = n / 2;
        double median = (n % 2 == 0) ? (x[mid - 1] + x[mid]) / 2 : x[mid];
        int qMid = mid/2;
        int[] xLowerHalf = new int[mid];
        int[] xUpperHalf = new int[mid];
        
        for(int i = 0; i < mid; i++) {
        	xLowerHalf[i] = x[i];
        	xUpperHalf[i] = x[(n % 2 == 0) ? i + mid : i + mid + 1];
        }
        
        return new double[] {
        		(mid % 2 == 0) ? (double)(xLowerHalf[qMid - 1] + xLowerHalf[qMid])/2 : (double)xLowerHalf[qMid],
        		(n % 2 != 0) ? (double)x[mid] : median,
        		(mid % 2 == 0) ? (double)(xUpperHalf[qMid - 1] + xUpperHalf[qMid])/2 : (double)xUpperHalf[qMid]
        };
	}
	
	/**
	 * @param q1
	 * @param q3
	 * @return
	 */
	static double interQuartiles(double q1, double q3) {
		return q3 - q1;
	}

	public static void main(String[] args) {
		int n = 6;
        String xStr = "6 12 8 10 20 16";
        String fStr = "5 4 3 2 1 5";
        int length = 0;
        
        for(int i = 0; i < n; i++) {
            length += Integer.parseInt(fStr.split(" ")[i]);
        }
        
        int[] s = new int[length];
        int index = 0;
        
        for(int i = 0; i < length; i++) {        	
            int occurence = Integer.parseInt(fStr.split(" ")[index]);
            int pos = i;
            
            while(occurence-- > 0) {
                s[pos++] = Integer.parseInt(xStr.split(" ")[index]);
            }
            
            i = pos - 1;
            index++;
        } 
        
        double[] quartiles = quartiles(s, length);
        System.out.println(String.format("%.1f", interQuartiles(quartiles[0], quartiles[2])));
	}
}
