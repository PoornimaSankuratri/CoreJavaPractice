package programs.strings;

import java.util.Scanner;

public class NumberOfVowels {

	public static void main(String args[]) {
		String s;
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
        vowels(s);
	}
	public static void vowels(String s)
	{
	    int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			{
				System.out.println(c);
				count ++;
			}
		}
		System.out.println(count);
	}
}
