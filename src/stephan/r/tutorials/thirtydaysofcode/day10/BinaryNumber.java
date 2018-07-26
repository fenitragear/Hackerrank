package stephan.r.tutorials.thirtydaysofcode.day10;

/**
 * https://www.hackerrank.com/challenges/30-binary-numbers/problem
 * 
 * @author Stéphan R.
 *
 */
public class BinaryNumber {

	/**
	 * @param n
	 * @return
	 */
	static int toBinary(int n) {
		int x = 0;
		int temp = 0;
		
		while(n > 0) {
			int t = n % 2;
			n /= 2;	
			
			if(t == 1) {
				x++;
			} else {
				temp = (x > temp) ? x : temp;
				x = 0;				
			}
		}
		
		return (x > temp) ? x : temp;
	}
	
	public static void main(String[] args) {
		System.out.println(toBinary(4));
		System.out.println(toBinary(5));
		System.out.println(toBinary(11));
		System.out.println(toBinary(13));
		System.out.println(toBinary(14));
		System.out.println(toBinary(15));
		System.out.println(toBinary(9999999));
	}
}
