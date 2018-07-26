package stephan.r.compete.project_euler;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler001
 * 
 * @author Stéphan R.
 *
 */
public class MultipleOf3And5 {
	
	/**
	 * @param n
	 * @return
	 */
	static long sumOfMultipleOf3And5(int n) {
		long sum = 0;
		long p = (n - 1) / 3;
	    sum = ((3 *p * (p + 1)) / 2);

	    p = (n - 1) / 5;
	    sum = sum + ((5 * p * (p + 1)) / 2);

	    p = (n - 1) / 15;
	    sum = sum - ((15 * p * (p + 1)) / 2);
				
		return sum;
	}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for(int i = 0; i < t; i++) {
            System.out.println(sumOfMultipleOf3And5(scanner.nextInt()));
        }
        
        scanner.close();
	}
}
