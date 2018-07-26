package stephan.r.practise.regex;

/**
 * https://www.hackerrank.com/challenges/matching-x-repetitions/problem
 * 
 * @author Stéphan R.
 *
 */
public class MatchingXRepetitions {

	/**
	 * Match string S using the following conditions:
	 * 		1/ S must be of length equal to 45
	 * 		2/ The first 40 characters should consist of letters (both
	 * 			lowercase and uppercase), or of even digits
	 * 		3/ The last 5 characters should consist of odd digits or
	 * 			whitespace characters
	 */
	private static final String regex = "^[aA-zZ02468]{40}[\\s13579]{5}$";
}
