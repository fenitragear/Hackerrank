package stephan.r.practice.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-list/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer>  l = new ArrayList<Integer>();
        
        // Store items into list
        for(int i = 0; i < n; i++) {
            l.add(scanner.nextInt());
        }
        
        int q = scanner.nextInt();
        
        // Perform action: insert and delete
        for(int i = 0; i < q; i++) {
            scanner.nextLine();
            
            if(scanner.nextLine().equals("Insert")) {
                l.add(scanner.nextInt(), scanner.nextInt());
            } else {
                l.remove(scanner.nextInt());
            }
        }
        
        // Reading
        for(Integer item : l) {
            System.out.print(item + " ");
        }
        
        scanner.close();
	}
}
