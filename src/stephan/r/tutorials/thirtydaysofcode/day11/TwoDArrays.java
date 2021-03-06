package stephan.r.tutorials.thirtydaysofcode.day11;

/**
 * https://www.hackerrank.com/challenges/30-2d-arrays/problem
 * 
 * @author Stéphan R.
 *
 */
public class TwoDArrays {

	/**
	 * @param arr
	 * @return
	 */
	static int hourglassSum(int[][] arr) {
		Integer max = null;
		
		for(int i = 0; i < 4; i++) {			
			for(int j = 0; j < 4; j++) {
				int sum = 0;
				
				for(int r = 0; r < 3; r++) {
					int lim = (3 - r == 1) ? 3 : 3 - r;
					int s = (lim == 3) ? 0 : 1;
					
					for(int c = s; c < lim; c ++) {
						sum += arr[r + i][c + j];
					}
				}
				
				max = (max == null) ? sum : (sum > max) ? sum : max;
			}
		}		
		
		return max;
    }
	
	public static void main(String[] args) {
		System.out.println(hourglassSum(new int[][] {
			{ 1, 1, 1, 0, 0, 0 },
			{ 0, 1, 0, 0, 0, 0 },
			{ 1, 1, 1, 0, 0, 0 },
			{ 0, 0, 2, 4, 4, 0 },
			{ 0, 0, 0, 2, 0, 0 },
			{ 0, 0, 1, 2, 4, 0 }
		}));
		
		System.out.println(hourglassSum(new int[][] {
			{ -1, 1, -1, 0, 0, 0 },
			{ 0, -1, 0, 0, 0, 0 },
			{ -1, -1, -1, 0, 0, 0 },
			{ 0, -9, 2, -4, -4, 0 },
			{ -7, 0, 0, -2, 0, 0 },
			{ 0, 0, -1, -2, -4, 0 }
		}));
		
		
		System.out.println(hourglassSum(new int[][] {
			{ -1, -1, 0, -9, -2, -2 },
			{ -2, -1, -6, -8, -2, -5 },
			{ -1, -1, -1, -2, -3, -4 },
			{ -1, -9, -2, -4, -4, -5 },
			{ -7, -3, -3, -2, -9, -9 },
			{ -1, -3, -1, -2, -4, -5 }
		}));
	}
}
