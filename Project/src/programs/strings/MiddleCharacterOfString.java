package programs.strings;

import java.util.Scanner;

public class MiddleCharacterOfString {

	public static void main(String args[]) {
		String s;
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		System.out.println(middleCharacterOfString(s));
	}

	public static char middleCharacterOfString(String s) {
		/*
		 * int i=s.length(); int j = i/2; char c = s.charAt(j); System.out.println(c);
		 */
		
		return s.charAt(s.length() /2 );
	}
}
