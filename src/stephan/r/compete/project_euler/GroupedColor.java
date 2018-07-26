package stephan.r.compete.project_euler;

public class GroupedColor {

	static long factorial(long a) {
		long fact = 1;
		
		for(int i = 1; i <= a; i++) {
			fact *= i;
		}
		
		return fact;
	}
	
	static long arrangement(long a, long b) {
		return (long) ((factorial((a + (b - 1))) / (factorial(a) * factorial(b - 1))) % (Math.pow(10, 9) + 7));
	}
	
	public static void main(String[] args) {
		System.out.println(arrangement(3, 1));
	}
}
