package stephan.r.tutorials.thirtydaysofcode.day01;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-data-types/problem
 * 
 * @author Stéphan R.
 *
 */
public class DataTypes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";      
        
        System.out.println(i + scan.nextInt());
        System.out.println(String.format("%.1f", (d + scan.nextDouble())));
        scan.nextLine();
        System.out.println(s + scan.nextLine());
        
        scan.close();
	}
}
