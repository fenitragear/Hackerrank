package stephan.r.compete.project_euler;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler011
 * 
 * @author Stéphan R.
 *
 */
public class LargestProductInAGrid {
	
	private static int[][] grid = new int[20][20];
	
	static long runLeftRight() {
		long product = 1;
		
		for(int r = 0; r < grid.length; r++) {
			long current = 1;
			int count = 1;
			int cStep = 0;
			int c = 0;
			
			while((c + 4) <= grid.length) {
				current *= grid[r][cStep++];
				
				if(count++ == 4) {
					product = (product < current) ? current : product;
					current = 1;
					count = 1;
					cStep = ++c;
				}
			}
		}
		
		return product;
	}
	
	static long runTopBottom() {
		long product = 1;
		
		for(int c = 0; c < grid.length; c++) {
			long current = 1;
			int count = 1;
			int rStep = 0;
			int r = 0;
						
			while((r + 4) <= grid.length) {
				current *= grid[rStep++][c];
				
				if(count++ == 4) {
					product = (product < current) ? current : product;
					current = 1;
					count = 1;
					rStep = ++r;
				}
			}
		}
		
		return product;
	}
	
	static long runDiagonalLeft() {
		long product = 1;
		
		for(int r = 0; r < grid.length; r++) {
			long current = 1;
			int count = 1;
			int cStep = 0;
			int c = 0;
			int rStep = 0;
						
			while((c + 4) <= grid.length && (r + 4) <= grid.length) {
				current *= grid[rStep++][cStep++];
				
				if(count++ == 4) {
					product = (product < current) ? current : product;
					current = 1;
					count = 1;
					cStep = ++c;
					rStep = r;
				}
			}
		}
		
		return product;
	}
	
	static long runDiagonalRight() {
		long product = 1;
		
		for(int r = 0; r < grid.length; r++) {
			long current = 1;
			int count = 1;
			int cStep = grid.length - 1;
			int c = grid.length - 1;
			int rStep = r;
			
			while(c >= 3 && (r + 4) <= grid.length) {				
				current *= grid[rStep++][cStep--];
				
				if(count++ == 4) {
					product = (product < current) ? current : product;
					current = 1;
					count = 1;
					cStep = --c;
					rStep = r;					
				}
			}
		}
		
		return product;
	}

	static long largestProduct() {
		return Math.max(Math.max(runDiagonalLeft(), runDiagonalRight()), Math.max(runLeftRight(), runTopBottom()));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        for(int r = 0; r < 20; r++) {
            for(int c = 0; c < 20; c++) {
                grid[r][c] = scanner.nextInt();
            }
        }
        
        long start = System.currentTimeMillis();
		
		System.out.println(largestProduct());
		System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
        
        scanner.close();
	}
}
