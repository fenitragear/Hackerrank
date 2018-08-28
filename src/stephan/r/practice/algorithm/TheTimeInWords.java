package stephan.r.practice.algorithm;

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/the-time-in-words/problem
 * 
 * @author Stéphan R.
 *
 */
public class TheTimeInWords {

	/**
	 * Each number from 0 to 30 is store with their respective text-based format
	 * Special case for 0, 15, and 30 because they refers each to "o'clock", "quarter", and "half"
	 * in that order
	 * We don't need to specify the numbers between 20 and 30 exclusive because it result from
	 * a composite number. eg: 21 -> 20(twenty) + 1(one) or 29 -> 20(twenty) + 9(nine)
	 * Also, we don't need to specify the numbers greater than 30 because it will be subtract
	 * by 60
	 */
	@SuppressWarnings("serial")
	private static final HashMap<Integer, String> numberToText = new HashMap<Integer, String>() {{
		put(0, "o' clock"); put(1, "one"); put(2, "two"); put(3, "three"); put(4, "four"); put(5, "five");
		put(6, "six"); put(7, "seven"); put(8, "eight"); put(9, "nine"); put(10, "ten");
		put(11, "eleven"); put(12, "twelve"); put(13, "thirteen"); put(14, "fourteen");
		put(15, "quarter"); put(17, "seventeen"); put(18, "eighteen"); put(19, "nineteen");
		put(20, "twenty"); put(30, "half");
	}};
	private static final Scanner scanner = new Scanner(System.in);
	
	/**
	 * @param a
	 * @param b
	 * 
	 * @return the number in text-based format
	 */
	static String getWord(int a, int... b) {
		return (b.length > 0) ? String.format("%s %s", numberToText.get(a), numberToText.get(b[0])) 
				: numberToText.get(a);
	}
	
	/**
	 * Time format: mm hh except when minute is zero
	 * thus the second format is hh mm where mm denoting the "o'clock" keyword
	 * 
	 * 1 minute -> 30 minutes: refers it, directly, to the map table
	 * 30 minutes -> 60 minutes: Subtract 60 with the current minutes; then refers
	 * it to the map table
	 * 
	 * @param h is the hour
	 * @param m is the minute
	 * 
	 * @return the time in words
	 */
	static String timeInWords(int h, int m) {
		boolean moreThanAQuarter = m > 30;		
		String s = moreThanAQuarter ? "to" : "past";
		m = moreThanAQuarter ? 60 - m : m;
		h = moreThanAQuarter ? (h + 1 <= 12) ? h + 1 : 1 : h;
		int reminder = (m > 20 && m <= 29) ? m % 20 : 0;
		
		// Special case: permut both values
		if(m == 0) {
			h ^= m;
			m ^= h;
			h ^= m;
		}
		
		return (h != 0 && m != 15 && m != 30) ? String.format("%s minute%s %s %s", 
				(reminder != 0) ? getWord(m - reminder, reminder) : getWord(m), (m > 1) ? "s" : "", s, getWord(h))
				: (h == 0) ? String.format("%s %s", (reminder != 0) ? getWord(m - reminder, reminder) : getWord(m), getWord(h)) 
				: String.format("%s %s %s", (reminder != 0) ? getWord(m - reminder, reminder) : getWord(m), s, getWord(h));
    }
    
	public static void main(String[] args) {
		int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(timeInWords(h, m));
        scanner.close();
	}
}
