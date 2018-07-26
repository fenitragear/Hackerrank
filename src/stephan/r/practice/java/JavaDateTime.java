package stephan.r.practice.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-date-and-time/problem
 * 
 * @author Stéphan R.
 *
 */
public class JavaDateTime {

	/**
	 * @param dd
	 * @param mm
	 * @param yyyy
	 * @return
	 */
	static String getDay(String dd, String mm, String yyyy) {
		Calendar calendar = new GregorianCalendar();
		calendar.set(Integer.valueOf(yyyy), Integer.valueOf(mm) - 1, Integer.valueOf(dd));
		
		return new SimpleDateFormat("EEEEE").format(calendar.getTime()).toUpperCase();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        String day = scanner.next();
        String year = scanner.next();
        
        System.out.println(getDay(day, month, year));
        scanner.close();
	}
}
