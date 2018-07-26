package stephan.r.practice.java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaStaticInitializerBlock {

	static Scanner scanner = new Scanner(System.in);
    static boolean flag = true;
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();

    static {
        try{
            if(B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
	public static void main(String[] args) {
		if(flag) {
			System.out.print(B * H);
		}
	}
}
