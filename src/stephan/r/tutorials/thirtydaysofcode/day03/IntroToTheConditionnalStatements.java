package stephan.r.tutorials.thirtydaysofcode.day03;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-conditional-statements/problem
 * 
 * @author Stéphan R.
 *
 */
public class IntroToTheConditionnalStatements {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(N % 2 != 0) {
            System.out.println("Weird");
        } else {
            if(N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if(N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
        
        // Another way to do this
        System.out.println((N % 2 != 0) ? "Weird" : (N >= 2 && N <= 5) ? "Not Weird" : (N >= 6 && N <= 20) ? "Weird" : "Not Weird");

        scanner.close();
    }
}
