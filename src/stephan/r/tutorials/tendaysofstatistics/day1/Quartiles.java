package stephan.r.tutorials.tendaysofstatistics.day1;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/s10-quartiles/problem
 * 
 * @author Stéphan R.
 *
 */
public class Quartiles {

	public static void main(String[] args) {
        int[] x = new int[] { 7, 15, 36, 39, 40, 41 };
        int n = x.length;
        
        Arrays.sort(x);
        int mid = n / 2;
        int median = (n % 2 == 0) ? (x[mid - 1] + x[mid]) / 2 : x[mid];
        int qMid = mid/2;
        int[] xLowerHalf = new int[mid];
        int[] xUpperHalf = new int[mid];
        
        for(int i = 0; i < mid; i++) {
        	xLowerHalf[i] = x[i];
        	xUpperHalf[i] = x[(n % 2 == 0) ? i + mid : i + mid + 1];
        }
        
        System.out.println((mid % 2 == 0) ? (xLowerHalf[qMid - 1] + xLowerHalf[qMid])/2 : xLowerHalf[qMid]);
        System.out.println((n % 2 != 0) ? x[mid] : median);
        System.out.println((mid % 2 == 0) ? (xUpperHalf[qMid - 1] + xUpperHalf[qMid])/2 : xUpperHalf[qMid]);
	}
}
