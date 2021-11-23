package programs.strings;

import java.util.Scanner;

public class StringPallindrome {

	public static void main(String args[]) {
		String s;
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
       stringReverse(s);

	}

	public static boolean stringReverse(String s) {
		String rev = "";
		boolean flag = false;
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			rev = rev+ c;

		}
		System.out.println(rev);
		System.out.println(s);
		if (s.equals(rev))
		{
			System.out.println("Given number is pallindrome ");
			flag = true;
		}
		else
		{
			System.out.println("not a pallindrome number ");
		}
		return flag;
	}
}