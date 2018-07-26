package stephan.r.practice.java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/valid-username-checker/problem
 * 
 * @author Stéphan R.
 *
 */
public class ValidUsernameRegularExpression {

	private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        
        while (n-- != 0) {
            System.out.println((scanner.nextLine().matches(UsernameValidator.regularExpression)) ? "Valid" : "Invalid");       
        }
    }
}

class UsernameValidator {
	// Just copy the following regular expression
	public static final String regularExpression = "^[a-zA-Z]{1}[A-Za-z0-9_]{7,29}$";	
}
