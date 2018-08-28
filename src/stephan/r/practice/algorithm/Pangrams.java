package stephan.r.practice.algorithm;

/**
 * https://www.hackerrank.com/challenges/pangrams/problem
 * 
 * @author St�phan R.
 *
 */
public class Pangrams {

	private static final int ASCII_SUM_ALPHABET_IN_LOWER_CASE = 2847;
	
	/**
	 * @param s
	 * @return
	 */
	static String pangrams(String s) {
		s = s.toLowerCase().replaceAll("\\s", "");
		String result = new String("");
		int sumByte = 0;

	    for (int i = 0; i < s.length(); i++) {
	        if (!result.contains(String.valueOf(s.charAt(i)))) {
	            result += s.charAt(i);
	            sumByte += String.valueOf(s.charAt(i)).getBytes()[0];
	        }
	    }
		
		return (sumByte == ASCII_SUM_ALPHABET_IN_LOWER_CASE) ? "pangram" : "not pangram";
    }
	
	public static void main(String[] args) {
		System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
		System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
	}
}
