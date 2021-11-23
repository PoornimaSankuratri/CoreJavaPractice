package programs.strings;

import java.util.Scanner;

public class NumberOfIntegerValues {

	public static void main(String args[]) {
		String s;
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		numberofIntegers(s);
	}

	public static int numberofIntegers(String s) {
		int count1 = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if (c >= 48 && c <= 57) {
				count1++;
			}
		}
		System.out.println("number of numbers " + count1);
		return count1;
	}

}
