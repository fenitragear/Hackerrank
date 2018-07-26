package stephan.r.practise.regex;

/**
 * https://www.hackerrank.com/challenges/excluding-specific-characters/problem
 * 
 * @author Stéphan R.
 *
 */
public class ExcludingSpecificCharacters {

	/**
	 * Match string S with the following conditions:
	 * 		1/ S must be of length 6
	 * 		2/ 1st character should not be a digit
	 * 		3/ 2nd character should not be a lowercase vowel
	 * 		4/ 3rd character should not be b, c, D or F
	 * 		5/ 4th character should not be a whitespace character(\r, \n, \t, \f or space)
	 * 		6/ 5th character should not be a uppercase vowel
	 * 		7/ 6th character should not be a . or , symbol
	 */
	private static final String regex = "^[^\\d]{1}[^aeiou]{1}[^bcDF]{1}[^\\r\\n\\t\\f\\s]{1}[^AEIOU]{1}[^.,]$";
}
