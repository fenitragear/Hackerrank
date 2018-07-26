package stephan.r.practice.regex;

/**
 * https://www.hackerrank.com/challenges/negative-lookbehind/problem
 * 
 * @author Stéphan R.
 *
 */
public class NegativeLookBehind {

	/**
	 * Match all occurences of characters which are not
	 * immediately preceded by vowels (a, e, i, o, u, A, E, I, O, U)
	 */
	private static final String regex = "(?<![aeiouAEIOU]).";
}
