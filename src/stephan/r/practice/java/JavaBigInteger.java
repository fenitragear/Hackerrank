package stephan.r.practice.java;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-biginteger/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaBigInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        
        scanner.close();
	}
}
