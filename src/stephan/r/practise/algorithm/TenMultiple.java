package stephan.r.practise.algorithm;

public class TenMultiple {

	/**
	 * @param n
	 */
	static void multiplicationTable(int n) {		
		for(int i = 1; i <= 10; i++) {
			System.out.println(String.format("%d x %d = %d", n, i, (n * i)));
		}
	}
	
	public static void main(String[] args) {
		multiplicationTable(2);
	}
}
