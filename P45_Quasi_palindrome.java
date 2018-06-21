package pro_5;

import java.util.*;

public class P45_Quasi_palindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		leadingZeros(s);

	}

	public static void leadingZeros(String str) {
		int c = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				c++;
			} else {
				break;
			}
		}
		if (c != 0) {
			trailingZeros(str, c);
		} else if (c == 0) {
			trailingZeros(str, 0);
		}

	}

	public static void trailingZeros(String s1, int m) {
		int c = 0;
		for (int i = s1.length() - 1; i >= 0; i--) {
			if (s1.charAt(i) == '0') {
				c++;
			} else {
				break;
			}
		}
		int flag = 0;
		if (c > m) {
			c -= m;
			s1 = s1.substring(0, s1.length() - c);
			flag = 1;
		} else if (m == 0) {

			flag = 1;
			m = c;
			s1 = s1.substring(0, s1.length() - m);
		}
		if (flag == 1 && Palindrome(s1)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	public static boolean Palindrome(String s1) {
		StringBuffer s = new StringBuffer(s1);
		StringBuffer s2 = s.reverse();
		String res = s2.toString();
		if (s1.equals(res)) {
			return true;
		}
		return false;
	}

}
