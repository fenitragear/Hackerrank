package stephan.r.practice.regex;

/**
 * https://www.hackerrank.com/challenges/matching-word-non-word/problem
 * 
 * @author Stéphan R.
 *
 */
public class MatchingWordAndNonWordCharacter {

	/**
	 * Match the pattern xxxXxxxxxxxxxxXxxx
	 * Where x denotes any word character and X denotes any non-word
	 * character
	 */
	private static final String regex = "(\\w{3}\\W{1}\\w{1,}\\W{1}\\w{3})";
}
