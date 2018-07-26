package stephan.r.tutorials.crackingthecodeinterview.techniquesconceptes;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/ctci-lonely-integer/problem
 * 
 * @author Stéphan R.
 *
 */
public class BitManipulations {

	/**
	 * @param arr
	 * @return
	 */
	static int findLonely(List<Integer> arr) {
		int reminder = 0;
		
		for(Integer a : arr) {
			reminder ^= a;
		}
		
		return reminder;
    }
	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(1);
		
		System.out.println(findLonely(arr));
	}
}
