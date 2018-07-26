package stephan.r.practice.algorithm;

public class MyString {

	/**
	 * @param A
	 * @param B
	 */
	static void performString(String A, String B) {
		System.out.println(A.length() + B.length());
		System.out.println((A.compareTo(B) > 0) ? "Yes" : "No");
		System.out.println(String.format("%s %s", A.substring(0, 1).toUpperCase() + A.substring(1, A.length()),
				B.substring(0,  1).toUpperCase() + B.substring(1, B.length())));
	}
	
	public static void main(String[] args) {
		performString("hello", "java");
	}
}
