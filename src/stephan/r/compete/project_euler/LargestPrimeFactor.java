package stephan.r.compete.project_euler;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler003
 * 
 * @author Stéphan R.
 *
 */
public class LargestPrimeFactor {
	
	/**
	 * Use the second function of the
	 * trial division because it's 2x
	 * more efficient
	 * 
	 * @param n
	 * @return
	 */
	static long trialDivision(long n) {
		while(n % 2 == 0) {
			n /= 2;
		}

		if(n == 1)
			return 2;
		
		long f = 3;

		while((f * f) <= n) {
			if(n % f == 0) {
				n /= f;
			} else {
				f += 2;
			}
		}

		return (n > 2) ? n : f;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for(int i = 0; i < t; i++) {
        	long start = System.currentTimeMillis();
        	
            System.out.println(trialDivision(scanner.nextLong()));
            System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
        }
        
        scanner.close();
	}
}

