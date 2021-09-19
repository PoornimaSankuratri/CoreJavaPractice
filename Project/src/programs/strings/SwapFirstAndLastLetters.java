package programs.strings;

import java.util.Scanner;

public class SwapFirstAndLastLetters {

	public static void main(String args[])
	{
		String s;
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		swapFirstAndLastLetters(s);
	}
	public static void swapFirstAndLastLetters(String s)
	{
		int i = s.length()-1;
		char c = s.charAt(i);
		String s1="";
		String s2="";
		String s3 = "";
		char ch;
		for (int j = 1; j < i; j++)
		{
			ch = s.charAt(j);
			s1 = s1 + ch;
		}
		int k = 0;
		char ch1 = s.charAt(k);
		s2 = c + s1;
		s3 = s2 + ch1;
		System.out.println(s3);
	}
	
}
