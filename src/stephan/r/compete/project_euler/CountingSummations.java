package stephan.r.compete.project_euler;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler076
 * 
 * @author Stéphan R.
 *
 */
public class CountingSummations {
	
	/**
	 * @param n
	 * @return
	 */
	static BigInteger partitionNumber(int n) {
		BigInteger[] ways = new BigInteger[n + 1];
		ways[0] = BigInteger.valueOf(1);
		 
		for (int i = 1; i <= (n - 1); i++) {
			for (int j = i; j <= n; j++) {
				ways[j] = (ways[j] == null) ? BigInteger.valueOf(0) : ways[j];
		        ways[j] = ways[j].add(ways[j - i]);
		    }	    
		}
				
		return ways[n].mod(BigInteger.valueOf((long) (Math.pow(10, 9) + 7)));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for(int i = 0; i < t; i++) {
            System.out.println(partitionNumber(scanner.nextInt()));
        }
        
        scanner.close();
	}
}
