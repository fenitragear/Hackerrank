package stephan.r.practice.algorithm;

public class Kangaroo {

	/**
	 * @param x1
	 * @param v1
	 * @param x2
	 * @param v2
	 * @return
	 */
	static String kangaroo(int x1, int v1, int x2, int v2) {		
		return ((x2 > x1 && v2 > v1)) ? "NO" : "YES";
    }
	
	public static void main(String[] args) {
		System.out.println(kangaroo(0, 3, 4, 2));
		System.out.println(kangaroo(0, 2, 5, 3));
	}
}
