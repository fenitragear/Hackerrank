package stephan.r.compete.project_euler;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler002
 * 
 * @author Stéphan R.
 *
 */
public class EvenFibonacciNumber {

	/**
	 * @param n
	 * @return
	 */
	static BigInteger sumEvenNumber(BigInteger n) {
		// Store even fibonacci number less than 100
		List<BigInteger> memoization = new LinkedList<>();
		memoization.add(0, BigInteger.valueOf(2));
		memoization.add(1, BigInteger.valueOf(8));
				
		BigInteger sumEvenNumber = memoization.get(0).add(memoization.get(1));
		BigInteger currentEvenNumber = BigInteger.valueOf(0);
		int i = 2;
		
		if(n.compareTo(BigInteger.valueOf(10)) > 0) {
			while(BigInteger.valueOf(i).compareTo(n) <= 0) {
				currentEvenNumber = memoization.get(i - 2).add(memoization.get(i - 1).add(memoization.get(i - 1)
						.add(memoization.get(i - 1).add(memoization.get(i - 1)))));
				
				if(currentEvenNumber.compareTo(n) >= 0) {
					break;
				} else {
					memoization.add(i, currentEvenNumber);
					sumEvenNumber = sumEvenNumber.add(memoization.get(i));
					i++;
				}				
			}
		} else {
			sumEvenNumber = (n.compareTo(BigInteger.valueOf(8)) >= 0) ? sumEvenNumber : sumEvenNumber.subtract(memoization.get(i));
		}
		
		return sumEvenNumber;
	}

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for(int a0 = 0; a0 < t; a0++){
            System.out.println(sumEvenNumber(scanner.nextBigInteger()));
        }
        
        scanner.close();
	}
}
