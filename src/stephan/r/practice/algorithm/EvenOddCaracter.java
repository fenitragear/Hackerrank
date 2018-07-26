package stephan.r.practice.algorithm;

public class EvenOddCaracter {

	/**
	 * @param s
	 */
	static void print(String s) {
		StringBuilder even = new StringBuilder();
		StringBuilder odd = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++) {
			if(i % 2  == 0) {
				even.append(s.charAt(i));
			} else {
				odd.append(s.charAt(i));
			}
		}
		
		System.out.println(even + " " + odd);
	}
	
	public static void main(String[] args) {
		print("Hacker");
		print("Rank");
	}
}
