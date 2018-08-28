package stephan.r.compete.project_euler;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler004
 * 
 * @author Stéphan R.
 *
 */
public class LargestPalindromeProduct {
	
	/**
	 * Calculating reverse of product
	 * to check whether it is palindrome or not
	 * 
	 * @param n
	 * @return
	 */
	static boolean isPalindrome(int n) {
		int number = n;
        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        
        return (n == reverse);
	}
	
	/**
	 * @param n
	 * @return
	 */
	static int find(int n) {
		int maxPalindrome = 0;
		
        for(int i = 999; i >= 100; i--) {
        	for(int j = i; j >= 100; j--) {
        		int product = i * j;
        		
        		if (product < maxPalindrome)
                    break;
        		
                if (isPalindrome(product) && product > maxPalindrome && product < n)
                	maxPalindrome = product;
        	}
        	
        }
		
		return maxPalindrome;
	}

	public static void main(String[] args) {
		long start = System.nanoTime();
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		for(int i = 0; i < t; i++) {
			System.out.println(find(scanner.nextInt()));
		}
		
		scanner.close();
				
		long end = System.nanoTime();
		System.out.println("Solution took " + ((end - start) / 1000000) + "ms");
	}
}