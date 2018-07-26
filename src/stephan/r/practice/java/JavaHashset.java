package stephan.r.practice.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/java-hashset/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaHashset {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = scanner.next();
            pair_right[i] = scanner.next();
        }

        Set<String> sets = new HashSet<String>();
        
        for(int i = 0; i < t; i++) {
            sets.add(pair_right[i] + " " + pair_left[i]);
            System.out.println(sets.size());
        }
        
        scanner.close();
	}
}
