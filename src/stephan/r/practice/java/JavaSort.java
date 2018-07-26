package stephan.r.practice.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-sort/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = Integer.parseInt(scanner.nextLine());		
		List<Student> studentList = new ArrayList<Student>();
        
		while(testCases > 0) {			
			studentList.add(new Student(scanner.nextInt(), scanner.next(), scanner.nextDouble()));			
			testCases--;
		}
		
		scanner.close();
      
        Collections.sort(studentList);
        
      	for(Student st: studentList) {
			System.out.println(st.getFname());
		}
	}
}

class Student implements Comparable<Student> {	
	private int id;
	private String fname;
	private double cgpa;
    
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
    
	public int getId() {
		return id;
	}
    
	public String getFname() {
		return fname;
	}
    
	public double getCgpa() {
		return cgpa;
	}
    
    public int compareTo(Student s) {
        if(s.getCgpa() > this.getCgpa()) {
            return 1;
        } else if(s.getCgpa() == this.getCgpa()) {
            if(s.getFname().compareTo(this.getFname()) < 0) {
                return 1;
            } else if(s.getFname().compareTo(this.getFname()) == 0) {
                if(s.getId() > this.getId()) {
                    return 1;
                }
            }
        }
        
        return -1;        
    }
}
