package stephan.r.practise.algorithm;

public class HighestValuePalindrome {
	
	/**
	 * @param text
	 * @return
	 */
	static int hammingDist(String a, String b) {
	    int i = 0;
	    int count = 0;
	    
	    while (i < a.length()) {
	        if (a.charAt(i) != b.charAt(i))
	            count++;
	        
	        i++;
	    }
	    
	    return count;
	}
	
	/**
	 * @param s
	 * @param n
	 * @param k
	 * @return
	 */
	static String highestValuePalindrome(String s, int n, int k) {
		int mid = Math.abs(s.length() / 2);
		StringBuilder a = new StringBuilder(s.toLowerCase().substring(0, (mid == 0) ? 1 : mid));
        StringBuilder b = new StringBuilder(s.toLowerCase().substring(mid, s.length())).reverse();
		int index = 0;
		int distance = hammingDist(a.toString(), b.toString());
				
		// Check distance
		if(distance <= k) {
			// Perform a palindrome til k is reached
			while(k > 0) {
				if(index == a.length() && index == b.length()) {
					index = 0;
				}
				
				String left = a.substring(index, index + 1);
				String right = b.substring(index, index + 1);
				
				if(s.length() > 1) {
					if(!left.equals(right) || (distance == 0 && left.equals(right) && !left.equals("9"))) {
						if(Integer.parseInt(left) > Integer.parseInt(right)) {
							b.setCharAt(index, (distance >= k) ? left.charAt(0) : '9');
						} else if(Integer.parseInt(left) < Integer.parseInt(right)) {
							a.setCharAt(index, (distance >= k) ? right.charAt(0) : '9');
						} else {
							if(k >= 2) {
								a.setCharAt(index, (distance >= k) ? (Integer.parseInt(left) > Integer.parseInt(right)) 
										? left.charAt(0) : right.charAt(0) : '9');
								
								k--;
								
								b.setCharAt(index, (distance >= k) ? (Integer.parseInt(left) < Integer.parseInt(right)) 
										? right.charAt(0) : left.charAt(0) : '9');
							}
						}
						
						k--;
					}
				} else {
					k--;
				}
								
				index++;
			}
		} else {
			return "-1";
		}
				
		return (s.length() > 1) ? new StringBuilder(a.toString()).append(b.reverse().toString()).toString() : "9";
    }

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		System.out.println("Test cases\\n");
		//System.out.println(highestValuePalindrome("3943", 4, 1));
		System.out.println(highestValuePalindrome("092282", 6, 3));
		System.out.println(highestValuePalindrome("0011", 4, 1));
		System.out.println(highestValuePalindrome("5", 1, 1));
		System.out.println(highestValuePalindrome("932239", 6, 2));
		System.out.println(highestValuePalindrome("421", 3, 1));
		
		System.out.println("execution time " + (System.currentTimeMillis() - start) + "ms");
	}
}
