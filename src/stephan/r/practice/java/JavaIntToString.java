package stephan.r.practice.java;

import java.security.Permission;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-int-to-string/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaIntToString {

	public static void main(String[] args) {
		DoNotTerminate.forbidExit();
		
		try {			
			Scanner scanner = new Scanner(System.in);
			int n = scanner .nextInt();
			// Just copy the following line
			String s = String.valueOf(n);
			scanner.close();
			   
			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {	
	public static class ExitTrappedException extends SecurityException {
		private static final long serialVersionUID = 1;
	}
	
	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		
		System.setSecurityManager(securityManager);
	}
}
