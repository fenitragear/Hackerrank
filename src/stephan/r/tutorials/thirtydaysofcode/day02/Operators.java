package stephan.r.tutorials.thirtydaysofcode.day02;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-operators
 * 
 * @author Stéphan R.
 *
 */
public class Operators {

	private static final Scanner scanner = new Scanner(System.in);
	
	/**
	 * @param meal_cost
	 * @param tip_percent
	 * @param tax_percent
	 */
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
        System.out.println("The total meal cost is " +
            Math.round(
            meal_cost + ((meal_cost * tip_percent) / 100) + ((meal_cost * tax_percent) / 100)
        ) + " dollars.");
    }
	
    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
