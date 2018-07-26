package stephan.r.practise.algorithm;

import java.util.HashMap;
import java.util.Map;

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
		map.put("sam", 99912222);
		map.put("tom", 11122222);
		map.put("harry", 12299933);
		
		System.out.println(find("sam"));
		System.out.println(find("edward"));
		System.out.println(find("harry"));
	}
}
