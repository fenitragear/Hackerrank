package stephan.r.compete.project_euler;

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler017/problem
 * 
 * @author Stéphan R.
 *
 */
public class NumberToWord {

	/**
	 * Each number is store with their respective text-based format
	 * We don't need to specify all the numbers from 0 to one trillion 
	 * because many of their is result from a composite number. 
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
		put(40, "Forty"); put(50, "Fifty"); put(60, "Sixty"); put(70, "Seventy"); put(80, "Eighty"); put(90, "Ninety");
		put(100, "Hundred"); put(1000, "Thousand"); put(1000000, "Million"); put(1000000000, "Billion");
	}};

	/**
	 * @param n
	 * @return
	 */
	static String numberToWord(Long n) {
		StringBuilder txt = new StringBuilder();
		long reminder = 0;
		
		if(n < 20 || (n != 100 && n != 1000 && n != 1000000 && n != 1000000000 && words.get(n.intValue()) != null)) {
			return words.get(n.intValue());
		} else {			
			if(n == Math.pow(10, 12)) {
				txt.append("One Trillion");
			} else if(n >= Math.pow(10, 9) && n < Math.pow(10, 12)) {
				reminder = (long) (n % Math.pow(10, 9));
				txt.append(numberToWord((long) ((n - reminder) / Math.pow(10, 9)))).append(" ").append(words.get((int) Math.pow(10, 9)));
			} else if(n >= Math.pow(10, 6) && n < Math.pow(10, 9)) {
				reminder = (long) (n % Math.pow(10, 6));
				txt.append(numberToWord((long) ((n - reminder) / Math.pow(10, 6)))).append(" ").append(words.get((int) Math.pow(10, 6)));
			} else if(n >= Math.pow(10, 3) && n < Math.pow(10, 6)) {
				reminder = (long) (n % Math.pow(10, 3));
				txt.append(numberToWord((long) ((n - reminder) / Math.pow(10, 3)))).append(" ").append(words.get((int) Math.pow(10, 3)));
			} else if(n >= Math.pow(10, 2) && n < Math.pow(10, 3)) {
				reminder = (long) (n % Math.pow(10, 2));
				txt.append(words.get((int) ((n - reminder) / Math.pow(10, 2)))).append(" ").append(words.get((int) Math.pow(10, 2)));
			} else {
				if(n < Math.pow(10, 2)) {
					txt.append(words.get((int) (n - (n % 10))));
					
					if(n % 10 > 0) {
						txt.append(" ").append(words.get((int) (n % 10)));	
					}
				}
			}
		}
		
		return (reminder > 0) ? txt.append(" ").append(numberToWord(reminder)).toString() : txt.toString();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		for(int i = 0; i < t; i++) {
			long start = System.currentTimeMillis();
			
			System.out.println(numberToWord(scanner.nextLong()));
			System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
		}
		
		scanner.close();
	}
}
