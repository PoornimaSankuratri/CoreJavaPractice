package programs.strings;

import java.util.Scanner;

public class NumberOfCharacters {

	public static void main(String args[]) {
		String s;
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		numberofCharacters(s);
	}

	public static int numberofCharacters(String s) {
		int count = 0, count1 = 0, count2 = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
				count++;
			}
		}
		System.out.println("number of Characters " + count);
		return count;
	}
}
