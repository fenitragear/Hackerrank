package stephan.r.compete.project_euler;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler013
 * 
 * @author Stéphan R.
 *
 */
public class LargeSum {
		
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Scanner scanner = new Scanner(System.in);
		BigInteger sum = BigInteger.ZERO;
		int n = scanner.nextInt();		
		scanner.nextLine();
		
		for(int i = 0; i < n; i++) {
			sum = sum.add(scanner.nextBigInteger());
		}
		
		System.out.println(sum.toString().substring(0, 10));
		System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
		
		scanner.close();
	}
}
