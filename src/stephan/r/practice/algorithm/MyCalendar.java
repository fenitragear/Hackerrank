package stephan.r.practice.algorithm;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar {
	
	/**
	 * @param dd
	 * @param mm
	 * @param yyyy
	 * @return
	 */
	static String getDate(String dd, String mm, String yyyy) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE"); 
		Calendar calendar = new GregorianCalendar();
		calendar.set(Integer.valueOf(yyyy), Integer.valueOf(mm) - 1, Integer.valueOf(dd));
		String dayOfWeek = dateFormat.format(calendar.getTime());
		
		return dayOfWeek.toUpperCase();
	}
	
	public static void main(String[] args) {
		System.out.println(getDate("05", "08", "2015"));
	}
}
