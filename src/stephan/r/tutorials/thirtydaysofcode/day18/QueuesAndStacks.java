package stephan.r.tutorials.thirtydaysofcode.day18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/30-queues-stacks/problem
 * 
 * @author Stéphan R.
 *
 */
public class QueuesAndStacks {
	
	private Stack<Character> stacks = new Stack<Character>();
	private Queue<Character> queues = new LinkedList<Character>();

	public void pushCharacter(char ch) {
		stacks.push(ch);
	}
	
	public void enqueueCharacter(char ch)  {
		queues.add(ch);
	}
	
	public char popCharacter() {
		return stacks.pop();
	}
	
	public char dequeueCharacter() {
		return queues.remove();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueuesAndStacks p = new QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	}
}
