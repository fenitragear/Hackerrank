package stephan.r.tutorials.thirtydaysofcode.day12;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-inheritance/problem
 * 
 * @author Stéphan R.
 *
 */
public class Inheritance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}

class Student extends Person {
	
	private int[] testScores;
	
    /**
     * @param firstName - A string denoting the Person's first name.
     * @param lastName - A string denoting the Person's last name.
     * @param id - An integer denoting the Person's ID number.
     * @param scores - An array of integers denoting the Person's test scores.
     */
    public Student(String firstName, String lastName, Integer id, int[] scores) {
    	super(firstName, lastName, id);
    	this.testScores = scores;
    }
    
    /**
     * Compute the average:
     * 		1/ O if 90 <= a <= 100
     * 		2/ E if 80 <= a <= 90
     * 		3/ A if 70 <= a <= 80
     * 		4/ P if 55 <= a <= 70
     * 		5/ D if 40 <= a <= 55
     * 		6/ T if a < 40
     *  
     * @return - a character denoting the grade
     */
    public char calculate() {
    	int average = 0;
    	
    	for(int i = 0; i < this.testScores.length; i++) {
    		average += this.testScores[i];
    	}
    	
    	average /= this.testScores.length;
    	
    	return (average >= 90 && average <= 100) ? 'O' : (average >= 80 && average <= 90) ? 'E' : (average >= 70 && average <= 80) ? 'A' 
    			: (average >= 55 && average <= 70) ? 'P' : (average >= 40 && average <= 55) ? 'D' : 'T';
    }
}

class Person {
	
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	/**
	 * Constructor
	 * 
	 * @param firstName
	 * @param lastName
	 * @param identification
	 */
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	/**
	 * Print person data
	 */
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
}