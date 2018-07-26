package stephan.r.practice.algorithm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://www.hackerrank.com/challenges/big-sorting/problem
 * 
 * @author Stéphan R.
 *
 */
public class BigSorting {
	
	/**
	 * @param unsorted
	 * @param length
	 */
	static void bigSorting(String[] unsorted) {
		Arrays.sort(unsorted, new Comparator<String>() {
	        @Override
	        public int compare(String a, String b) {
	            if(a.length() == b.length()){
	                return a.compareTo(b);
	            }
	            
	            return a.length() - b.length();
	        }});
		
		System.out.println(String.join("\n", unsorted));
    }

	public static void main(String[] args) {
		bigSorting(new String[] {"31415926535897932384626433832795", "1", "3", "10", "3", "5" });
	}
}
