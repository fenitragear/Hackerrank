package stephan.r.compete.project_euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler059/problem
 * 
 * @author Stéphan R.
 *
 */
public class XorDecryption {
	
private static byte[] cipher;
	
	private static List<Integer> acceptableValue = new ArrayList<Integer>() {{
		// A-Z
		add(65); add(66); add(67); add(68); add(69); add(70); add(71); add(72); add(73); add(74); add(75);
		add(76); add(77); add(78); add(79); add(80); add(81); add(82); add(83); add(84); add(85); add(86);
		add(87); add(88); add(89); add(90);
		 
		// a-z
		add(97); add(98); add(99); add(100); add(101); add(102); add(103); add(104); add(105); add(106); add(107);
		add(108); add(109); add(110); add(111); add(112); add(113); add(114); add(115); add(116); add(117); add(118);
		add(119); add(120); add(121); add(122);
		
		// (;:,.'?-!)space
		add(40); add(59); add(58); add(44); add(46); add(39); add(63); add(45); add(33); add(41); add(32);
		
		// 0-9
		add(48); add(49); add(50); add(51); add(52); add(53); add(54); add(55); add(56); add(57);
	}};
	
	/**
	 * 
	 */
	static void analyze() {
		byte[] keys = new byte[3];
		byte[] cipherCopy = Arrays.copyOf(cipher, cipher.length);
				
		for(int k = 0; k < keys.length; k++) {
			for(byte key = 97; key <= 122; key++) {		
				boolean isProbableKey = true;
				
				for(int j = k; j < cipherCopy.length; j += 3) {
					cipherCopy[j] ^= key;
					
					if((j == 0 && cipherCopy[j] == 32) || !acceptableValue.contains((int) cipherCopy[j])) {
						isProbableKey = false;
						cipherCopy = Arrays.copyOf(cipher, cipher.length);
						
						break;
					}
				}
				
				if(isProbableKey) {
					keys[k] = key;
					cipher = Arrays.copyOf(cipherCopy, cipher.length);
					
					break;
				}
			}
		}
		
		System.out.println("decrypted => " + new String(cipher));
		System.out.println("key => " + new String(keys));
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
				
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		cipher = new byte[n];
		
		for(int i = 0; i < n; i++) {
			cipher[i] = scanner.nextByte();
		}
		
		scanner.close();
		
		analyze();
		
		System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
	}
}
