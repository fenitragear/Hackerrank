package stephan.r.practice.algorithm;

public class ConcealedSquare {

	public static void main(String[] args) {
		//int n = 4;
		String strMin = "1 2 3 4".replaceAll(" ", "0");
		//String strMax = "1 2 3 4".replaceAll(" ", "9");
		double min =  Math.sqrt(Integer.parseInt(strMin));
		//int max = Integer.parseInt(strMax);
		
		
		while(min % 2 != 0) {
			min = (int)min + 1.0;
		}	
		
		System.out.println(min);
	}
}
