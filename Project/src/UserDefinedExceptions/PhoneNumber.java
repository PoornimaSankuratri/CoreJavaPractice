package UserDefinedExceptions;

import java.util.Scanner;

public class PhoneNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		try {
			if (s.length() != 10) {
				throw new UserDefinedException("Please enter 10 digit phone number");
			}
		} catch (UserDefinedException e) {
			System.out.println(e);
		}
		try {
			if (s.length() == 10)
				for (int i = 0; i < s.length(); i++) {
					char ch = s.charAt(i);
					if (!(ch >= 48 && ch <= 57)){
						throw new UserDefinedException("Please enter numbers beetween 0 to 9");
					}
				}
		} catch (UserDefinedException e) {
			System.out.println(e);
		}
	}
}
