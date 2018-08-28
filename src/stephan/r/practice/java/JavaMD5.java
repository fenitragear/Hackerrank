package stephan.r.practice.java;

/**
 * https://www.hackerrank.com/challenges/java-md5/problem
 * TODO
 * 
 * @author Stéphan R.
 *
 */
public class JavaMD5 {
	
	// Registres definitions
	private static final int A = 0x67452301;
	private static final int B = (int)0xEFCDAB89L;
	private static final int C = (int)0x98BADCFEL;
	private static final int D = 0x10325476;
	
	private int[] x =  new int[] { 
                7, 12, 17, 22, /* X[ 0..15] */
                5,  9, 14, 20, /* X[16..31] */
                4, 11, 16, 23, /* X[32..47] */
                6, 10, 15, 21, /* X[48..63] */
            };
	
	private int[] t = null;
	
	static class Tools {
		private class Constant {
			/**
			 * Input sinus: floor(abs(sin(i+1))*2^32)
			 * 
			 * @return
			 */
			private int[] init() {
				int[] t = new int[64];
				
				for(int i = 1; i <= t.length; i++) {
					t[i - 1] = Integer.parseUnsignedInt(
								String.valueOf(Math.floor(Math.abs(Math.sin(i)) * (long) Math.pow(2, 32)))
							);
							
				}
				
				return t;
			}
		}
		
		private class Utils {
			private String getHex() {
				return null;
			}
		}
	}
	
	static byte[] padding(String message) {
		byte[] messageByte = message.getBytes();
		
		return null;
	} 
	
	public static void main(String[] args) {
		//MD5.Tools.Constant = MD5.Tools.Constant()
	}
}