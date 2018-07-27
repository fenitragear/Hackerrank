package stephan.r.compete.project_euler;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler010/problem
 * 
 * @author Stéphan R.
 *
 */
public class SummationOfPrimes {

	private static long[] arr2 = new long[1000000 + 1];
	
	/**
	 * Sieve Of Eratosthenes Algorithm
	 * 
	 * Initialize an array of boolean default true
	 * Initialize an array of sum
	 * 
	 * 		For 2 ... sqrt(n)
	 * 			If a[i] is true then i is prime
	 * 				Mark to false all it's multiple, lesser or equal, than n (k * i ≤ n, k ≥ 2);
	 * 			Otherwise, if i is marked, then it is a composite number.
	 * 
	 * 		Output: all i such that A[i] is true.
	 * 
	 */
	static void loadAllSumPrime() {
		boolean arr[] = new boolean[1000000 + 1];
		long sumPrime = 0;
		
	    for(int i = 2; i <= 1000000; i++) {
	        arr[i] = true;
	    }
	        
	    for(int j = 2; j <= (int) Math.sqrt(1000000); j++) {	    	
	    	if(arr[j]) {
	    		for(int k = j * 2; k <= 1000000; k += j) {
		            arr[k] = false;
		        }
		    }
		}
	    
        for(int f = 2; f <= 1000000; f++) {
           if(arr[f]) {
               sumPrime += f;
           }
           
           arr2[f] = sumPrime;
        }
	}
	
	public static void main(String[] args) {
		loadAllSumPrime();
	        
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for(int i = 0; i < t; i++) {
        	long start = System.currentTimeMillis();
    		
            System.out.println(arr2[scanner.nextInt()]);
            System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
        }
        
        scanner.close();
	}
}
