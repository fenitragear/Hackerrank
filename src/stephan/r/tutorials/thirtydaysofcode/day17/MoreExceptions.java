package stephan.r.tutorials.thirtydaysofcode.day17;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-more-exceptions/problem
 * 
 * @author Stéphan R.
 *
 */
public class MoreExceptions {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {        
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            Calculator myCalculator = new Calculator();
            
            try {
                System.out.println(myCalculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        scanner.close();
	}
}

class Calculator {
	
	public int power(int n, int p) {
		if(n < 0 || p < 0) {
			throw new IllegalArgumentException("n and p should be non-negative");
		}
		
		return (int) Math.pow(n, p);
	}
}