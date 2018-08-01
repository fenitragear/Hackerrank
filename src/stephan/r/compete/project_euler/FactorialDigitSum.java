package stephan.r.compete.project_euler;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler020
 * 
 * @author Stéphan R.
 *
 */
public class FactorialDigitSum {
	
	private static BigInteger[] factorials = new BigInteger[1001];
	
	static void factorial() {		
		boolean[] tab = new boolean[1001];
		int index = 2;
		
		// Initial f(0) = f(1) = 1
		factorials[0] = BigInteger.ONE;
		factorials[1] = BigInteger.ONE;
		
		for(int i = 2; i < Math.sqrt(tab.length); i++) {
			if(!tab[i]) {
				for(int j = (i * i); j < tab.length; j += i) {
					tab[j] = true;
				}
			}
		}
		
		for(int n = 2; n < tab.length; n++) {
			BigInteger factorial = BigInteger.ONE;
			
			for(int i = 2; i < tab.length; i++) {
				if(!tab[i]) {
					int r = n;
					int power = 0;
					
					while(r > 1) {
						int count = 0;
						
						for(int x = i; x <= r; x += i) {
							count++;
						}
						
						r = count++;
						power += r;
					}
					
					factorial = factorial.multiply(BigDecimal.valueOf(i).pow(power).toBigInteger());
					
				}
			}
			
			factorials[index++] = factorial;
		}		
	}
	
	public static void main(String[] args) {
		factorial();
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < t; i++) {
			BigInteger m = factorials[scanner.nextInt()];
			BigInteger sum = BigInteger.ZERO;
			
			while(m.compareTo(BigInteger.ZERO) > 0) {				
				BigInteger n = m.mod(BigInteger.TEN);
	            sum = sum.add(n);
	            m = m.divide(BigInteger.TEN);
	        }
			
			System.out.println(sum);
		}
		
		System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
		
		scanner.close();
	}
}
