package stephan.r.tutorials.thirtydaysofcode.day04;

/**
 * https://www.hackerrank.com/challenges/30-class-vs-instance/problem
 * 
 * @author Stéphan R.
 *
 */
public class ClassVsInstance {

	public class Person {
		private int age;	
		  
		public Person(int initialAge) {
	        if(initialAge > 0) {
	            this.age = initialAge;
	        } else {
	            this.age = 0;
	            System.out.println("Age is not valid, setting age to 0.");
	        }  		
		}

		public void amIOld() {
	  		if(this.age < 13) {
	             System.out.println("You are young.");
	        } else if(this.age >= 13 && this.age < 18) {
	             System.out.println("You are a teenager.");
	        } else {
	            System.out.println("You are old.");            
	        }
		}

		public void yearPasses() {
	  		this.age++;
		}
	}
}
