package stephan.r.compete.project_euler;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler012
 * 
 * @author Stéphan R.
 *
 */
public class HighlyDivisibleTriangularNumber {

	private static long[] result = new long[1024];
	
	/**
	 * Calculate number of divisor
	 * n = a^n, b^m, c^q then the number of divisors is (n+1)(m+1)(q+1)
	 * 
	 * @param n
	 */	
	static void load() {
		boolean[] primes = new boolean[(int) ((Math.pow(10, 7) * 9 ) + 1)];
		Arrays.fill(primes, Boolean.TRUE);
		
		for(int i = 2; i < Math.sqrt(primes.length); i++) {
			if(primes[i]) {
				for(int j = (i * i); j < primes.length; j += i) {
					primes[j] = false;
				}
			}
		}
		
		result[0] = 1;
		
		long triangularNumber = 0;
		long total = 0;
		int n = 2;
		
		while(total < 1000) {
			total = 1;
			triangularNumber = (n * (n + 1)) / 2;
			long x = triangularNumber;
			
		    for (int p = 2; p <= x; p++) {
		        if (primes[p]) {
		            if (x % p == 0) {
		            	int count = 0;
		            	
		                while (x % p == 0) {
		                    x /= p;
		                    count++;
		                }
		                
		                total = total * (count + 1);
		            }		            
		        }
		    }
		    
    		for(int f = (int) total - 1; f >= 0; f--) {
    			if(result[f] == 0) {
    				result[f] = triangularNumber;
    			} else {
    				break;
    			}
    		}
    		
    		n++;
		}
	}
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		
		load();
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		for(int i = 0; i < t; i++) {
			System.out.println(result[scanner.nextInt()]);
		}
		
		scanner.close();
		
		long end = System.nanoTime();
		System.out.println("Solution took " + ((end - start) / 1000000) + "ms");
	}
}
