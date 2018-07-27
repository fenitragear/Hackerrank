package stephan.r.compete.project_euler;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler007
 * 
 * @author Stéphan R.
 *
 */
public class TenTausandFirstPrime {

	private static long[] prime = new long[(int) (Math.pow(10, 4) + 2)];
	
	/**
	 * Sieve Of Eratosthenes Algorithm
	 * 
	 * Initialize an array of boolean default false
	 * Initialize an array of sum
	 * 
	 * 		For 2 ... sqrt(n)
	 * 			If a[i] is true then i is prime
	 * 				Mark to true all it's multiple, lesser or equal, than n (k * i ≤ n, k ≥ 2);
	 * 			Otherwise, if i is marked, then it is a composite number.
	 * 
	 * 		Output: all i such that A[i] is false.
	 * 
	 */
	static void loadAllPrime() {
		boolean arr[] = new boolean[(int) (Math.pow(10, 8) + 1)];
		int index = 0;
		
	    for(int j = 2; j < (int) Math.sqrt(arr.length); j++) {	    	
	    	if(!arr[j]) {
	    		for(int k = j * 2; k < arr.length; k += j) {
		            arr[k] = true;
		        }
		    }
		}
	    
        for(int f = 2; f < arr.length; f++) {        	
        	if(!arr[f]) {
        		if(++index < prime.length) {
        			prime[index] = f;
        		} else {
        			break;
        		}        		
        	}
        }
	}
	
	public static void main(String[] args) {
		loadAllPrime();
		
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for(int i = 0; i < t; i++) {
            long start = System.currentTimeMillis();
    		
    		System.out.println(prime[scanner.nextInt()]);
    		System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
        }
        
        scanner.close();
	}
}