package stephan.r.practice.java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaStdinAndStdOutI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        
        scanner.close();
	}
}
