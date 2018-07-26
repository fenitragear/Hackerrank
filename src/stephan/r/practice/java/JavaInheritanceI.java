package stephan.r.practice.java;

/**
 * https://www.hackerrank.com/challenges/java-inheritance-1/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaInheritanceI {

	public static void main(String[] args) {		
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
	    bird.sing();
	}
}

class Animal{
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}
    
    void sing() {
        System.out.println("I am singing");
    }
}
