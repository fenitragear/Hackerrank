package stephan.r.practice.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/find-a-word/problem
 * 
 * @author Stéphan R.
 *
 */
public class FindAWord {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] s = new String[n];
        
        for(int i = 0; i < n; i++) {
            s[i] = scanner.nextLine();            
        }

        int t = scanner.nextInt();
        scanner.nextLine();
        
        for(int q = 0; q < t; q++) {
            String querie = scanner.nextLine();
            int count = 0;
            
            for(int r = 0; r < n; r++) {
                Pattern pattern = Pattern.compile("(?<![_aA-zZ])" + querie + "(?![_aA-zZ])");
                Matcher matcher = pattern.matcher(s[r]);

                while(matcher.find()) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
        
        scanner.close();
	}
}
