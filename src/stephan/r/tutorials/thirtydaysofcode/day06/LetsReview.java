package stephan.r.tutorials.thirtydaysofcode.day06;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-review-loop/problem
 * 
 * @author Stéphan R.
 *
 */
public class LetsReview {

	/**
	 * @param s
	 */
	static void print(String s) {
		StringBuilder even = new StringBuilder();
		StringBuilder odd = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++) {
			if(i % 2  == 0) {
				even.append(s.charAt(i));
			} else {
				odd.append(s.charAt(i));
			}
		}
		
		System.out.println(even + " " + odd);
	}
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < t; i++) {
            print(scanner.nextLine());
        }
        
        scanner.close();
    }
}
