package stephan.r.practice.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/duplicate-word/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaRegex2DuplicateWords {

	public static void main(String[] args) {
		String regex = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner scanner = new Scanner(System.in);
        int numSentences = Integer.parseInt(scanner.nextLine());
        
        while (numSentences-- > 0) {
            String input = scanner.nextLine();            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(0), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        scanner.close();
	}
}
