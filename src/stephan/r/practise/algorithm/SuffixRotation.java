package stephan.r.practise.algorithm;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/suffix-rotation/problem
 * 
 * @author stephan
 *
 */
public class SuffixRotation {

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	static int hammingDist(StringBuilder a, StringBuilder b) {
	    int i = 0;
	    int count = 0;
	    
	    while (i < a.length()) {
	        if (a.charAt(i) != b.charAt(i)) {
	        	count++;
	        }
	        
	        i++;
	    }
	    
	    return count;
	}
	
	/**
	 * @param s
	 * @return
	 */
	static int getMove(String s) {
		byte[] b = Arrays.copyOf(s.getBytes(), s.length());
		Arrays.sort(b);
		String n = new String(b);
		
		return (!s.equalsIgnoreCase(n)) ? hammingDist(new StringBuilder(s), new StringBuilder(new String(b))) : 0;
	}

	public static void main(String[] args) {
		System.out.println(getMove("abcdefghij"));
		System.out.println(getMove("acab"));
		System.out.println(getMove("baba"));
	}
}
