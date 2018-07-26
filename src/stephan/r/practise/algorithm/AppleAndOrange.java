package stephan.r.practise.algorithm;

public class AppleAndOrange {

	/**
	 * @param s
	 * @param t
	 * @param a
	 * @param b
	 * @param apples
	 * @param oranges
	 */
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int countApples = 0;
		int countOranges = 0;
		
		for(int i = 0; i < apples.length; i++) {				
			if(apples[i] >= 0 && apples[i] >= (s - a)) {
				countApples++;
			}		
		}
		
		for(int i = 0; i < oranges.length; i++) {
			if(oranges[i] < 0 && oranges[i] <= (t - b)) {
				countOranges++;
			}
		}
		
		System.out.println(countApples);
		System.out.println(countOranges);
    }
	
	public static void main(String[] args) {
		int[] apples = new int[] { -2, 2, 1 };
		int[] oranges = new int[] { 5, -6 };
		
		countApplesAndOranges(7, 11, 5, 15, apples, oranges);
	}
}
