package UserDefinedExceptions;

import java.util.Scanner;

public class PhoneNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		try {
			if (s.length() != 10) {
				throw new Exception("Please enter 10 digit phone number");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			if (s.length() == 10)
				for (int i = 0; i < s.length(); i++) {
					char ch = s.charAt(i);
					if (ch != 1 || ch != 2 || ch != 3 || ch != 4 || ch != 5 || ch != 6 || ch != 7 || ch != 8 || ch != 9
							|| ch != 0) {
						throw new Exception("Please enter numbers beetween 0 to 9");
					}
				}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
