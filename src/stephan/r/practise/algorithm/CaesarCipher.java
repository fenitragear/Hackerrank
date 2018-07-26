package stephan.r.practise.algorithm;

public class CaesarCipher {

	/**
	 * Caesar's cipher: rotate current character position by k
	 * 
	 * @param s
	 * @param k
	 * @return
	 */
	static String caesarCipher(String s, int k) {
		byte[] b = s.getBytes();
		boolean isUpperCase = false;
		
		for(int i = 0; i < b.length; i++) {
			isUpperCase = (b[i] > 64 && b[i] < 91) ? true : false;
			b[i] = (byte) ((b[i] >= 97 && b[i] <= 122) ? b[i] - 97 
					: (b[i] >= 65 && b[i] <= 90) ? b[i] - 65 : b[i]);
			
			if(b[i] >= 0 && b[i] <= 26) {
				b[i] = (byte) ((isUpperCase) ? ((b[i] + k) % 26) + 65 : ((b[i] + k) % 26) + 97);
			}
		}
		
		return new String(b);
    }
	
	public static void main(String[] args) {
		System.out.println(caesarCipher("middle-Outz", 2));
	}
}
