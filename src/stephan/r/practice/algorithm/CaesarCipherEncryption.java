package stephan.r.practice.algorithm;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/caesar-cipher-1/problem
 * https://www.hackerrank.com/challenges/linkedin-practice-caesar-cipher/problem
 * 
 * @author Stéphan R.
 *
 */
public class CaesarCipherEncryption {

	private static final Scanner scanner = new Scanner(System.in);
	
	/**
	 * Caesar's cipher: rotate current character position by k
	 * 
	 * @param s
	 * @param k
	 * @return
	 */
	static String caesarCipher(String s, int k) {
		byte[] b = s.getBytes();
		boolean isUpperCase = false;
		
		for(int i = 0; i < b.length; i++) {
			isUpperCase = (b[i] > 64 && b[i] < 91) ? true : false;
			b[i] = (byte) ((b[i] >= 97 && b[i] <= 122) ? b[i] - 97 
					: (b[i] >= 65 && b[i] <= 90) ? b[i] - 65 : b[i]);
			
			if(b[i] >= 0 && b[i] <= 26) {
				b[i] = (byte) ((isUpperCase) ? ((b[i] + k) % 26) + 65 : ((b[i] + k) % 26) + 97);
			}
		}
		
		return new String(b);
    }
	
	public static void main(String[] args) {
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(caesarCipher(scanner.nextLine(), scanner.nextInt()));
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
	}
}
