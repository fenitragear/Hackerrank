package stephan.r.practice.algorithm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
 * 
 * @author St�phan R.
 *
 */
public class HackerrankIsAString {
	
	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * Check if a specific string s contains the word hackerrank
	 * 
	 * @param s
	 * @return
	 */
	static String hackerrankInString(String s) {
		String hacker = "NO";
		Pattern pattern = Pattern.compile("(h).*(a).*(c).*(k).*(e).*(r).*(r).*(a).*(n).*(k)");
		Matcher matcher = pattern.matcher(s);
		
		while(matcher.find()) {			
			hacker = (matcher.groupCount() == 10) ? "YES" : "NO";
		}		
		
		return hacker;
    }
	
	public static void main(String[] args) {
		int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for (int i = 0; i < q; i++) {
            System.out.println(hackerrankInString(scanner.next()));
        }

        scanner.close();
	}
}
