package stephan.r.tutorials.thirtydaysofcode.day15;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-linked-list/problem
 * 
 * @author Stéphan R.
 *
 */
public class LinkedList {

	public static Node insert(Node head, int data) {
		if(head == null) {
			return new Node(data);
		} else if(head.next == null) {
	            head.next = new Node(data);
	    } else {
	        insert(head.next, data);
	    }
		
        return head;
    }
	
	public static void display(Node head) {
        Node start = head;
        
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Node head = null;
        int N = scanner.nextInt();

        while(N-- > 0) {
            head = insert(head, scanner.nextInt());
        }
        
        display(head);
        scanner.close();
	}
}

class Node {
	
	int data;
	Node next;
	
	Node(int d) {
        data = d;
        next = null;
    }
}