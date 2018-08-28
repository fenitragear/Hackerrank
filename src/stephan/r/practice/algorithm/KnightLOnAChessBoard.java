package stephan.r.practice.algorithm;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/knightl-on-chessboard/problem
 * TODO
 * 
 * @author Stéphan R.
 *
 */
public class KnightLOnAChessBoard {
	
	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param n
	 * @return
	 */
	static int[][] knightlOnAChessboard(int n) {
		int[][] path = new int[n][n];
				
		return path;
    }
    
	public static void main(String[] args) {		
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] result = knightlOnAChessboard(n);
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
            	System.out.print(String.valueOf(result[i][j]));

                if (j != result[i].length - 1) {
                	System.out.print(" ");
                }
            }

            if (i != result.length - 1) {
            	System.out.print("\n");
            }
        }

	}
}
