package stephan.r.practise.algorithm;

/**
 * https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
 * 
 * @author Stéphan R.
 *
 */
public class HackerrankIsAString {

	/**
	 * @param s
	 * @return
	 */
	static String hackerrankInString(String s) {
		String hacker = "";
		
		for (int i = 0; i < s.length(); i++) {
	        if (s.contains(String.valueOf('a')) || s.contains(String.valueOf('c')) || s.contains(String.valueOf('e'))
	        		|| s.contains(String.valueOf('h')) || s.contains(String.valueOf('k'))|| s.contains(String.valueOf('n')) 
	        		|| s.contains(String.valueOf('r'))) {
	        	hacker += String.valueOf(s.charAt(i));
	        }
	    }
		
		return hacker;
    }
	
	public static void main(String[] args) {
		String[] queries = new String[] {
				"hereiamstackerrank", "hackerworld"
		};
		
		for(int i = 0; i < queries.length; i++) {
			System.out.println(hackerrankInString(queries[i]));
		}
	}
}
