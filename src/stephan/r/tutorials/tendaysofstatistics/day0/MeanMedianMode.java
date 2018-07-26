package stephan.r.tutorials.tendaysofstatistics.day0;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/s10-basic-statistics/problem
 * 
 * @author Stéphan R.
 *
 */
public class MeanMedianMode {

	public static void main(String[] args) {
		int n = 20;
        String val = "6392 51608 71247 14271 48327 50618 67435 47029 61857 22987 64858 99745 75504 85464 60482 30320 11342 48808 66882 40522";
        String[] aStr = val.split(" ");
        double[] a = new double[n];
        double mean = 0.0;
        double mode = 0.0;
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            a[i] = Double.parseDouble(aStr[i]);
            mean += a[i];
            
            Pattern pattern = Pattern.compile("(\\D" + aStr[i] + "\\D)");
            Matcher matcher = pattern.matcher(" " + val + " ");            
            int c = -1;
            
            while(matcher.find()) {
                c++;
            }
            
            if(count == 0) {
                count = c;
                mode = a[i];                
            } else {
                if(c > count) {
                    count = c;
                    mode = a[i];
                } else if(c == count && mode >= a[i]) {
                    count = c;
                    mode = a[i];
                }
            }
        }
        
        // Mean   
        System.out.println(String.format("%.1f", mean/n));
        
        // Median
        Arrays.sort(a);
        int mid = n / 2;
        double median = (n % 2 == 0) ? (a[mid - 1] + a[mid])/ 2 : a[mid];
     
        System.out.println(String.format("%.1f", median));
        
        // Mode
         System.out.println(String.format("%.1f", (count == 0) ? a[0] : mode));
	}
}
