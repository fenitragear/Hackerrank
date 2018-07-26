package stephan.r.practice.regex;

/**
 * https://www.hackerrank.com/challenges/matching-specific-characters/problem
 * 
 * @author Stéphan R.
 *
 */
public class MatchingSpecificCharacters {

	/**
	 * Match the string S with the following conditions:
	 *		1/ S must be of length 6
	 *		2/ First character: 1, 2 or 3
	 *		3/ Second character: 1, 2 or 0
	 *		4/ third character: x, s or 0
	 *		5/ fourth character: 3, 0, A or a
	 *		6/ Fifth character: x, s or u
	 *		7/ Sixth character: . or ,
	 */
	private static final String regex = "^[1-3]{1}[0-2]{1}[xs0]{1}[30Aa]{1}[xsu]{1}[\\\\.,]{1}$";
}
