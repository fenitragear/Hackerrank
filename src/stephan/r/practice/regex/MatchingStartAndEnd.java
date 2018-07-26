package stephan.r.practice.regex;

/**
 * https://www.hackerrank.com/challenges/matching-start-end/problem
 * 
 * @author Stéphan R.
 *
 */
public class MatchingStartAndEnd {

	/**
	 * Match the pattern Xxxxx
	 * where x denotes a word character, and X a digit
	 * The string must start with a digit X and end with . symbol
	 * The string should be 6 characters long only
	 */
	private static final String regex = "^[0-9]{1}(\\\\w){4}\\\\.$";
}
