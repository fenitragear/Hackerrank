package stephan.r.practice.java;

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/phone-book/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaMap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
        HashMap<String, Integer> contact = new HashMap<String, Integer>();
        
		for(int i = 0; i < n; i++) {            
            contact.put(scanner.nextLine(), scanner.nextInt());
			scanner.nextLine();
		}
        
		while(scanner.hasNext()) {
			String name = scanner.nextLine();            
            Integer phone = contact.get(name);
            
            System.out.println((phone != null) ? name + "=" + phone : "Not found");
		}
		
		scanner.close();
	}
}
