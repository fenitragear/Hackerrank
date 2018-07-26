package stephan.r.practice.java;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-primality-test/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaPrimalityTest {

	 private static final Scanner scanner = new Scanner(System.in);
	 
	 public static void main(String[] args) {	     
	     System.out.print((new BigInteger(scanner.nextLine()).isProbablePrime(100)) ? "" : "not ");
	     System.out.print("prime");
	       
	     scanner.close();
	 }
}
