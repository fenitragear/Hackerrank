package stephan.r.practise.algorithm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sansa-and-xor/problem
 * 
 * @author Stéphan R.
 *
 */
public class SansaAndXor {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	/**
	 * @param arr
	 * @return
	 */
	static int sansaXor(int[] arr) {
		int length = arr.length;
		int sumXored = 0;

		if(length % 2 != 0) {
			for(int i = 0; i < length; i++) {
				if(i % 2 == 0) {
					sumXored ^= arr[i];
				}
			}
		}

		return sumXored;
    }

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(arrItems[i]);
            }

            int result = sansaXor(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
	}
}
