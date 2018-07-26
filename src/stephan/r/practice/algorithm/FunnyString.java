package stephan.r.practice.algorithm;

/**
 * https://www.hackerrank.com/challenges/funny-string/problem
 * 
 * @author Stéphan R.
 *
 */
public class FunnyString {
	
	/**
	 * @param s
	 * @return
	 */
	static String funnyString(String s) {
		int length = s.length();
		byte[] b = s.getBytes();
		int adjacentDifference = 0;
		
		for(int i = 0; i < length - 1; i++) {
			adjacentDifference += Math.abs(b[i] - b[i + 1]) ^ Math.abs(b[length - (i + 2)] - b[length - (i + 1)]);
		}
		
		return (adjacentDifference == 0) ? "Funny" : "Not Funny";
	}
	
	public static void main(String[] args) {
		String[] queries = new String[] {
				"acxz", "bcxz"
		};
		
		for(int q = 0; q < queries.length; q++) {
			System.out.println(funnyString(queries[q]));
		}
	}
}
