package stephan.r.practice.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/tag-content-extractor/problem
 * 
 * @author Stéphan R.
 *
 */
public class TagContentExtractor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = Integer.parseInt(scanner.nextLine());
        
		while(testCases-- > 0) {
			String line = scanner.nextLine();            
            boolean matchFound = false;
            
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            
            if (!matchFound) {
                System.out.println("None");
            }
		}
		
		scanner.close();
	}
}
