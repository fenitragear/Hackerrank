package stephan.r.compete.project_euler;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler030
 * 
 * @author Stéphan R.
 *
 */
public class DigitFIfthPowers {

	static int sum(int p) {
		int sumFifth = 0;
		
		for(int i = 2; i < ((p + 1) * Math.pow(9, p)); i++) {
			int sum = 0;
			int m = i;
			
			while(m > 0) {				
				int n = m % 10;	            
	            m /= 10;
	            sum += Math.pow(n, p);
	        }
			
			if(i == sum) {
				sumFifth += i;
			}
		}
		
		return sumFifth;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		long start = System.currentTimeMillis();
		
		System.out.println(sum(scanner.nextInt()));
		System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
		scanner.close();
	}
}
