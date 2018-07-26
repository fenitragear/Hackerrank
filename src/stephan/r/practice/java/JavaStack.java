package stephan.r.practice.java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-stack/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaStack {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
            String input = scanner.next();
            
            while(input.length() != (
                input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length()
            );
            
            System.out.println(input.isEmpty());
		}
		
		scanner.close();
	}
}
