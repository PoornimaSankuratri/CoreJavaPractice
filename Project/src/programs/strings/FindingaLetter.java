package programs.strings;

import java.util.Scanner;

public class FindingaLetter {
	
	public static void main(String args[]) {
		
	
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println("Enter a word to search");
		char c = sc.next().charAt(0);
		
		if(findingaLetter(s, c)) {
			System.out.println(c + " is present in " + s);
		}else{
			System.out.println(c + " is not present in " + s);
		}


}
	public static boolean findingaLetter(String s, char c)
	{
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < s.length(); i++)
		{
			if (c == s.charAt(i))
			{
				return true;
			}
		}
		
		return false;
	}
}