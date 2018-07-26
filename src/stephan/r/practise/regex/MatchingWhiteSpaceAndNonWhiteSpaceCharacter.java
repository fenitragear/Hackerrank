package stephan.r.practise.regex;

/**
 * https://www.hackerrank.com/challenges/matching-whitespace-non-whitespace-character/problem
 * 
 * @author Stéphan R.
 *
 */
public class MatchingWhiteSpaceAndNonWhiteSpaceCharacter {

	/**
	 * Match the patttern XXxXXxXX
	 * where x denotes whitespace characters, and X denotes non-white 
	 * spcace characters
	 */
	private static final String regex = "(\\S{2}\\s\\S{2}\\s\\S{2})";
}
