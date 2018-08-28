package stephan.r.practice.java;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-interface/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaInterface {

	@SuppressWarnings("rawtypes")
	static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
	
	public static void main(String[] args) {
		MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        
      	scanner.close();
	}
}

interface AdvancedArithmetic {
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 1;
        
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        } 
        
        return sum;
    }
}
