package stephan.r.practice.java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-reverse/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaStringReverse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        
        System.out.println((A.equalsIgnoreCase(new StringBuilder(A).reverse().toString())) ? "Yes" : "No");
        scanner.close();
	}
}
