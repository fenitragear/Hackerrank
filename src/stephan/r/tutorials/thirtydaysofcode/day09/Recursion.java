package stephan.r.tutorials.thirtydaysofcode.day09;

/**
 * https://www.hackerrank.com/challenges/30-recursion/problem
 * 
 * @author Stéphan R.
 *
 */
public class Recursion {

	/**
	 * n! = n x (n - 1) x (n - 2) x ... x 3 x 2 x 1
	 * 
	 * @param n
	 * @return
	 */
	static int factorial(int n) {
		return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(12));
	}
}
