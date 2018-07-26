package stephan.r.practice.algorithm;

import java.math.BigInteger;

/**
 * https://www.hackerrank.com/challenges/extra-long-factorials/problem
 * 
 * @author Stéphan R.
 *
 */
public class ExtraLongFactorial {
	
	/**
	 * n! = f(n) = n x (n - 1) x (n - 2) x ... x 3 x 2 x 1
	 * 
	 * @param n
	 * @return
	 */
	static BigInteger factorial(BigInteger n) {	   
		return (n.compareTo(BigInteger.valueOf(0)) != 0) ?
				n.multiply(factorial(n.subtract(BigInteger.valueOf(1)))) 
				: BigInteger.valueOf(1);
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(BigInteger.valueOf(25)));
	}
}
