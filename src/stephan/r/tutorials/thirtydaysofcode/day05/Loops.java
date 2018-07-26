package stephan.r.tutorials.thirtydaysofcode.day05;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-loops/problem
 * 
 * @author Stéphan R.
 *
 */
public class Loops {
	
	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param n
	 */
	static void multiplicationTable(int n) {		
		for(int i = 1; i <= 10; i++) {
			System.out.println(String.format("%d x %d = %d", n, i, (n * i)));
		}
	}

    public static void main(String[] args) {
        multiplicationTable(scanner.nextInt());
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}
