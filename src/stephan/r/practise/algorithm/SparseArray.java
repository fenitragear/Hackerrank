package stephan.r.practise.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/sparse-arrays/problem
 * 
 * @author Stéphan R.
 *
 */
public class SparseArray {

	private static Map<String, Integer> memoization = new HashMap<String, Integer>();
	
	/**
	 * @param strings
	 * @param queries
	 * @return
	 */
	static void matchingStrings(String[] strings, String[] queries) {
		String str = String.join(" ", strings);
		
		for(int i = 0; i < queries.length; i++) {
			Integer count = memoization.get(queries[i]);
			
			if(count == null)  {
				Pattern pattern = Pattern.compile("(?=" + queries[i] + ")");
				Matcher matcher = pattern.matcher(" " + str + " ");
				count = 0;
				
				while(matcher.find()) {
					count++;
				}
				
				memoization.put(queries[i], count);
			}
			
			System.out.println(String.valueOf(count));
		}
    }
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		String[] strings = new String[] { "abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf" };
		String[] queries = new String[] { "abcde", "sdaklfj", "asdjf", "na", "basdn" };		
		matchingStrings(strings, queries);
        
        System.out.println("time passed " + (System.currentTimeMillis() - start) + "ms");
	}
}
