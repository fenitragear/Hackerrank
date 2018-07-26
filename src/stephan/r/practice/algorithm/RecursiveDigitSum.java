package stephan.r.practice.algorithm;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/recursive-digit-sum/problem
 * 
 * @author Stéphan R.
 *
 */
public class RecursiveDigitSum {
	
	private static final Scanner scanner = new Scanner(System.in);

	static int superDigit(String a) {
		if(Integer.valueOf(a) < 10)
			return Integer.valueOf(a);
		
		Integer sum = 0;
		
		for(int i = 0; i < a.length(); i++) {
			sum += Integer.parseInt(String.valueOf(a.charAt(i)));
		}
		
		return superDigit(sum.toString());
	}
	
	/**
	 * @param n
	 * @param k
	 * @return
	 */
	static int superDigit(String n, int k) {
		return superDigit(n);
    }

	public static void main(String[] args) {
		String[] nk = scanner.nextLine().split(" ");
        System.out.println(superDigit(nk[0], Integer.parseInt(nk[1])));

        scanner.close();
	}
}
