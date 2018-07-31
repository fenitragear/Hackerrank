package stephan.r.compete.project_euler;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler005
 * 
 * @author Stéphan R.
 *
 */
public class SmallestMultiple {
	
		
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	static long gcd(long a, long b) {
		if (a < 0 || b < 0)
			throw new IllegalArgumentException("Negative number");
		
		while (b != 0) {
			long z = a % b;
			a = b;
			b = z;
		}
		
		return a;
	}
	
	/**
	 * Least Common Multiple: ab/gcd(a, b)
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	static long lcm(long a, long b) {
		return (a * b) / gcd(a, b);
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long start = System.currentTimeMillis();
        
        for(int a0 = 0; a0 < t; a0++) {
            int n = scanner.nextInt();   
            long lcm = 1;
            
            if(n > 1) {
            	lcm = lcm(n - 1, n);
        		
        		for(int i = n - 2; i > 0; i--) {
        			lcm = lcm(i, lcm);
        		}
            }            
    		
    		System.out.println(lcm);
        }
				
		System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
		
		scanner.close();
	}
}
