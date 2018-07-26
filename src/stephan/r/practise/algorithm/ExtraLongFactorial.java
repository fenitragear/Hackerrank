package stephan.r.practise.algorithm;

import java.math.BigInteger;

public class ExtraLongFactorial {
	
	/**
	 * n! = f(n) = n x (n - 1) x (n - 2) x ... x 3 x 2 x 1
	 * 
	 * @param n
	 * @return
	 */
	static BigInteger factorial(BigInteger n) {	   
		return (n.compareTo(BigInteger.valueOf(0)) != 0) ? n.multiply(factorial(n.subtract(BigInteger.valueOf(1))))  : BigInteger.valueOf(1);
	}
	
	/**
	 * @param n
	 */
	static void extraLongFactorials(BigInteger n) {
		System.out.println(factorial(n));
    }

	public static void main(String[] args) {
		extraLongFactorials(BigInteger.valueOf(25));
	}
}
