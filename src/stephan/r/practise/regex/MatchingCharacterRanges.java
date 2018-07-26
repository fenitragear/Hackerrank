package stephan.r.practise.regex;

/**
 * https://www.hackerrank.com/challenges/matching-range-of-characters/problem
 * 
 * @author Stéphan R.
 *
 */
public class MatchingCharacterRanges {

	/**
	 * Match a string satisfying the following conditions:
	 * 		1/ The string's length is >= 5
	 * 		2/ 1st character must be a lowercase English alphabetic character
	 * 		3/ 2nd character must be a positive digit. Note that we consider zero
	 * 			to be neither positive nor negative
	 * 		4/ 3rd character must not be a lowercase English alphabetic character
	 * 		5/ 4th character must not be an uppercase English alphabetic character
	 * 		6/ 5th character must be an uppercase English alphabetic character
	 */
	private static final String regex = "^[a-z][1-9][^a-z][^A-Z][A-Z].*";
}
