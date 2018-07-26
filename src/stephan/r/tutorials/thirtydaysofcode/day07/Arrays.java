package stephan.r.tutorials.thirtydaysofcode.day07;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-arrays/problem
 * 
 * @author Stéphan R.
 *
 */
public class Arrays {

	private static final Scanner scanner = new Scanner(System.in);
	
	/**
	 * @param a
	 * @param length
	 */
	static void printInReverseOrder(int[] a, int length) {
		for(int i = (length - 1); i >= 0; i--) {
			System.out.print(a[i]);
			
			if(i >= 0) {
				System.out.print(" ");
			}
		}
	}

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
        }
        
        printInReverseOrder(arr, n);

        scanner.close();
    }
}
