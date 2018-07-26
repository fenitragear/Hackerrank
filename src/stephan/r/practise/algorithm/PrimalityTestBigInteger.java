package stephan.r.practise.algorithm;

import java.math.BigInteger;

public class PrimalityTestBigInteger {

	public static void main(String[] args) {
		try {
			String n = "4901971054862853523";
	        BigInteger res = new BigInteger(n);
	        System.out.print((res.isProbablePrime(100)) ? "" : "not ");
	        System.out.print("prime");
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
