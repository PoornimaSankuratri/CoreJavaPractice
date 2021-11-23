package programs.strings;

import java.util.Scanner;

/**
 * 
 * @author Poornima
 *
 */
public class ReverseFirstHalfString {

	public static void main(String args[]) {
		String s;
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		reverseFirstHalfString(s);
	}

	/**
	 * 
	 * @param s
	 */
	public static String reverseFirstHalfString(String s) {
		int i = s.length();
		String s1 = "";
		String s2 = "";
		String s3 = "";
		int k = i / 2;
		for (int j = i / 2 - 1; j >= 0; j--) {
			char c = s.charAt(j);
			s1 = s1 + c;
		}
		for (int l = k; l < i; l++) {
			char ch = s.charAt(l);
			s2 = s2 + ch;
		}
		System.out.println(s1);
		System.out.println(s2);
		s3 = s1 + s2;
		System.out.println(s3);
		return s3;
	}

	public static String reverseFirstHalfOfString1(String str) {

	
		String temp = "";
		for (int i = str.length() / 2 - 1; i >= 0; i--) {

			temp += str.charAt(i);
		}
		for (int i = str.length() / 2 ; i < str.length(); i++) {

			temp += str.charAt(i);
		}
		
		System.out.println(temp);
		return temp;
	}

}
