package stephan.r.practice.algorithm;

/**
 * https://www.hackerrank.com/challenges/java-anagrams/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaAnagrams {
	
	/**
	 * Two strings A and B are possible anagrams whether their length are equals;
	 * and both strings are anagrams if we compute each character on A xored to each caracter on B and we get zero at last
	 * 
	 * Proof: a xor a = 0
	 * So if Strings A and B are anagrams each caracter will have their respective pair
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
	
	/**
	 * Test cases
	 * 
	 * @param args
	 */
	public static void main(String[] args) {		
		System.out.println((isAnagram("anagram", "margana")) ? "Anagrams" : "Not Anagrams");
		System.out.println((isAnagram("anagramm", "marganaa")) ? "Anagrams" : "Not Anagrams");
		System.out.println((isAnagram("Hello", "hello")) ? "Anagrams" : "Not Anagrams");
		System.out.println((isAnagram("o", "o")) ? "Anagrams" : "Not Anagrams");
		System.out.println((isAnagram("reviver", "reviver")) ? "Anagrams" : "Not Anagrams");
		System.out.println((isAnagram("sos", "sos")) ? "Anagrams" : "Not Anagrams");
		System.out.println((isAnagram("reviver", "reviverr")) ? "Anagrams" : "Not Anagrams");
	}
}
