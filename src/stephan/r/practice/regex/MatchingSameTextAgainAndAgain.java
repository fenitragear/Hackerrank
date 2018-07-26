package stephan.r.practice.regex;

/**
 * https://www.hackerrank.com/challenges/matching-same-text-again-again/problem
 * 
 * @author Stéphan R.
 *
 */
public class MatchingSameTextAgainAndAgain {

	/**
	 * Match string S with the following conditions:
	 * 		1/ S must be of length 20
	 * 		2/ 1st character: lowercase letter
	 * 		3/ 2nd character: word character
	 * 		4/ 3rd character: whitespace character
	 * 		5/ 4th character: non word character
	 * 		6/ 5th character: digit
	 * 		7/ 6th character: non digit
	 * 		8/ 7th character: uppercase letter
	 * 		9/ 8th character: letter (either lowercase or uppercase)
	 * 		10/ 9th character: vowel (a, e, i, o, u, A, E, i, O, U)
	 * 		11/ 10th character: non whitespace character
	 * 		12/ 11th character: should be same as 1st character
	 * 		13/ 12th character: should be same as 2nd character
	 * 		14/ 13th character: should be same as 3rd character
	 * 		15/ 14th character: should be same as 4th character
	 * 		16/ 15th character: should be same as 5th character
	 * 		17/ 16th character: should be same as 6th character
	 * 		18/ 17th character: should be same as 7th character
	 * 		19/ 18th character: should be same as 8th character
	 * 		20/ 19th character: should be same as 9th character
	 * 		21/ 20th character: should be same as 10th character
	 */
	private static final String regex = "(\\p{Ll}{1})(\\w{1})(\\s)(\\W{1})(\\d{1})(\\D{1})(\\p{Lu}{1})(\\p{L}{1})([aeiouAEIOU]{1})(\\S)\\1\\2\\3\\4\\5\\6\\7\\8\\9\\10";
}
