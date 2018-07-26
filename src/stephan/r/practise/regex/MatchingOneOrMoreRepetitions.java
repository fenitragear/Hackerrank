package stephan.r.practise.regex;

/**
 * https://www.hackerrank.com/challenges/matching-one-or-more-repititions/problem
 * 
 * @author Stéphan R.
 *
 */
public class MatchingOneOrMoreRepetitions {

	/**
	 * Mathc string S using the following conditions:
	 * 		1/ S should begin with 1 or more digits
	 * 		2/ After that, S should have 1 or more uppercase letters
	 * 		3/ S should end with 1 or more lowercase letters
	 */
	private static final String regex = "^\\d+\\p{Lu}+\\p{Ll}+$";
}
