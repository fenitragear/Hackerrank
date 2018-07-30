package stephan.r.tutorials.crackingthecodeinterview.datastructures;

/**
 * https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/problem
 * 
 * @author Stéphan R.
 *
 */
public class IsThisABinaryTree {

	boolean checkBST(Node root) {
		return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	boolean check(Node n, int min, int max) {
		if(n == null)
			return true;
		
		if(n.data <= min || n.data >= max)
			return false;
		
		return check(n.left, min, n.data) && check(n.right, n.data, max);
	}
}

class Node {
	
    int data;
    Node left;
    Node right;
 }