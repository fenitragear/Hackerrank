package stephan.r.practice.java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-instanceof-keyword/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaInstanceOfKeyword {

	static String count(ArrayList mylist) {		
		int a = 0, b = 0, c = 0;
		  
		for(int i = 0; i < mylist.size(); i++) {			
		    Object element = mylist.get(i);
		     
		    if(element instanceof Student)
		       a++;
		    if(element instanceof Rockstar)
		       b++;
		    if(element instanceof Hacker)
		       c++;
		}
  
  		return Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
	}
	
	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
	    Scanner scanner = new Scanner(System.in);
	    int t = scanner.nextInt();
	    
	    for(int i = 0; i < t; i++) {	    	
	        String s = scanner.next();
	        
	        if(s.equals("Student"))
	        	mylist.add(new Student());
	        
	        if(s.equals("Rockstar"))
	        	mylist.add(new Rockstar());
	        
	        if(s.equals("Hacker"))
	        	mylist.add(new Hacker());
	    }
	    
	    System.out.println(count(mylist));
	}
}

class Student {}
class Rockstar {}
class Hacker {}