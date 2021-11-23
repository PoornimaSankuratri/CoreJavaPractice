package UserDefinedExceptions;

import java.util.Scanner;

public class Name {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		try {
			if (s.isEmpty()) {
				throw new UserDefinedException("Username is null");
			}
		} catch (UserDefinedException e) {
			System.out.println(e);
			System.out.println("please enter valid username");
		}
		s = sc.nextLine();
		try {
			{
				for (int i = 0; i < s.length(); i++) {
					char ch = s.charAt(i);
					System.out.println(ch);
					if ((ch >= 32 && ch <= 64) || (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 126)) {
						throw new UserDefinedException(ch + " is invalid character");
					}
				}
			}
		} catch (UserDefinedException e) {
			System.out.println(e);
			System.out.println("please enter valid Name");
		}

	}
}
