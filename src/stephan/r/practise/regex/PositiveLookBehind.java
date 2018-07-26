package stephan.r.practise.regex;

/**
 * 
 * @author Stéphan R.
 *
 */
public class PositiveLookBehind {

	/**
	 * Match all the occurences of digit which are
	 * immediately preceded by odd digit
	 */
	private static final String regex = "(?<=[13579])\\d";
}
