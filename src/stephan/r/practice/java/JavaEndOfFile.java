package stephan.r.practice.java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-end-of-file/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaEndOfFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int i = 1;
        
        while(scanner.hasNext()) {
            System.out.println(String.format("%d %s", i++, scanner.nextLine()));
        }
        
        scanner.close();
	}
}
