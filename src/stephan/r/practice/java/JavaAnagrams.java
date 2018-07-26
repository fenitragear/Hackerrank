package stephan.r.practice.java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-anagrams/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaAnagrams {

	/**
	 * Two strings A and B are possible anagrams whether their length are equals
	 * And both strings are anagrams if we compute each character on A xored to 
     * each caracter on B and we get zero at last
	 * 
	 * Proof: a xor a = 0, so if Strings A and B are anagrams each caracter will 
     * have their respective pair
	 * 
	 * @param a
	 * @param b
	 * 
	 * @return
	 */
	static boolean isAnagram(String a, String b) {
		int sumXored = -1;
		
		if(a.length() == b.length()) {
			byte[] aByte = a.toLowerCase().getBytes();
			byte[] bByte = b.toLowerCase().getBytes();
			sumXored = 0;
			
			for(int i = 0; i < a.length(); i++) {
				sumXored ^= (aByte[i] ^ bByte[i]);
			}
		}
		
        return (sumXored == 0) ? true : false;
    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println((isAnagram(scanner.next(), scanner.next())) ? "Anagrams" : "Not Anagrams" );
        scanner.close();
	}
}
