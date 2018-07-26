package stephan.r.practice.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/linkedin-practice-dictionaries-and-maps/problem
 * 
 * @author Stéphan R.
 *
 */
public class MapKeyValue {

	private static Map<String, Integer> map = new HashMap<String, Integer>();
	
	/**
	 * @param key
	 * @return
	 */
	static String find(String key) {
		Integer result = map.get(key);
		return (result != null) ? key + "=" + result : "Not found";
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
                
        while(scanner.hasNext()) {
        	if(i++ < n) {
        		map.put(scanner.next(), scanner.nextInt());
        	} else {
        		System.out.println(find(scanner.next()));
        	}            
        }
        
        scanner.close();
	}
}
