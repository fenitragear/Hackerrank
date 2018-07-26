package stephan.r.practise.regex;

/**
 * https://www.hackerrank.com/challenges/matching-zero-or-more-repetitions/problem
 * 
 * @author Stéphan R.
 *
 */
public class MatchingZeroOrMoreRepetitions {

	/**
	 * Match string S using the following conditions:
	 * 		1/ S should begin with 2 or more digits
	 * 		2/ After that, S should have 0 or more lowercase letters
	 * 		3/ S should end with 0 or more uppercase letters
	 */
	private static final String regex = "^\\d{2,}\\p{Ll}*\\p{Lu}*$";
}
