package stephan.r.practise.regex;

/**
 * https://www.hackerrank.com/challenges/matching-word-boundaries/problem
 * 
 * @author Stéphan R.
 *
 */
public class MatchingWordBoundaries {

	/**
	 * Match word starting with vowel (a, e, i, o, u, A, E, I, O, U)
	 * The matched word can be of any length. The matched word should 
	 * consist of letters (lowercase and uppercase both) only. The matched
	 * word must start and end with a word boundary.
	 */
	private static final String regex = "\\b[aeiouAEIOU][A-Za-z]*\\b";
}
