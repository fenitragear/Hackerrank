package stephan.r.practice.java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-output-formatting/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
    
        for(int i = 0; i < 3; i++) {
            System.out.println(String.format("%-15.15s%03d", scanner.next(), scanner.nextInt()));
        }
    
        System.out.println("================================");
        
        scanner.close();
	}
}
