package stephan.r.compete.project_euler;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler016
 * 
 * @author Stéphan R.
 *
 */
public class PowerDigitSum {

	private static BigInteger[] powers = new BigInteger[10001];
	
	/**
	 * Digit sum formula:
	 * 		For n = 0 ... log10(n)
	 * 			1/b^n * (x mod b^(n + 1) - x mod b^n)
	 * 
	 * Where
	 * 		x is the number to calculate the digit
	 * 		b is the base
	 *  
	 * @param powerDigit
	 * 
	 * @return
	 */
	static int sum(BigInteger powerDigit) {
		BigDecimal sum = BigDecimal.ZERO;
		long lim = Math.round(Math.log10(powerDigit.doubleValue()));
				
		for(int i = 0; i <= lim; i++) {		
			BigDecimal a = BigDecimal.ONE.divide(BigDecimal.TEN.pow(i));
			BigInteger b = powerDigit.mod(BigDecimal.TEN.pow(i + 1).toBigInteger());
			BigInteger c = powerDigit.mod(BigDecimal.TEN.pow(i).toBigInteger());
			
			sum = sum.add(a.multiply(new BigDecimal(b.subtract(c))));
		}		
		
		return sum.intValue();
	}
	
	static void power() {
		for(int i = 0; i < 10001; i++) {
			powers[i] = BigInteger.valueOf(2).pow(i);
		}
	}
	
	public static void main(String[] args) {
		power();
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		
		for(int i = 0; i < t; i++) {
			int p = scanner.nextInt();
			long start = System.currentTimeMillis();
			
			System.out.println(sum(powers[p]));
			System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
		}
		
		scanner.close();
	}
}
