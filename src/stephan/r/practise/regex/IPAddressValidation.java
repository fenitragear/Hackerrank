package stephan.r.practise.regex;

import java.util.Scanner;

public class IPAddressValidation {

	private static final String IPV4 = "^((2[0-4]\\d|25[0-5]|1\\d\\d|0\\d\\d|0\\d|\\d\\d|\\d)[\\.]){3}(2[0-4]\\d|25[0-5]|1\\d\\d|0\\d\\d|0\\d|\\d\\d|\\d)$";
	private static final String IPV6 = "^([a-fA-F0-9]{0,4}[:]){4,7}([a-fA-F0-9]{0,4})$";
	
	public static void main(String[] args) {
		/*String[] s = new String[] { "This line has junk text.", "121.18.19.20", "2001:0db8:0000:0000:0000:ff00:0042:8329" };
		
		for(int i = 0; i < s.length; i++) {
			if(s[i].matches(IPV4)) {
				System.out.println("IPv4");
			} else if(s[i].matches(IPV6)) {
				System.out.println("IPv6");
			} else {
				System.out.println("Neither");
			}
		}*/
		
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            
            if(s.matches(IPV4)) {
                System.out.println("IPv4");
            } else if(s.matches(IPV6)) {
                System.out.println("IPv6");
            } else {
                System.out.println("Neither");
            }
        }
	}
}
