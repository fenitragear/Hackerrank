package stephan.r.practice.algorithm;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange/problem
 * 
 * @author Stéphan R.
 *
 */
public class AppleAndOrange {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");
        int s = Integer.parseInt(st[0]);
        int t = Integer.parseInt(st[1]);
        
        String[] ab = scanner.nextLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        
        String[] mn = scanner.nextLine().split(" ");
        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);
        int[] apples = new int[m];

        int countApples = 0;
		int countOranges = 0;
        
        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            apples[i] = Integer.parseInt(applesItems[i]);
            int posApple = a + apples[i];
            
            if(posApple >= s && posApple <= t) {
				countApples++;
			}	
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            oranges[i] = Integer.parseInt(orangesItems[i]);
            int posOrange = b + oranges[i];
            
            if(posOrange >= s && posOrange <= t) {
				countOranges++;
			}
        }

        // Ouptut
        System.out.println(countApples);
		System.out.println(countOranges);

        scanner.close();
    }
}
