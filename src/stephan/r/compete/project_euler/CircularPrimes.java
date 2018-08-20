package stephan.r.compete.project_euler;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler035/problem
 * 
 * @author Stéphan R.
 *
 */
public class CircularPrimes {

	private static int[] primes;
	private static boolean[] tab;
		
	static boolean isCircular(char[] arr, int length, int shift) {
		boolean skipRotation = (shift % length == 0) ? true : false;
		boolean isCircular = false;
		shift = (skipRotation) ? 1 : shift % length;

		for(int r = 0; r < length; r++) {
			for(int i = 0; i < length; i++) {
				if(i != length - 1) {
					int a = Character.getNumericValue(arr[i]);
					int b = Character.getNumericValue(arr[length - 1]);
					
					arr[i] = String.valueOf(b).toCharArray()[0];
					arr[length - 1] = String.valueOf(a).toCharArray()[0];
				}
			}
			
			Integer rotateResult = Integer.parseInt(String.join(" ", Arrays.toString(arr).replace(",", "").replace("[", "").replace("]", "")).replace(" ", ""));
						
			if(rotateResult <= tab.length) {
				if(tab[rotateResult] || rotateResult.toString().length() != length) {
					isCircular = true;
					break;
				}
				
				isCircular = tab[rotateResult];
			}
		}
		
		return isCircular;
	}
	
	static void loadPrimes() {
		int index = 0;
		
		for(int i = 2; i < Math.sqrt(primes.length); i++) {
			if(!tab[i]) {
				for(int j = (i * i); j < primes.length; j += i) {
					tab[j] = true;
				}
			}
		}
		
		for(int f = 2; f < tab.length; f++) {        	
        	if(!tab[f]) {
        		primes[index++] = f;       		
        	}
        }
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
				
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		
		primes = new int[n];
		tab = new boolean[primes.length];
		
		loadPrimes();
		
		scanner.close();
		
		for(int i = 0; i < primes.length; i++) {
			if(primes[i] != 0) {
				if(!tab[primes[i]]) {
					char[] array = String.valueOf(primes[i]).toCharArray();
										
					if(!isCircular(array, array.length, array.length)) {
						sum += primes[i];
					}
				}
			} else {
				break;
			}
		}
		
		System.out.println(sum);
		System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
	}
}
