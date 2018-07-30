package stephan.r.tutorials.thirtydaysofcode.day16;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem
 * 
 * @author Stéphan R.
 *
 */
public class ExceptionsStringToInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        try {
        	System.out.println(Integer.valueOf(scanner.next()));
        } catch(Exception e) {
        	System.out.println("Bad String");
        }
        
        scanner.close();
	}
}
