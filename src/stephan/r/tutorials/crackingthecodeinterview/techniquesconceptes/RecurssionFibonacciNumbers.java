package stephan.r.tutorials.crackingthecodeinterview.techniquesconceptes;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem
 * 
 * @author Stéphan R.
 *
 */
public class RecurssionFibonacciNumbers {
	
	/**
	 * Fibonacci forumula:
	 * f(0) = 0
	 * f(1) = 1
	 * f(n) = f(n - 1) + f(n - 2)
	 * 
	 * @param n
	 * @return
	 */
	static int fibonacci(int n) {		
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}	      
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println(fibonacci(scanner.nextInt()));
        scanner.close();
	}
}
