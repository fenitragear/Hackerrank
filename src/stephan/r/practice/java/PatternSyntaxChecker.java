package stephan.r.practice.java;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
 * 
 * @author Stéphan R.
 *
 */
public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = Integer.parseInt(scanner.nextLine());
        
		while(testCases > 0) {
			String pattern = scanner.nextLine();
          	
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
		}
		
		scanner.close();
	}
}
