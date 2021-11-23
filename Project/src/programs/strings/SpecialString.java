package programs.strings;

import java.util.Scanner;

public class SpecialString {

	public static void main(String args[]) {
		String s;
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		specialString(s);
	}

	public static boolean specialString(String s) {
		boolean flag = false;
		for (int i = 0; i < s.length() - 1; i++) {
			char c = s.charAt(i);
			char ch = s.charAt(i + 1);
			if (isvowel(c) && isvowel(ch)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("special string");
		} else {
			System.out.println("Not a special string");
		}
		return flag;

	}

	public static boolean isvowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U') {
			return true;
		} else {
			return false;
		}
	}
}
