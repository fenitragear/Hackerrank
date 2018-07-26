package stephan.r.practice.java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-strings-introduction/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaStringsIntroduction {

	/**
	 * @param A
	 * @param B
	 */
	static void performString(String A, String B) {
		System.out.println(A.length() + B.length());
		System.out.println((A.compareTo(B) > 0) ? "Yes" : "No");
		System.out.println(
				String.format("%s %s", A.substring(0, 1).toUpperCase() + A.substring(1, A.length()),
				B.substring(0,  1).toUpperCase() + B.substring(1, B.length()))
			);
	}
    
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        performString(scanner.next(), scanner.next());
        scanner.close();
    }
}
