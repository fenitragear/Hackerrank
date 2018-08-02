package stephan.r.compete.project_euler;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler008
 * 
 * @author Stéphan R.
 *
 */
public class LargestProductInASeries {

	static BigInteger classicDigitSum(BigInteger x) {
		BigInteger sum = BigInteger.ONE;
		
		while(x.compareTo(BigInteger.ZERO) > 0) {				
			BigInteger n = x.mod(BigInteger.TEN);
			
			if(n.compareTo(BigInteger.ZERO) == 0) {
				sum = BigInteger.ZERO;
				break;
			}
			
            sum = sum.multiply(n);
            x = x.divide(BigInteger.TEN);
        }
		
		return sum;
	}
	
	static BigInteger largestProduct(String digits, int n, int k) {
		BigInteger productMax = BigInteger.ZERO;
		
		for(int i = 0; i < n; i++) {
			if((i + k) <= n) {
				BigInteger currentProductAdjacent = classicDigitSum(new BigInteger(digits.substring(i, k + i)));
				productMax = (productMax.compareTo(currentProductAdjacent) < 0) ? currentProductAdjacent : productMax;		
			}			
		}
		
		return productMax;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			
			System.out.println(largestProduct(scanner.next(), n, k));
		}
		
		System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
		
		scanner.close();
	}
}
