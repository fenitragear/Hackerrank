package stephan.r.practice.java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-1d-array-introduction/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaOneDArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        
        scanner.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
	}
}
