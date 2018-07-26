package stephan.r.practise.regex;

/**
 * https://www.hackerrank.com/challenges/matching-x-y-repetitions/problem
 * 
 * @author Stéphan R.
 *
 */
public class MatchingXYRepetitions {

	/**
	 * Match string S using the following conditions:
	 * 		1/ S should begin with 1 or 2 digits
	 * 		2/ After that, S should have 3 or more letters (both lowercase
	 * 			and uppercase)
	 * 		3/ Then S should end with up to 3 . symbol(s). You can end with
	 * 			0 to 3 . symbol(s), inclusively
	 */
	private static final String regex = "^\\d{1,2}\\p{L}{3,}\\.{0,3}$";
}
