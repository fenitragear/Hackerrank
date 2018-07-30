package stephan.r.tutorials.thirtydaysofcode.day20;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-sorting/problem
 * 
 * @author Stéphan R.
 *
 */
public class Sorting {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        int tallyCount = 0;
        
        for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;
            
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {                    
                    a[j] ^= a[j + 1];
                    a[j + 1] ^= a[j];
            		a[j] ^= a[j + 1];
            		
                    numberOfSwaps++;
                }
            }
            
            if (numberOfSwaps == 0) {
                break;
            }
            
            tallyCount += numberOfSwaps;
        }
        
        System.out.printf("Array is sorted in %d swaps.%n", tallyCount);
        System.out.printf("First Element: %d%n", a[0]);
        System.out.printf("Last Element: %d", a[a.length - 1]);
        
        scanner.close();
	}
}

