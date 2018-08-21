package stephan.r.practice.algorithm;

/**
 * TODO
 * @author St�phan R.
 *
 */
public class MagicSquare {

	/**
	 * Forming magic square on a 3 x 3 matrix
	 * 
	 * @param s
	 * @return
	 */
	static int formingMagicSquare(int[][] s) {
		int cost = 0;
		int rowTopleft = s[0][0] + s[0][1] + s[0][2];
		int columnTopleft = s[0][0] + s[1][0] + s[2][0];
		
		int rowLastBottom = s[2][0] + s[2][1] + s[2][2];
		int columnLastBottom = s[0][2] + s[1][2] + s[2][2];
		
		int rowMid = s[1][0] + s[1][1] + s[1][2];
		int colMid = s[0][1] + s[1][1] + s[2][1];
		
		int diagonalTopLeftBottomRight = s[0][0] + s[1][1] + s[2][2];
		int diagonalTopRightBottomLeft = s[0][2] + s[1][1] + s[2][0];
		
		int magicConstant = 15;
		
		int average = (rowTopleft + columnTopleft + rowLastBottom + columnLastBottom + diagonalTopLeftBottomRight + diagonalTopRightBottomLeft
				+ rowMid + colMid)/9;
		int l = magicConstant - average;
		
		for(int r = 0 ; r < s[0].length; r++) {
			int sumValColumn = 0;
			
			for(int c = 0; c < s[1].length; c++) {
				sumValColumn += (s[r][c]);
			}
			
			cost += (sumValColumn < magicConstant) ? (sumValColumn ^ magicConstant) : (sumValColumn % magicConstant);
		}
				
		return (cost < magicConstant) ? cost : cost % magicConstant;
    }
	
	public static void main(String[] args) {
		/*System.out.println(formingMagicSquare(new int[][] {
			{ 5, 3, 4 },
			{ 1, 5, 8 },
			{ 6, 4, 2 }
		}));
		System.out.println(formingMagicSquare(new int[][] {
			{ 4, 9, 2 },
			{ 3, 5, 7 },
			{ 8, 1, 5 }
		}));
		System.out.println(formingMagicSquare(new int[][] {
			{ 4, 8, 2 },
			{ 4, 5, 7 },
			{ 6, 1, 6 }
		}));*/
		System.out.println(formingMagicSquare(new int[][] {
			{ 4, 5, 8 },
			{ 2, 4, 1 },
			{ 1, 9, 7 }
		}));
		System.out.println(formingMagicSquare(new int[][] {
			{ 7, 2, 9 },
			{ 6, 6, 2 },
			{ 5, 1, 2 }
		}));
	}
}
