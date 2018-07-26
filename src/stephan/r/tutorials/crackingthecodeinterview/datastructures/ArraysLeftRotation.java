package stephan.r.tutorials.crackingthecodeinterview.datastructures;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 * 
 * @author Stéphan R.
 *
 */
public class ArraysLeftRotation {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];
        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        boolean skipRotation = (d % n == 0) ? true : false;
        d = (skipRotation) ? 0 : (n - (d % n));
        
        for(int i = (n - 1); i >= 0; i--) {
            a[(i + d) % n] = Integer.parseInt(aItems[i]);
        }

        System.out.println(String.join(" ", 
            Arrays.toString(a).replace(",", "").replace("[", "").replace("]", ""))
                          );
        scanner.close();
    }
}
