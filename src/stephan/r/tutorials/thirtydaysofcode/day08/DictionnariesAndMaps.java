package stephan.r.tutorials.thirtydaysofcode.day08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 * 
 * @author Stéphan R.
 *
 */
public class DictionnariesAndMaps {

	private static Map<String, Integer> map = new HashMap<String, Integer>();
	
	/**
	 * @param key
	 * @return
	 */
	static String find(String key) {
		return (map.get(key) != null) ? key + "=" + map.get(key) : "Not found";
	}
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++) {
            map.put(in.next(), in.nextInt());
        }
        
        while(in.hasNext()) {
            System.out.println(find(in.next()));
        }
        
        in.close();
    }
}
