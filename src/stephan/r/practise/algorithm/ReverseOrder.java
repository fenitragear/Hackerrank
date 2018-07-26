package stephan.r.practise.algorithm;

public class ReverseOrder {

	/**
	 * @param a
	 * @param length
	 */
	static void printInReverseOrder(int[] a, int length) {
		for(int i = (length - 1); i >= 0; i--) {
			System.out.print(a[i]);
			
			if(i >= 0) {
				System.out.print(" ");
			}
		}
	}
	
	public static void main(String[] args) {
		printInReverseOrder(new int[] { 1, 4, 3, 2 }, 4);
	}
}
