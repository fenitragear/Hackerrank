package stephan.r.tutorials.thirtydaysofcode.day14;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-scope/problem
 * 
 * @author Stéphan R.
 *
 */
public class Scope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        sc.close();

        Difference difference = new Difference(a);
        difference.computeDifference();

        System.out.print(difference.maximumDifference);
	}
}

class Difference {
	
  	private int[] elements;
  	public int maximumDifference;
  	
  	public Difference(int[] a) {
  		this.elements = a;
  	}
  	
  	/**
  	 * Absolute difference between two integers a and b
  	 * |a - b|
  	 */
  	public void computeDifference() {
  		for(int i = 0; i < this.elements.length; i++) {
  			for(int j = 0; j < this.elements.length; j++) {
  				maximumDifference = Math.max(maximumDifference, Math.abs(this.elements[i] - this.elements[j]));
  			}
  		}
  	}
}