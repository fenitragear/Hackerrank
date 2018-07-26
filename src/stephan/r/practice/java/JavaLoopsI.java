package stephan.r.practice.java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-loops-i/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaLoopsI {
	
	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param n
	 */
	static void multiplicationTable(int n) {		
		for(int i = 1; i <= 10; System.out.println(String.format("%d x %d = %d", n, i, (n * i))), i++);
	}

    public static void main(String[] args) {
        multiplicationTable(scanner.nextInt());
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
    }
}
