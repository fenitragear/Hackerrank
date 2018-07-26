package stephan.r.compete.project_euler;

import java.util.HashMap;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler017/problem
 * 
 * @author Stéphan R.
 *
 */
public class NumberToWord {

	/**
	 * Each number are store with their respective text-based format
	 * We don't need to specify the numbers greater than 19 because it result from
	 * a composite number. 
	 * 
	 * eg: 21 -> 20(Twenty) + 1(One) or 29 -> 20(Twenty) + 9(Nine)
	 * 	   95 -> 90(Ninety) + 5(Five)
	 * 	   101 -> 1(One) * 100(Hundred) + 1(One)
	 * 	   450 -> 4(Four) * 100(Hundred) + 50(Fifty)
	 */
	private static final HashMap<Integer, String> words = new HashMap<Integer, String>() {{
		put(0, "Zero"); put(1, "One"); put(2, "Two"); put(3, "Three"); put(4, "Four"); put(5, "Five");
		put(6, "Six"); put(7, "Seven"); put(8, "Eight"); put(9, "Nine"); put(10, "Ten"); put(11, "Eleven");
		put(12, "Twelve"); put(13, "Thriteen"); put(14, "Fourteen"); put(15, "Fifteen"); put(16, "Sixteen");
		put(17, "Seventeen"); put(18, "Eighteen"); put(19, "Nineteen"); put(20, "Twenty"); put(30, "Thirty");
		put(40, "Fourty"); put(50, "Fifty"); put(60, "Sixty"); put(70, "Seventy"); put(90, "Ninety");
		put(100, "Hundred"); put(1000, "Tausand"); put(1000000, "Million"); put(1000000000, "Billion");
	}};
	
	/**
	 * @param a
	 * @param b
	 * 
	 * @return
	 */
	static String getWord(int a, int... b) {
		return (b.length > 0) 
				? String.format("%s %s", words.get(a), words.get(b[0])) 
				: words.get(a);
	}
	
	/*static int count(int n) {
		int sum = 0;
		int reminder = 0;
		
		if(n < 20 || words.get(n) != null) {
			return words.get(n);
		} else {			
			if(n > 999 && n < 10000) {
				reminder = n % 1000;
				sum += count((n - reminder) / 1000) + count(1000);
			} else if(n > 99 && n < 1000) {
				reminder = n % 100;
				sum += count((n - reminder) / 100) + count(100);
			} else {
				sum += count(n - (n % 10)) + count(n % 10);
			}
		}
		
		return (reminder > 0) ? sum + count(reminder) : sum;
	}*/
	
	public static void main(String[] args) {

	}
}
