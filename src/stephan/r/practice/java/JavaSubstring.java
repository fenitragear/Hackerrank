package stephan.r.practice.java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-substring/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaSubstring {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        System.out.println(s.substring(start, end));
        scanner.close();
	}
}
