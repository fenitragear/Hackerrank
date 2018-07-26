package stephan.r.practice.java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-stdin-stdout/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaStdinAndStdOutII {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        
        scan.close();
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);  
	}
}
