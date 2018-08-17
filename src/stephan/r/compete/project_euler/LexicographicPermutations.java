package stephan.r.compete.project_euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/projecteuler/challenges/euler024
 * 
 * @author Stéphan R.
 *
 */
public class LexicographicPermutations {
	
	static int[] getFactoradic(int n) {
        int[] factoradic = new int[13];
        int i = 1;
        
        while (n != 0) {
            factoradic[13 - i] = n % i;
            n = n / i;
            i++;
        }
        
        return factoradic;
    }
	
    /**
     * Function takes a String, str and Factoradic representation of a number n.
     * 
     * @param str
     * @param factoradic
     * 
     * @return the nth lexicographic permutaion of character array, str
     */
    static String getPermutation(char[] str, int[] factoradic) {
        Arrays.sort(str);
        ArrayList<Character> res = new ArrayList<Character>();
        StringBuilder sb = new StringBuilder();
        boolean[] used = new boolean[str.length];
        
        for (int i = 0; i < factoradic.length; i++) {
            res.add(getUnusedCharAtPos(str, factoradic[i], used));
        }
        
        for (char some_c : res) {
            sb.append(some_c);
        }
        
        return (sb.toString());
    }
    
    /**
     * function to get the yet unused character at a given position in a character array.
     * 
     * @param str
     * @param pos
     * @param used
     * 
     * @return
     */
    private static char getUnusedCharAtPos(char[] str, int pos, boolean[] used) {
        int count = -1;
        
        for (int i = 0; i < str.length; i++) {
            if (!used[i]) {
                count++;
                
                if (count == pos) {
                    used[i] = true;
                    
                    return str[i];
                }
            }
        }
        
        return ' ';
    }
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();		
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        char[] str = "abcdefghijklm".toCharArray();
        
        for (int i = 0; i < t; i++) {
            System.out.println(getPermutation(str, getFactoradic(scanner.nextInt() - 1)));
        }
		
		System.out.println("Solution took " + (System.currentTimeMillis() - start) + "ms");
		
		scanner.close();		
	}
}
