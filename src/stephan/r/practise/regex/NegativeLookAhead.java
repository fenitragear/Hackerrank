package stephan.r.practise.regex;

/**
 * https://www.hackerrank.com/challenges/negative-lookahead/problem
 * 
 * @author Stéphan R.
 *
 */
public class NegativeLookAhead {

	/**
	 * Match all characters which are not immediately followed by that same character
	 */
	private static final String regex = "(.)(?!\\1)";
}
