package stephan.r.practice.regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/detect-the-email-addresses/problem?
 * 
 * @author Stéphan R.
 *
 */
public class DetectTheEmailAddresses {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Set<String> emails = new HashSet<>();
		scanner.nextLine();
		
		for(int l = 0; l < n; l++) {
			String line = scanner.nextLine();
			Pattern pattern = Pattern.compile("(([^<>()\\[\\]\\\\.,;:\\s@\"]+(\\.[^<>()\\[\\]\\\\.,;:\\s@\"]+)*)|(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))");
			Matcher matcher = pattern.matcher(line);
			
			while(matcher.find()) {
				emails.add(matcher.group(0));
			}
		}
		
		List<String> sortedList = new ArrayList<String>(emails);
		Collections.sort(sortedList);
		
		System.out.println(String.join(";", sortedList));
		scanner.close();
	}
}
